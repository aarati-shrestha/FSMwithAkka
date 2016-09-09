The program has implemented Finite State Machine(FSM) with akka in java. Spring Boot has been used to build the application.
The application consists of three states: 
              s1, s2, s3
Initially the application is in state s1, where the transaction objects are added to the list. 
After adding all transaction objects to the list, it is transitioned to next state, where all the objects in the list are shown and the transaction objects are verified.
After completing state s2, it moved to state s3 where the verified objects are shown and the list get emptied.
