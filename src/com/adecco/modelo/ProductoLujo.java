package com.adecco.modelo;

public class ProductoLujo extends Producto { //hereda los atributos de Producto

    @Override
    public double calcularIva() {
        return precio * 0.21;
    }

    @Override
    public String toString() {
        return "ProductoLujo{" +
                "idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precio=" + precio +
                '}';
    }
//hacemos los constructores. OJO hacer siempre el vacío
    public ProductoLujo() {
    }

    public ProductoLujo(int idProducto, String nombreProducto, double precio) {
        super(idProducto, nombreProducto, precio);
    }
}

