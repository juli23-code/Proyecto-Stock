package datatypes;

import java.time.LocalDateTime;

public class DtTransaccion {
    private int transaccionId;
    private LocalDateTime fechaHora;
    private Rol tipo;
    private int cantidad;
    private int usuarioId;
    private int productoId;

    public DtTransaccion(int transaccionId, LocalDateTime fechaHora, Rol tipo, int cantidad, int usuarioId,
            int productoId) {
        this.transaccionId = transaccionId;
        this.fechaHora = fechaHora;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.usuarioId = usuarioId;
        this.productoId = productoId;
    }

    public int getTransaccionId() {
        return transaccionId;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public Rol getTipo() {
        return tipo;
    }

    public int getcantidad() {
        return cantidad;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public int getProductoId() {
        return productoId;
    }

    void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    void setTipo(Rol tipo) {
        this.tipo = tipo;
    }

    void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    @Override
    public String toString() {
        return "ID TRANSACCION = " + transaccionId + "\nFECHA/HORA = " + fechaHora +
                "\nTIPO = " + tipo + "\nCANTIDAD CAMBIO = " + cantidad +
                "\nUSUARIO ID = " + usuarioId + "\nPRODUCTO ID = " + productoId;
    } 

}