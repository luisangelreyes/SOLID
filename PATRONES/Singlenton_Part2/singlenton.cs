using System;
using System.Collections.Generic;

public class Producto
{
    public int Codigo;
    public int Cantidad;

    public Producto(int Codigo, int Cantidad)
    {
        Codigo = codigo;
        Cantidad = cantidad;
    }
}

public class AlmacenCentral
{
    public List<Producto> productos = new List<Producto>();

    public AlmacenCentral(){}

    public static AlmacenCentral Instancia => new AlmacenCentral();

    public void RegistrarProducto(Producto producto)
    {
        Productos.Add(producto);
        Console.WriteLine($"Registrado: {producto.Codigo}");
    }

    public void VenderProducto(int codigo, int cantidad)
    {
        Producto producto = Producto.Find(p => p.Codigo == codigo);

        if(producto == null)
        {
            System.Console.WriteLine("Producto no encontrado");
            return;
        }

        producto.Cantidad -= cantidad;
        System.Console.WriteLine($"Venta realizada. Stock: {producto.Cantidad}");
    }

    
}

public class Program
    {
        public static void Main()
        {
            AlmacenCentral.Instancia.RegistrarProducto(new Producto(167,10));
            AlmacenCentral.Instancia.VenderProducto(676,3);
            System.Console.WriteLine(ReferenceEquals(AlmacenCentral.Instancia, AlmacenCentral.Instancia));           
        }
    }