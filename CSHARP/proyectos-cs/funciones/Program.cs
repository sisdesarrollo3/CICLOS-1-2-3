/*
calcular un promedio de tres notas ingresadas, adicionalmente indicar si es APROBADA O REPROBADA, y cual es la mayor nota obtenida
ANALISIS
ENTRADAS  :  nota1, nota2, nota3
PROCESOS  :  promedio <- (nota1 + nota2 + nota3) / 3
             mayorNota = nota1
             mayorNota = nota2
             mayorNota = nota3
             mensajeAprobacion = "aprobado"
             mensajeAprobacion = "reprobado"
SALIDAS   :  promedio, mensajeAprobacion, mayorNota
*/
double mayor = -9999;
Console.WriteLine("*** PROGRAMA DE FUNCIONES ***");
Console.WriteLine("\nNOTA 1: ");  double nota1 = Convert.ToDouble(Console.ReadLine());
if (nota1 > mayor) mayor = nota1;
Console.WriteLine("\nNOTA 2: ");  double nota2 = Convert.ToDouble(Console.ReadLine());
if (nota2 > mayor) mayor = nota2;
Console.WriteLine("\nNOTA 3: ");  double nota3 = Convert.ToDouble(Console.ReadLine());
if (nota3 > mayor) mayor = nota3;

double promedio = calcularPromedio(nota1, nota2, nota3);  //invocar la funcion

salidas(nota1, nota2, nota3, promedio, mayor);

//implementacion de la función
double calcularPromedio(double n1, double n2, double n3){
    return (n1 + n2 + n3)/ 3;
}

//implementacion procedimiento
void salidas(double n1, double n2, double n3, double prom, double may){
   Console.Clear();
   string mensaje = traerMensaje(prom);
   Console.WriteLine("***** MOSTRANDO NOTAS ****");
   Console.WriteLine("NOTA1   NOTA2   NOTA3   PROMEDIO   MENSAJE   NOTA-MAYOR");
   Console.WriteLine($"{n1}    {n2}    {n3}   {prom}     {mensaje}   {mayor}");
}

//implementacion funcion para
string traerMensaje (double prom){
   string mensaje = "nada";
   if (prom >= 3) mensaje = "APROBADO";
   else mensaje = "REPROBADO";
   return mensaje;
}


