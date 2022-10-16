// programa controlado por un menú
double nota1=0.0d, nota2=0.0d, nota3=0.0d, promedio=0.0d, mayor=0.0d;

char opcion = '1';
do {
  menu();
  opcion = Console.ReadKey().KeyChar;
  switch (opcion) {
    case '1': leerNotas(); break;
    case '2': salidas(nota1, nota2, nota3, promedio, mayor); break;
    case '3': Console.WriteLine("***OPOCION NO VALIDA <ENTER>**** "); break;
    default: Console.WriteLine("***OPOCION NO VALIDA <ENTER>**** ");  break;
  }

}while(opcion != '3');
Console.WriteLine("*** FIN DEL PROGRAMA <ENTER>**** ");
Console.ReadKey();

void leerNotas (){
    mayor = -9999;
    Console.WriteLine("\nNOTA 1: ");  nota1 = Convert.ToDouble(Console.ReadLine());
    if (nota1 > mayor) mayor = nota1; 
    Console.WriteLine("\nNOTA 2: ");  nota2 = Convert.ToDouble(Console.ReadLine()); 
    if (nota2 > mayor) mayor = nota2;
    Console.WriteLine("\nNOTA 3: ");  nota3 = Convert.ToDouble(Console.ReadLine());
    if (nota3 > mayor) mayor = nota3;
    promedio = (nota1 + nota2 + nota3)/ 3; 
}

//implementacion procedimiento
void salidas(double n1, double n2, double n3, double prom, double may){
   Console.Clear();
   string mensaje = traerMensaje(prom);
   Console.WriteLine("***** MOSTRANDO NOTAS ****");
   Console.WriteLine("NOTA1   NOTA2   NOTA3   PROMEDIO   MENSAJE   NOTA-MAYOR");
   Console.WriteLine($"{n1}    {n2}    {n3}   {prom}     {mensaje}   {mayor}");
   Console.WriteLine("\n\n*** <ENTER>CONTINUAR**** ");
   Console.ReadKey();
}

//implemantacion procedimiento
void menu(){
   Console.Clear();
   Console.WriteLine("*** SISTEMA DE NOTAS **** ");
   Console.WriteLine("[1]. INGRESAR NOTAS");
   Console.WriteLine("[2]. MOSTRAR NOTAS");
   Console.WriteLine("[3]. SALIR");
   Console.WriteLine("OPCION: ");
}

//implementacion funcion para
string traerMensaje (double prom){
   string mensaje = "nada";
   if (prom >= 3) mensaje = "APROBADO";
   else mensaje = "REPROBADO";
   return mensaje;
}

