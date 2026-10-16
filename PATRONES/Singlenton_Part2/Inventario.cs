public class Inventario
{
    private IAlmacen _almacen;

    public Inventario(IAlmacen)
    {
        _almacen = almacen;
    }
    public bool RegistrarProducto(string nombre, int codigo, double precio, int cantidad)
    {
        if (_almacen.BuscarProducto(codigo) == null)
        {
            Producto nuevo = new Producto(nombre, codigo, precio, cantidad);
            _almacen AgregarProducto(nuevo);
            System.Console.WriteLine("Producto agregado con exito {nombre} con {cantidad}");
            return true;
        }
        return false;
    }
}