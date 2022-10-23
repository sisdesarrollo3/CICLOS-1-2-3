using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

using Notas.App.Dominio.Entidades;
using Notas.App.Persistencia.AppRepositorios;
using Notas.App.Persistencia;

namespace Notas.App.Presentacion.Pages.Asignaturas
{
    public class DetallarModel : PageModel
    {
       private readonly IRepositorios _appContext;

        [BindProperty]
        public Asignatura asignatura  { get; set; } 

        public DetallarModel()
        {            
            this._appContext = new Repositorios(new Notas.App.Persistencia.AppContext());
        }
     

        //se ejecuta al presionar Detallar en la lista
        public IActionResult OnGet(int? asignaturaId)
        {
            if (asignaturaId.HasValue)
            {
                asignatura = _appContext.ConsultarAsignatura(asignaturaId.Value);
            }
            if (asignatura == null)
            {
                return RedirectToPage("./NotFound");
            }
            else
                return Page();
        }
    }
}