//permisos para validaciones y display
using System.ComponentModel.DataAnnotations;

namespace Notas.App.Dominio.Entidades
{
    public class Estudiante
    {
        //atributos de la clase estudiante - ver diseño
        [Key]        
        [Display(Name = "ID")]
        public int id { get; set; }
        [Required]        
        [Display(Name = "Nro.Identificación")]
        public string? identificacion  { get; set; }
        [Required]        
        [Display(Name = "Nombre")]
        public string? nombre  { get; set; }
        [Required]        
        [Display(Name = "Mail")]
        public string? mail  { get; set; }
        [Required]        
        [Display(Name = "Movil")]
        public string? movil  { get; set; }
        [Required] 
        [Display(Name = "Genero")]
        public int genero { get; set; }
    }
}