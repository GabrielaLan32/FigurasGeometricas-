/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER-LENOVO
 */
public class Cuadrado extends FigurasGeometricas {
    private double lado;
    
    //MÉTODO CONSTRUCTOR
    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado(double lado, String nombre, double area, double perimetro) {
        super(nombre, area, perimetro);
        this.lado = lado;
    }
    
    //ENCAPSULAMIENTO

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "DATOS DE CUADRADO:\n"+
                "Nombre de la figura:"+getNombre()+"\n"+
                "Área:"+getArea()+"\n"+
                "Perímetro:"+getPerimetro()+"\n"+
                "Lado:"+getLado();
                
    }

    @Override
    public double calcularArea() {
        setArea(getLado() * getLado());
        return getArea();
    }

    @Override
    public double calcularPerimetro() {
        setPerimetro(4* getLado());
        return getPerimetro();
    }
    
}