package com.S302N1;

public class AgenciaBolsa implements Observer {
    private String nombre;

    public AgenciaBolsa(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String message) {
        System.out.println("La Agencia " + nombre + " ha recibido una notificación: " + message);
    }
}
