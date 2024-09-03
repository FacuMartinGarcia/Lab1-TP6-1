package Entidades;


import java.util.Objects;




public class Producto {

    private String nombre;
    private double precio;
    private String categoria;


    public Producto(String categoria, String nombre, double precio) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio=precio;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", categoria=" + categoria + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.categoria);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.categoria, other.categoria);
    }



    
    

}
