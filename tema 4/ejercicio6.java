import java.util.Scanner;

public class ejercicio6 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.println("Este programa soluciona el tiempo que tarda un objeto en caer segun la altura");
  System.out.print("introduzca el valor de la altura en metros ");
  
  double h; 
  double g;
  double t;
  
  
  h = s.nextDouble();
  g = 9.81;
  t = Math.sqrt(2*h/g);
  
  System.out.println("altura = " + h + " m");
  System.out.printf("%-1s%.2f%-1s\n","t = ", t, "segundos"); 
  
  }
 }

