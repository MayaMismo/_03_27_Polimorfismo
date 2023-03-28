package com.adecco.modelo;

public class ProductoNecesidad extends Producto {
    //RECORDAR: lo único que no se hereda son los contructores

    //vamos directamnete al método del IVA que es lo que cambia
    //Lo hacemos automatico con Generate/Overide Methods y le indico el return que yo quiero:
    @Override
    public double calcularIva() {
        return precio * 0.04;
    } //aquí si tenemos código pq ya no es abstracto

    @Override
    public String toString() {
        return "ProductoNecesidad{" +
                "idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precio=" + precio +
                '}';
    }
    //Generamos el constructor que es lo que no se hereda, por eso lo hacemos llamando al cosntructor de la super clase:

    public ProductoNecesidad() {
    }

    public ProductoNecesidad(int idProducto, String nombreProducto, double precio) {
        super(idProducto, nombreProducto, precio);
    }
}
