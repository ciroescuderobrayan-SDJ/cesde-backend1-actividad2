package com.example;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        // Validación: si el saldo inicial es negativo, asignar 0
        this.saldo = saldoInicial >= 0 ? saldoInicial : 0;
    }

    // Getters y Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Solo getter para saldo
    public double getSaldo() {
        return saldo;
    }

    // Método depositar
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se depositaron $" + cantidad + ". Saldo actual: $" + saldo);
        } else {
            System.out.println("Error: la cantidad debe ser mayor que 0.");
        }
    }

    // Método retirar
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad debe ser mayor que 0.");
        } else if (cantidad > saldo) {
            System.out.println("Error: fondos insuficientes. Saldo actual: $" + saldo);
        } else {
            saldo -= cantidad;
            System.out.println("Se retiraron $" + cantidad + ". Saldo actual: $" + saldo);
        }
    }
}
