using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

using Notas.App.Dominio.Entidades;
using Notas.App.Persistencia.AppRepositorios;
using Notas.App.Persistencia;

namespace Notas.App.Presentacion.Pages.Generos
{
    public class InsertarModel : PageModel
    {
        private readonly IRepositorios _appContext;
        [BindProperty]
        public Genero genero { get; set; }

        public InsertarModel(){
            //cargar desde la base de datos tabla genero
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
            _appContext.InsertarGenero( genero );

            return Redirect("Listar");
            
        }
    }
}