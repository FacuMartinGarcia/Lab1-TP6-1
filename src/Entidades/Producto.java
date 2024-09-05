package Entidades;


import java.util.Objects;

public class Producto implements Comparable<Producto>{

    private int codigo;
    private String descripcion;
    private String rubro;
    private double precio;
    private int stock;

    public Producto(int codigo, String descripcion, String rubro, double precio, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.rubro = rubro;
        this.precio = precio;
        this.stock = stock;
    }



    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    
    
    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", rubro=" + rubro + ", precio=" + precio + ", stock=" + stock + '}';
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.descripcion);
        hash = 53 * hash + Objects.hashCode(this.rubro);
        hash = 53 * hash + this.codigo;
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
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return Objects.equals(this.rubro, other.rubro);
    }

    @Override
    public int compareTo(Producto o) {
       
        if(codigo== o.codigo){
            
            return 0;
        }else if(codigo > o.codigo){
            return 1;
        }else{
            return -1;
        }
        
    }

    
}
