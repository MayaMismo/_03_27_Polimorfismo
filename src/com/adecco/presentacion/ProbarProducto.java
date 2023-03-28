package com.adecco.presentacion;

import com.adecco.modelo.Producto;
import com.adecco.modelo.ProductoLujo;
import com.adecco.modelo.ProductoNecesidad;

public class ProbarProducto {
//necesito un punto de entrada, escribimos main + intro
    public static void main(String[] args) {
        //ahora quiero instanciar producto de 1 necesidad y producto de lujo
        //Defino una array de productos, tenemos 4 celdas donde almacenar productoNecesidad o productoLujo
        Producto[] productos = new Producto[4];
        //creamos los 4 objetos pero aún no están en el Array
        ProductoNecesidad p1 = new ProductoNecesidad(1, "Arroz", 2);
        ProductoNecesidad p2 = new ProductoNecesidad(2, "Quinoa", 4);
        ProductoLujo p3 = new ProductoLujo(3, "Raton", 12);
        ProductoLujo p4 = new ProductoLujo(4, "Teclado", 20);
        //ahora los ponemos en la Array:
        productos[0] = p1;
        productos[1] = p2;
        productos[2] = p3;
        productos[3] = p4;
        System.out.println("Celda 1: " +productos[0]);
        System.out.println("Celda 2: " +productos[1]);
        System.out.println("Celda 3: " +productos[2]);
        System.out.println("Celda 4: " +productos[3]);
        //para recorrer el ARRAy podemos hacer un BUCLE:
        //for --> Cálculo del IVA
        for (int i=0; i< productos.length; i++){
            System.out.println("Cálculo del IVA FOR: " +productos[i].calcularIva());
        }
        System.out.println("_______________________");
        //for each --> la primera parte es una variable de referencia (una dirección a memoria), no un i(indice)
        for (Producto elemento: productos){ //elemento es mi variable de referencia
            System.out.println("Cálculo del IVA FOR EACH: " +elemento.calcularIva());
        }
        System.out.println("_______________________");
        //while -->
        //do while -->


    }
}
