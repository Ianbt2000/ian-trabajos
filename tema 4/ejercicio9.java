import java.util.Scanner;

public class ejercicio9 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.println("Este programa soluciona la ecuación ax^2 + bx + c = 0");
  System.out.print("introduzca el valor a, b y c separados por espacio (ninguna puede valer 0) ");
  
  double a; 
  double b;
  double c;
  double x1;
  double x2;
  
  a = s.nextDouble();
  b = s.nextDouble();
  c = s.nextDouble();
  x1 = ( (-b + Math.sqrt(b*b+(-4*a*c)))/(2*a) );
  x2 = ( (-b - Math.sqrt(b*b+(-4*a*c)))/(2*a) );
  
  if (((a * x1 * x1 + b * x1 + c) == 0) && ((a * x2 * x2 + b * x2 + c) == 0)) {
    
  System.out.println("a = " + a);
  System.out.println("b = " + b);
  System.out.println("c = " + c);
  System.out.println("x = " + x1);
  System.out.print("x = " + x2);
  
} else { 

  System.out.print("la ecuación no tiene solución");
  
  }

 }
}
