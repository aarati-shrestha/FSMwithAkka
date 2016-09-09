package com.FSM.akka;

import akka.actor.ActorSystem;

public class AkkaFactory {
	private static ActorSystem actor = ActorSystem.create("AKKASystem");
	
	public static ActorSystem getActorSystem(){
		return actor;
	}
}
