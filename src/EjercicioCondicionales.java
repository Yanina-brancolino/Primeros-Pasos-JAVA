import java.util.Scanner;
import java.util.function.IntFunction;

public class EjercicioCondicionales {
   public static void main(String[] args) {
       
      double sueldo = 0;
      int categoria;

      System.out.println(" Ingrese el tipo de categoria que desea calcular el sueldo");

      Scanner teclado = new Scanner(System.in);
      categoria = teclado.nextInt();

      switch (categoria) {
         case 1:
            sueldo = 15890 + (15890 * 0.10);
            break;

         case 2:
            sueldo = 25630.89;
            break;

         case 3:
            sueldo = 35560.20 - (35560.20 * 0.11);
            break;

         default:
            System.out.println(" Debe ingresar un numero de categoria valido");
            break;
      }

      if(categoria == 1 || categoria == 2 || categoria == 3){

         System.out.println(" El total del sueldo para la categoria seleccionada " + categoria + " es igual a: " + sueldo);

      }
   
   }

}

// En el mismo utilice declaracion de variables, condicinal switch y el if, impresion en pantalla con el sout, 
// el operador (|| or) y los - + * .
 


/*
EJERCICIO

 Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos
 de los mismos pueden tener 3 categoria: 1- REPOSITOR, 2- CAJERO y 3- SUPERVISOR.

    - Los REPOSITORES cobran $ 15.890 + un bono del 10%
    - Los CAJEROS cobran $ 25.630,89 fijos
    - Los SUPERVISORES cobran $ 35.560,20 en bruto al cual se les descuenta un 11% de jubilacion

 Se necesita un programa que, dependiendo del tipo de empleado del que se trate,
 calcule y muestre en pantalla el correspondiente sueldo.
 */