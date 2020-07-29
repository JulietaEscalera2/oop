import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Detalle> detalleList1 = new ArrayList<>();
        detalleList1.add(new Detalle("cod1", "cocina", 2, 1000, 10, 1990, "ped1"));
        detalleList1.add(new Detalle("cod2", "lavadora", 1, 2500, 0, 2500, "ped1"));
        detalleList1.add(new Detalle("cod3", "plancha", 5, 300, 50, 1450, "ped1"));

        List<Detalle> detalleList2 = new ArrayList<>();
        detalleList2.add(new Detalle("cod4", "mesa", 2, 700, 30, 1370, "ped2"));
        detalleList2.add(new Detalle("cod5", "muebles", 1, 3500, 0, 3500, "ped2"));
        detalleList2.add(new Detalle("cod6", "comoda", 3, 800, 100, 2300, "ped2"));

        List<Detalle> detalleList3 = new ArrayList<>();
        detalleList3.add(new Detalle("cod7", "camisa", 10, 100, 100, 900, "ped3"));
        detalleList3.add(new Detalle("cod8", "polera", 20, 80, 0, 1600, "ped3"));
        detalleList3.add(new Detalle("cod9", "zapatos", 8, 400, 200, 3000, "ped3"));

        List<Pedido> pedidoList = new ArrayList<>();
        pedidoList.add(new Pedido("ped1", "normal", "Juan Perez", "2020-05-05", detalleList1));
        pedidoList.add(new Pedido("ped2", "programado", "Maria Guaman", "2020-05-03", detalleList2));
        pedidoList.add(new Pedido("ped3", "normal", "Juan Perez", "2020-05-10", detalleList3));

        System.out.println("----------select cliente from Pedido;-------------");

        pedidoList.stream().map(Pedido::getCliente).forEach(System.out::println);

        System.out.println("------Select cliente from Pedido where tipoPedido = “= normal“---------");

        pedidoList.stream().filter(p ->p.getTipoPedido() == "normal").map(Pedido::getCliente)
                .forEach(System.out::println);

        System.out.println("------Select codPedido from Pedido where fecha = 2020-05-05--------");

        pedidoList.stream().filter(p ->p.getFecha() == "2020-05-05").map(Pedido::getCodPedido)
                .forEach(System.out::println);

        System.out.println("---Select prod Pedido where Pedido.codPedido = Detalle.codPedido and "+
                "Pedido.codPedido = ped1---");

        pedidoList.stream()
                .filter(pedido -> pedido.getCodPedido() == "ped1")
                .map(pedido -> pedido.getDetalleList())
                .flatMap(detalles -> detalles.stream())
                .map(detalle -> detalle.getProducto())
                .forEach(System.out::println);

        System.out.println("--Select detalle.producto from Detalle, detalle" +
                " where Pedido.codPedido = Detalle.codPedido and cantidad >8--");

        pedidoList.stream()
                .filter(pedido -> pedido.getCodPedido().equals("ped1"))
                .map(pedido -> pedido.getDetalleList())
                .flatMap(detalle -> detalle.stream())
                .filter(detalle -> detalle.getCantidad() > 8)
                .map(detalle -> detalle.getProducto())
                .forEach(System.out::println);
    }
}