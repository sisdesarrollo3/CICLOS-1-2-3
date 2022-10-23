//Directivas
using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;

//permisos acceder al modelo de la clase
using Notas.App.Dominio.Entidades;

namespace Notas.App.Persistencia.AppRepositorios
{
    public interface IRepositorios
    {
        //contratos o firmas para los metodos Asignatura        
        Asignatura InsertarAsignatura(Asignatura asignatura);
        IEnumerable<Asignatura> ListarAsignaturas(string? cadena);         
        Asignatura ConsultarAsignatura(int? idAsignatura);
        Asignatura ActualizarAsignatura(Asignatura asignatura);
        void EliminarAsignatura(int idAsignatura); 

        //CRUD genero
        Genero InsertarGenero(Genero asignatura);
        IEnumerable<Genero> ListarGeneros(string? cadena);         
        Genero ConsultarGenero(int? idGenero);
        Genero ActualizarGenero(Genero asignatura);
        void EliminarGenero(int idGenero); 

        //CRUD estudiante
        Estudiante InsertarEstudiante(Estudiante asignatura);
        IEnumerable<Estudiante> ListarEstudiantes(string? cadena);         
        Estudiante ConsultarEstudiante(int? idEstudiante);
        Estudiante ActualizarEstudiante(Estudiante asignatura);
        void EliminarEstudiante(int idEstudiante); 
    }
}

