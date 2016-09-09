package com.FSM.akka;

import akka.actor.ActorRef;

import com.FSM.ContextContainer;
import com.FSM.FSMBase;
import com.FSM.FSMBase.State;
import com.FSM.config.SpringExtension;
import com.FSM.domain.Transaction;
import com.FSM.domain.Transaction.TransactionState;




public class AkkaInitializer {
	
	private ActorRef actorRef ;
	public AkkaInitializer() {
		SpringExtension ext = ContextContainer.getContext().getBean(SpringExtension.class);
		ext.initialize(ContextContainer.getContext());	
		
		this.actorRef  = AkkaFactory.getActorSystem()
				.actorOf(ext.props("finiteStateMachine"),"fsm");
		
		actorRef.tell(new Transaction(1, 200.0, TransactionState.UNVERIFIED), null);	
		actorRef.tell(new Transaction(2, 698.0, TransactionState.UNVERIFIED), null);
		actorRef.tell(new Transaction(3, 759.0, TransactionState.UNVERIFIED), null);
		actorRef.tell(new Transaction(4, 400.0, TransactionState.UNVERIFIED), null);
		actorRef.tell(new Transaction(5, 358.0, TransactionState.UNVERIFIED), null);
		
		actorRef.tell("end", null);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actorRef.tell("s2", null);
		actorRef.tell("s3", null);
		
	}	
}

