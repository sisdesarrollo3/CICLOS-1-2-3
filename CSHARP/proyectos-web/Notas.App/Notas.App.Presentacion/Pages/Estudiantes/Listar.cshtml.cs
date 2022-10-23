using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.AspNetCore.Authorization;
using Microsoft.EntityFrameworkCore;

using Notas.App.Dominio.Entidades;
using Notas.App.Persistencia.AppRepositorios;
using Notas.App.Persistencia;

namespace Notas.App.Presentacion.Pages.Estudiantes
{
    //[Authorize]
    public class ListarModel : PageModel
    {
        private readonly IRepositorios _appContext;
        public IEnumerable<Estudiante> estudiantes {get; set;} 
        //public  Genero genero { get; set; }
        public string buscar;      
        public int generoId;    

        public ListarModel()
        {
            this._appContext = new Repositorios(new Notas.App.Persistencia.AppContext());
        }
       
        public void OnGet()
        {
            estudiantes = _appContext.ListarEstudiantes( buscar );
        }        

        public IActionResult OnPost(string? buscar)
        {
            if(!ModelState.IsValid)
            {
                return Page();
            }
            estudiantes = _appContext.ListarEstudiantes( buscar );
            return Page();
        }

       /*       
        @(Model.genero = Model.ConsultarGenero(1));
        <td>@Model.genero.nombre</td>
        public Genero ConsultarGenero(int? generoId)
        {           
           genero = _appContext.ConsultarGenero( generoId );
           return genero;
        }*/
        
    }
}