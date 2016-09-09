package com.FSM;


import akka.actor.UntypedActor;


public  class FSMBase  extends UntypedActor {
	
	 public enum State {
		    S1, S2, S3
		  }
	 
	 private State state = State.S1;
	 
	 protected State getState() {
	    return state;
	  }
	 
	 protected void setState(State s) {
	    if (state != s) {
	      //transition(state, s);
	      state = s;
	    }
	 }

	@Override
	public void onReceive(Object arg0) throws Throwable {
		// TODO Auto-generated method stub
		
	}
}
