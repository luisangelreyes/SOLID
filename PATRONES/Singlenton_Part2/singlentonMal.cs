public class Producto
{
    public string Nombre {get; private set;}

    public int Codigo {get; private set;}
    public double Precio {get; private set;}
    public int Cantidad {get; private set;}

    public Producto(string nombre, int codigo, double precio, int cantidad)
    {
        Nombre = nombre;
        Codigo = codigo;
        Precio = precio;
        Cantidad = cantidad;
    }

public bool ReducirCantidad(int cantidadVendida)
    {
        if(cantidadVendida<0 || cantidadVendida > Cantidad) return false;
        Cantidad -= cantidadVendida;
        return true;
    }

}