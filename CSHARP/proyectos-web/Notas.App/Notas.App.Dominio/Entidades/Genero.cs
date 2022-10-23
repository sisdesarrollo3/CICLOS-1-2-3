//permisos para validaciones y display
using System.ComponentModel.DataAnnotations;

namespace Notas.App.Dominio.Entidades
{
    public class Genero
    {
        //atributos de la clase genero - ver diseño
        [Key]
        [Display(Name = "ID")]
        public int id { get; set; }
        [Required]        
        [Display(Name = "Nombre")]
        public string? nombre  { get; set; }
        [Required] 
        [Display(Name = "Abreviatura")]
        public char abreviatura { get; set; }
    }
}