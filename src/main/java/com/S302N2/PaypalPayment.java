package com.S302N2;

public class PaypalPayment implements PaymentCallback {
    private String email = "usuario@ejemplo.com";
    private String password = "contraseñaSegura";
    private double balance = 1000.00;

    @Override
    public void pay(double amount) {
        if (credentialsAreValid() && sufficientFunds(amount)) {
            processPaypalPayment(amount);
        } else {
            System.out.println("El pago de Paypal falló.");
        }
    }

    private boolean credentialsAreValid() {
        // Para este ejemplo, consideramos que las credenciales son válidas si el correo electrónico contiene un "@" y la contraseña tiene al menos 8 caracteres.
        return email.contains("@") && password.length() >= 8;
    }

    private boolean sufficientFunds(double amount) {
        // Comprobamos si hay suficientes fondos en la cuenta de Paypal para cubrir el pago.
        return balance >= amount;
    }

    private void processPaypalPayment(double amount) {
        balance -= amount;
        System.out.println("Se han pagado " + amount + " con Paypal. El saldo restante es " + balance + ".");
    }
}

