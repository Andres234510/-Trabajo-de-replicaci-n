import edu.sena.Trabajo_de_recopilacion.model.Cliente;
import edu.sena.Trabajo_de_recopilacion.model.Factura;
import edu.sena.Trabajo_de_recopilacion.model.ItemFactura;
import edu.sena.Trabajo_de_recopilacion.model.Producto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Andrés");

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese una descripción de la factura: ");
        String descripcion = s.nextLine();

        System.out.print("Ingrese el folio: ");
        int folio = s.nextInt();

        //System.out.print("Ingrese la fecha: ");
        //Date fecha;
        //fecha = s.nextLine();

        Factura factura = new Factura(folio, descripcion, null, cliente);

        Producto producto;

        System.out.println();

        for(int i = 0; i<2; i++){
            producto = new Producto();
            System.out.print("Ingrese producto nº " + producto.getCodigo() + ": ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            factura.addItemFactura(new ItemFactura(producto, s.nextInt()));

            System.out.println();
            s.nextLine();
        }
        System.out.println(factura);
    }
}
