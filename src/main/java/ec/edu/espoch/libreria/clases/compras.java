/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.libreria.clases;

/**
 *
 * @author SO-LAB1-PC28
 */
public class compras {

    private clientes cliente;
    private libros libro; 

    public compras() {
    }
    
    

    public compras(clientes cliente, libros libro) {
        this.cliente = cliente;
        this.libro = libro;
    }

public void mostrarCompra(){
      System.out.println("Cliente" + cliente.getNombre());
        System.out.println("Titulo del libro adquirido" + libro.getTitulo());
        System.out.println("Generos" + libro.getGeneros());
        System.out.println("Precio con IVA" + libro.calcularPrecioConIVA());
        System.out.println("Precio sin IVA" + libro.getPrecio());

}
}