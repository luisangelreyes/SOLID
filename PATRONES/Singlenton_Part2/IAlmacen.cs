using System.Net.Http.Headers;

public interface IAlmacen
{
    List<Produto> ObtenerProductos();
    Producto BuscarProducto(int codigo);

    void AgregarProducto(Producto producto);
}