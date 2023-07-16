package com.S302N1;

    public class App {

            public static void main(String[] args) {
                AgenteBolsa agente = new AgenteBolsa();

                AgenciaBolsa agencia1 = new AgenciaBolsa("Agencia1");
                AgenciaBolsa agencia2 = new AgenciaBolsa("Agencia2");

                agente.addObserver(agencia1);
                agente.addObserver(agencia2);

                agente.cambioBolsa("La bolsa ha subido!");

            }



    }
