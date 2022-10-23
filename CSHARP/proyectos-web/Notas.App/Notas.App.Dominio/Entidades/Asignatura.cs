//permisos para validaciones y display
using System.ComponentModel.DataAnnotations;

namespace Notas.App.Dominio.Entidades
{
    public class Asignatura
    {
        //atributos de la clase asignatura - ver diseño
        [Key]
        [Display(Name = "ID")]
        public int id { get; set; }
        [Required]        
        [Display(Name = "Nombre")]
        public string? nombre  { get; set; }
        [Required] 
        [Display(Name = "Intensidad")]
        public int intensidad { get; set; }
    }
}