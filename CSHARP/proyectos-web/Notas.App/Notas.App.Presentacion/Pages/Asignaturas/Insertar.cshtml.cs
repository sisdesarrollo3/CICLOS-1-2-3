using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

using Notas.App.Dominio.Entidades;
using Notas.App.Persistencia.AppRepositorios;
using Notas.App.Persistencia;

namespace Notas.App.Presentacion.Pages.Asignaturas
{
    public class InsertarModel : PageModel
    {
        private readonly IRepositorios _appContext;
        [BindProperty]
        public Asignatura asignatura { get; set; }

        public InsertarModel(){
            //cargar desde la base de datos tabla asignatura
            this._appContext = new Repositorios(new Notas.App.Persistencia.AppContext());
            //cargarTemporales();
        }
       

        void OnGet()
        {
           
        }

        public IActionResult OnPost()
        {
            if(!ModelState.IsValid)
            {
                return Page();
            }
            _appContext.InsertarAsignatura( asignatura );

            return Redirect("Listar");
            
        }
    }
}