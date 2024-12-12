/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.libreria;

import ec.edu.espoch.libreria.clases.clientes;
import ec.edu.espoch.libreria.clases.compras;
import ec.edu.espoch.libreria.clases.libros;
import ec.edu.espoch.libreria.enumeraciones.generos;

/**
 *
 * @author SO-LAB1-PC28
 */
public class Libreria {

    public static void main(String[] args) {

        libros libro1 = new libros("El principito", "Anthony Moreira", 45, generos.EDUCATIVO);
        libros libro2 = new libros("El sapo", "Ribaldo Natip", 80, generos.FICCION);
        
        clientes comprador1= new clientes("Anthony Moreira", 100);
        clientes comprador2= new clientes("Ribaldo nantip", 101);
        
        compras compra = new compras ();
        
        compra.mostrarCompra( libro1);
        compra.mostrarCompra(libro2);
        
    }
}
