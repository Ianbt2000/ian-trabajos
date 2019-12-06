import java.util.Scanner;

public class ejercicio5 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.println("Este programa soluciona la ecuación ax + b = 0");
  System.out.print("introduzca el valor a y b separados por espacio ");
  
  double a; 
  double b;
  double x;
  
  a = s.nextDouble();
  b = s.nextDouble();
  x = ((b * -1) / a);
  
  if ((a * x + b) == 0) {
    
  System.out.println("a = " + a);
  System.out.println("b = " + b);
  System.out.print("x = " + x );
  
} else { 

  System.out.print("la ecuación no tiene solución");
  
  }

 }
}

