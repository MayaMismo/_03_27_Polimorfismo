package com.adecco.modelo;

public abstract class Producto { //he convertido la clase a abstract pq puse un método abstract  en calculo del IVA

    //1.Atributos
    protected int idProducto;
    protected String nombreProducto;
    protected double precio;

    //2.Metodos
    //hacemos uno para calcular el IVA
    //public double calcularIva(){
        //return 0; //vamos a marcar aquí IVA=0 pq en los otros ya hemso definido el %. No lo puedo eliminar del todo
        //pq estamos en el PADRE y cuando haga polimorfismo debo poder mandar llamar calcularIVA y lo haga correcto
        //PERO PARA ESTOS CASOS lo correcto es definir un METODO ABSTRACTO:
        public abstract double calcularIva(); //pero para que no de error la CLASE tb DEBE SER ABSTRACT


    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precio=" + precio +
                '}';
    }
    //3.Constructores
    //los generamos automatica

    public Producto() {
    }
    public Producto(int idProducto, String nombreProducto, double precio) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }
    //4.Setters y Getters

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
