package com.example;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1: Constructores y Sobrecarga
        System.out.println("=== Ejercicio 1: Constructores y Sobrecarga ===");
        Libro l1 = new Libro();
        l1.mostrarDetalles(); // Salida esperada con valores por defecto

        Libro l2 = new Libro("Harry Potter", "J.K. Rowling");
        l2.mostrarDetalles();

        Libro l3 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200);
        l3.mostrarDetalles();

        // Ejercicio 2: Encapsulamiento
        System.out.println("\n=== Ejercicio 2: Encapsulamiento ===");
        CuentaBancaria cuenta = new CuentaBancaria("Maria", 500);
        cuenta.depositar(200);
        System.out.println("Saldo: " + cuenta.getSaldo()); // Debería ser 700
        cuenta.retirar(1000); // Debería mostrar error de fondos insuficientes

        // Ejercicio 3: Lógica y Métodos
        System.out.println("\n=== Ejercicio 3: Lógica y Métodos ===");
        Estudiante e = new Estudiante("Pedro", 21, 2.5);
        e.mostrarInfo(); // Debería indicar REPROBADO
    }
}