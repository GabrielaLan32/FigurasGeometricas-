/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER-LENOVO
 */
public class Rombo {
        private double diagonalMayor; // Diagonal mayor del Rombo
    private double diagonalMenor; // Diagonal menor del Rombo
    private double lado;          // Longitud de un lado del Rombo

    // Constructor
    public Rombo(double diagonalMayor, double diagonalMenor, double lado) {
        if (diagonalMayor <= 0 || diagonalMenor <= 0 || lado <= 0) {
            throw new IllegalArgumentException("Las dimensiones deben ser mayores que cero.");
        }
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    // Métodos getters y setters
    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        if (diagonalMayor <= 0) throw new IllegalArgumentException("La diagonal mayor debe ser mayor que cero.");
        this.diagonalMayor = diagonalMayor;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        if (diagonalMenor <= 0) throw new IllegalArgumentException("La diagonal menor debe ser mayor que cero.");
        this.diagonalMenor = diagonalMenor;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado <= 0) throw new IllegalArgumentException("El lado debe ser mayor que cero.");
        this.lado = lado;
    }

    // Método para calcular el área del Rombo
    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    // Método para calcular el perímetro del Rombo
    public double calcularPerimetro() {
        return 4 * lado;
    }

    // Método para representar el objeto como cadena
    @Override
    public String toString() {
        return String.format(
            "Rombo [Diagonal Mayor: %.2f, Diagonal Menor: %.2f, Lado: %.2f, Área: %.2f, Perímetro: %.2f]",
            diagonalMayor, diagonalMenor, lado, calcularArea(), calcularPerimetro()
        );
    }
    
}
