using System;
using System.Collections.Generic;
using System.Linq;
using Microsoft.EntityFrameworkCore;

using Notas.App.Dominio.Entidades; //permisos acceder al modelo de la clase

namespace Notas.App.Persistencia.AppRepositorios
{
    public class Repositorios : IRepositorios
    {
       private readonly AppContext _appContext;
       public IEnumerable<Asignatura> asignaturas {get; set;} 
       public IEnumerable<Genero> generos {get; set;} 
       public IEnumerable<Estudiante> estudiantes {get; set;} 

       public Repositorios(AppContext appContext)
        {
            _appContext = appContext;
        }

        //AQUÍ CADA UNO DE LOS MÉTODOS DEL CRUD, REFERENCIADOS EN LA INTERFACE

        Asignatura IRepositorios.InsertarAsignatura(Asignatura asignatura)
        {
        try
         {
            var adicionado = _appContext.asignatura.Add( asignatura );  //INSERT en la BD
            _appContext.SaveChanges();                  
            return adicionado.Entity;
          }catch
            {
                throw;
            }
        }

        IEnumerable<Asignatura> IRepositorios.ListarAsignaturas(string? cadena)
        {
            if (cadena == null)
                asignaturas = _appContext.asignatura;
            else{
                //busca coincidencias entre los registros y la cadena enviada
                asignaturas = _appContext.asignatura.Where(s => s.nombre.Contains(cadena));   
                //busca solamente los que son exactamente igual a la cadena enviada 
                //asignaturas = _appContext.asignatura.Where(s => s.nombre.Equals(cadena));    
            }
            return asignaturas;
        }

       Asignatura IRepositorios.ConsultarAsignatura(int? id)
       {
            return _appContext.asignatura.FirstOrDefault(p => p.id == id);
       }

       Asignatura IRepositorios.ActualizarAsignatura(Asignatura asignatura)
        {
            var encontrado = _appContext.asignatura.FirstOrDefault(p => p.id == asignatura.id);
            if (encontrado != null)
            {
                encontrado.nombre     = asignatura.nombre;
                encontrado.intensidad = asignatura.intensidad;
                _appContext.SaveChanges();
            }
            return encontrado;
        }

        void IRepositorios.EliminarAsignatura(int id)
        {
            var encontrado = _appContext.asignatura.FirstOrDefault(p => p.id == id);
            if (encontrado == null)
                return;
            _appContext.asignatura.Remove(encontrado);
            _appContext.SaveChanges();
        }

        //CRUD GENERO
        Genero IRepositorios.InsertarGenero(Genero genero)
        {
        try
         {
            var adicionado = _appContext.genero.Add( genero );  //INSERT en la BD
            _appContext.SaveChanges();                  
            return adicionado.Entity;
          }catch
            {
                throw;
            }
        }

        IEnumerable<Genero> IRepositorios.ListarGeneros(string? cadena)
        {
            if (cadena == null)
                generos = _appContext.genero;
            else{
                //busca coincidencias entre los registros y la cadena enviada
                generos = _appContext.genero.Where(s => s.nombre.Contains(cadena));   
                //busca solamente los que son exactamente igual a la cadena enviada 
                //generos = _appContext.genero.Where(s => s.nombre.Equals(cadena));    
            }
            return generos;
        }

       Genero IRepositorios.ConsultarGenero(int? id)
       {
            return _appContext.genero.FirstOrDefault(p => p.id == id);
       }

       Genero IRepositorios.ActualizarGenero(Genero genero)
        {
            var encontrado = _appContext.genero.FirstOrDefault(p => p.id == genero.id);
            if (encontrado != null)
            {
                encontrado.nombre     = genero.nombre;
                encontrado.abreviatura = genero.abreviatura;
                _appContext.SaveChanges();
            }
            return encontrado;
        }

        void IRepositorios.EliminarGenero(int id)
        {
            var encontrado = _appContext.genero.FirstOrDefault(p => p.id == id);
            if (encontrado == null)
                return;
            _appContext.genero.Remove(encontrado);
            _appContext.SaveChanges();
        }

        //CRUD ESTUDIANTE
        Estudiante IRepositorios.InsertarEstudiante(Estudiante estudiante)
        {
        try
         {
            var adicionado = _appContext.estudiante.Add( estudiante );  //INSERT en la BD
            _appContext.SaveChanges();                  
            return adicionado.Entity;
          }catch
            {
                throw;
            }
        }

        IEnumerable<Estudiante> IRepositorios.ListarEstudiantes(string? cadena)
        {
            if (cadena == null)
                estudiantes = _appContext.estudiante;
            else{
                //busca coincidencias entre los registros y la cadena enviada
                estudiantes = _appContext.estudiante.Where(s => s.nombre.Contains(cadena));   
                //busca solamente los que son exactamente igual a la cadena enviada 
                //estudiantes = _appContext.estudiante.Where(s => s.nombre.Equals(cadena));    
            }
            return estudiantes;
        }

       Estudiante IRepositorios.ConsultarEstudiante(int? id)
       {
            return _appContext.estudiante.FirstOrDefault(p => p.id == id);
       }

       Estudiante IRepositorios.ActualizarEstudiante(Estudiante estudiante)
        {
            var encontrado = _appContext.estudiante.FirstOrDefault(p => p.id == estudiante.id);
            if (encontrado != null)
            {
                encontrado.nombre = estudiante.nombre;
                encontrado.mail = estudiante.mail;
                encontrado.movil = estudiante.movil;
                encontrado.genero = estudiante.genero;
                _appContext.SaveChanges();
            }
            return encontrado;
        }

        void IRepositorios.EliminarEstudiante(int id)
        {
            var encontrado = _appContext.estudiante.FirstOrDefault(p => p.id == id);
            if (encontrado == null)
                return;
            _appContext.estudiante.Remove(encontrado);
            _appContext.SaveChanges();
        }

    }
}

