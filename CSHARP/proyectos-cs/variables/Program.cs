// See https://aka.ms/new-console-template for more information
Console.Clear();
Console.WriteLine("***** VARIABLES Y TIPOS DE DATOS ****");
int edad = 0;
var estatura = 0d;
char genero = '@';
decimal salario = 0m;

Console.WriteLine("NOMBRE: ");       string nombre = Console.ReadLine();
Console.WriteLine("GENERO[M-F]: ");  genero = Console.ReadKey().KeyChar;

Console.WriteLine("EDAD: ");  edad = Convert.ToInt16(Console.ReadLine());
Console.WriteLine("ESTATURA: ");  estatura = Convert.ToDouble(Console.ReadLine());
Console.WriteLine("SALARIO: ");  salario = Convert.ToDecimal(Console.ReadLine());

Console.Clear();
Console.WriteLine("***** SALIDAS ****");
Console.WriteLine("NOMBRE     GENERO  EDAD  ESTATURA  SALARIO");
Console.WriteLine($"{nombre.ToUpper()}    {genero}    {edad}     {estatura}  {salario}");


Console.WriteLine("<ENTER>para finalizar");
Console.ReadKey();


