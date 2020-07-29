import java.util.List;

public class Pedido {
    private String codPedido;
    private String tipoPedido;
    private String cliente;
    private String fecha;
    private List<Detalle> detalleList;

    public Pedido(String codPedido, String tipoPedido, String cliente, String fecha, List<Detalle> detalleList) {
        this.codPedido = codPedido;
        this.tipoPedido = tipoPedido;
        this.cliente = cliente;
        this.fecha = fecha;
        this.detalleList = detalleList;
    }

    public String getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(String codPedido) {
        this.codPedido = codPedido;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<Detalle> getDetalleList() {
        return detalleList;
    }

    public void setDetalleList(List<Detalle> detalleList) {
        this.detalleList = detalleList;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "codPedido='" + codPedido + '\'' +
                ", tipoPedido='" + tipoPedido + '\'' +
                ", cliente='" + cliente + '\'' +
                ", fecha='" + fecha + '\'' +
                ", detalleList=" + detalleList +
                '}';
    }
}

