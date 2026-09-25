using System;
using System.Collections.Generic;
using System.Linq;
using OCP.Alien;
using OCP.Extenciones;
using OCP.Fabrica;

namespace OCP.Nucleo;

public class GestorDeAliens
{
    private readonly List<(string Nombre, Func<IAlien> Crear, bool Desbloqueado)> _catalogo = new();
    private readonly List<(string Nombre, Func<IAlien> Crear)> _escanearADN = new();
    private readonly Dictionary<Type, Func<IAlien>> _supremos = new();
    private readonly List<(string Nombre, Func<IAlien> Crear)> _fusiones = new();

    public void RegistrarAlien(string nombre, Func<IAlien> creador, bool desbloqueado = true)
    {
        _catalogo.Add((nombre, creador, desbloqueado));
    }

    public void RegistrarSupremo(Type tipoBase, Func<IAlien> creadorSupremo)
    {
        _supremos[tipoBase] = creadorSupremo;
    }

    public void RegistrarFusion(string nombre, Func<IAlien> creadorFusion)
    {
        _fusiones.Add((nombre, creadorFusion));
    }

    public void RegistrarADN(MuestraADN muestra)
    {
        _escanearADN.Add((muestra.Nombre, () => FabricaAlien.CrearDesdeMuestra(muestra)));
    }

    public List<(string Nombre, Func<IAlien> Crear)> ObtenerDesbloqueados()
    {
        var lista = _catalogo
            .Where(a => a.Desbloqueado)
            .Select(a => (a.Nombre, a.Crear))
            .ToList();
        
        lista.AddRange(_escanearADN);
        return lista;        
    }

    public IAlien ElegirAlienAleatorio()
    {
        var todos = ObtenerDesbloqueados();
        if (todos.Count == 0) return null;
        var rnd = new Random();
        return todos[rnd.Next(todos.Count)].Crear();
    }

    public List<(string Nombre, Func<IAlien> Crear)> ObtenerFusion()
    {
        return _fusiones;
    }

    public bool TieneSupremo(IAlien alien) => alien != null && _supremos.ContainsKey(alien.GetType());
    
    public IAlien CrearSupremo(IAlien alien) => _supremos[alien.GetType()]();
}