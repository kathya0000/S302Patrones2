package com.S302N1;

public class AgenteBolsa extends Observable {
    void cambioBolsa(String message){
        notifyObservers(message);
    }
}

