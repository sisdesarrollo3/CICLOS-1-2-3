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

namespace Notas.App.Presentacion.Pages.Asignaturas
{
    //[Authorize]
    public class ListarModel : PageModel
    {
        private readonly IRepositorios _appContext;
        public IEnumerable<Asignatura> asignaturas {get; set;} 
        public string buscar;          

        public ListarModel()
        {
            this._appContext = new Repositorios(new Notas.App.Persistencia.AppContext());
        }
       
        public void OnGet()
        {
            asignaturas = _appContext.ListarAsignaturas( buscar );
        }        

        public IActionResult OnPost(string? buscar)
        {
            if(!ModelState.IsValid)
            {
                return Page();
            }
            asignaturas = _appContext.ListarAsignaturas( buscar );
            return Page();
        }
        
    }
}