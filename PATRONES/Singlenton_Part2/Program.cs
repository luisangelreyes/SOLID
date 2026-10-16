public class Program
{
    public static void Main()
    {
        IAlmacen almacenGlobal = AlmacenCentral.Intancia;

        Inventario empleadoInventario = new Inventario(almacenGlobal);
        Venta empleadoVenta = new Venta(almacenGlobal);

        empleadoInventario.RegistrarProducto("Coca",20.00,1,10);
        empleadoInventario.RegistrarProducto("BuBuLubu",5.00,2,4);
        empleadoInventario.RegistrarProducto("Pepsi",12.00,4,34);
        empleadoInventario.RegistrarProducto("Coca",20.00,1,10);

        empleadoVenta.CobrarProducto(1,4);
        empleadoVenta.CobrarProducto(2,13);
        empleadoVenta.CobrarProducto(3,18);

        var instancia1 = AlmacenCentral.Instancia;
        var instancia2 = AlmacenCentral.Instancia;

        if (ReferenceEquals(instancia1, instacia2))
        {
            System.Console.WriteLine(
                "Ambos apuntan a la misma instancia"
            );
        }

    }
}