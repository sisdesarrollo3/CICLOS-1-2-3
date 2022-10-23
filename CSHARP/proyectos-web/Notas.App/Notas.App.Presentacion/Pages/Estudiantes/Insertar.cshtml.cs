using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

using Notas.App.Dominio.Entidades;
using Notas.App.Persistencia.AppRepositorios;
using Notas.App.Persistencia;

namespace Notas.App.Presentacion.Pages.Estudiantes
{
    public class InsertarModel : PageModel
    {
        private readonly IRepositorios _appContext;
        [BindProperty]
        public Estudiante estudiante { get; set; }
        public IEnumerable<Genero> generos {get; set;} 
        public string buscar;    

        public InsertarModel(){
            //cargar desde la base de datos tabla estudiante
            this._appContext = new Repositorios(new Notas.App.Persistencia.AppContext());
            //cargarTemporales();
        }
       

        /*void OnGet()
        {
           estudiante = new Estudiante();
           
        }*/

        public IActionResult OnGet(int? estudianteId)
        {
            generos = _appContext.ListarGeneros ( buscar );
            if (estudianteId.HasValue)
            {                
                estudiante = _appContext.ConsultarEstudiante(estudianteId.Value);
            }
            else
            {
                
            }
            if (estudiante == null)
            {
                return RedirectToPage("./NotFound");
            }
            else
                return Page();

        }

        public IActionResult OnPost()
        {
            if(!ModelState.IsValid)
            {
                return Page();
            }
            _appContext.InsertarEstudiante( estudiante );

            return Redirect("Listar");
            
        }
    }
}