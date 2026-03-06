package datatypes;

public class DtProducto {
    private int productoId;
    private String nombre;
    private String descripcion;
    private int stockActual;
    private float precio;

    public DtProducto(int productoId, String nombre, String descripcion, int stockActual, float precio) {
        this.productoId = productoId;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stockActual = stockActual;
        this.precio = precio;
    }

    public int getProductoId() {
        return productoId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getStockActual() {
        return stockActual;
    }

    public float getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * Obtiene los detalles del producto
     */

    public String obtenerDetalles() {
        return "ID = " + productoId + "\nNOMBRE = " + nombre + "\nDESCRIPCION = " + descripcion +
                "\nSTOCK = " + stockActual + "\nPRECIO = $" + precio;

    }

}