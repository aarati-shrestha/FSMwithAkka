package com.FSM;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import akka.actor.ActorRef;

import com.FSM.domain.Transaction;
import com.FSM.domain.Transaction.TransactionState;

@Component
@Scope("prototype")
public class FiniteStateMachine extends FSMBase {
	List<Transaction> transactionList = new ArrayList<Transaction>();
	@Override
	public void onReceive(Object arg0)  {
		State currentState =   this.getState();
		switch(currentState){
	    case S1 :
	    	if(arg0 instanceof Transaction){
				transactionList.add((Transaction)arg0);
			}
			else{
				this.setState(State.S2);
			}
			break; 
			
	    case S2 :
	    	System.out.println("Current State: "+currentState);
	    	for(Transaction transaction : transactionList) {
	    		System.out.println(transaction.toString());
	            transaction.setTransactionState(TransactionState.VERIFIED);
	            this.setState(State.S3);
	    	}
        
	       break; 
	       
	    case S3 :
	    	System.out.println("Current State: "+currentState);
	    	for(Transaction transaction : transactionList) {
	            System.out.println(transaction.toString());
	        }
	    	 transactionList = new ArrayList<Transaction>();
	       break; 
	    
	    default : //Optional
	       break;
	}
		
	}
	
	
	
	

}
