/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.libreria.clases;

import ec.edu.espoch.libreria.enumeraciones.generos;

/**
 *
 * @author SO-LAB1-PC28
 */
public class libros {
    private String titulo;
    private String autor;
    private double precio;
    private generos generos;

    public libros() {
    }
    
    
    
    public libros(String titulo, String autor, double precio, generos generos){
        this.titulo= titulo;
        this.autor= autor;
        this.precio= precio;
        this.generos= generos;
    }
public double calcularPrecioConIVA(){
return precio*0.12;
}
    public void mostrarDetalles(){
        System.out.println("Titulo" + titulo);
        System.out.println("Autores" + autor);
        System.out.println("Generos" + generos);
        System.out.println("Precio con IVA" + calcularPrecioConIVA());
        System.out.println("Precio sin IVA" + precio);

}
   public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    public generos getGeneros() {
        return generos;
}
}