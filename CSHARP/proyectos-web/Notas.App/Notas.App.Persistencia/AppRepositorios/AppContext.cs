using Microsoft.EntityFrameworkCore;
using Notas.App.Dominio.Entidades;

namespace Notas.App.Persistencia
{
    public class AppContext  : DbContext
    {
        //un DBSet por cada entidad 
        public DbSet<Asignatura> asignatura { get; set; }
        public DbSet<Genero> genero { get; set; }
        public DbSet<Estudiante> estudiante { get; set; }
  
        //crear el deContext
        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            if (!optionsBuilder.IsConfigured)
            {
            optionsBuilder
           .UseSqlServer("Server=localhost; user id=sa; password=12345; Initial Catalog=BDNotas2;");            
            }
        }        
    }
}

