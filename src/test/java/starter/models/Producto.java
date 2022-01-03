package starter.models;

public class Producto {

    private String tipoProducto;

    public Producto(String tipoProducto){
        this.tipoProducto = tipoProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
}
