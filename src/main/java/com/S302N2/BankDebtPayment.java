package com.S302N2;

public class BankDebtPayment implements PaymentCallback {
    private String accountNumber = "12345678";
    private double balance = 1000.00;

    @Override
    public void pay(double amount) {
        if (accountNumberIsValid() && sufficientFunds(amount)) {
            processBankDebtPayment(amount);
        } else {
            System.out.println("El pago de la deuda bancaria falló.");
        }
    }

    private boolean accountNumberIsValid() {
        // Un número de cuenta válido para este ejemplo debe tener exactamente 8 dígitos.
        return accountNumber.length() == 8;
    }

    private boolean sufficientFunds(double amount) {
        // Comprobamos si hay suficientes fondos en la cuenta para cubrir el pago.
        return balance >= amount;
    }

    private void processBankDebtPayment(double amount) {
        balance -= amount;
        System.out.println("Se han pagado " + amount + " de la deuda bancaria. El saldo restante es " + balance + ".");
    }
}
