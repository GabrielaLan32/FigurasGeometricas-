/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo;

/**
 *
 * @author USER-LENOVO
 */
public abstract class FigurasGeometricas {
    private String nombre;
    private double area;
    private double perimetro;
    private final double PI=3.1416;
    
    //MÉTODO CONSTRUCTOR

    public FigurasGeometricas() {
    }

    public FigurasGeometricas(String nombre, double area, double perimetro) {
        this.nombre = nombre;
        this.area = area;
        this.perimetro = perimetro;
    }
    
    //MÉTODOS DE ENCAPSULAMIENTO

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getPI() {
        return PI;
    }
    
    //MÉTODOS IMPLEMENTADOS

    @Override
    public String toString() {
        return "DATOS DE LA FIGURA GEOMÉTRICA:\n"+
                "Nombre de la figura:"+getNombre()+"\n"+
                "Área:"+getArea()+"\n"+
                "Perímetro:"+getPerimetro();
                
    }
    
    //MÉTODOS ABSTRACTOS
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
 
}

