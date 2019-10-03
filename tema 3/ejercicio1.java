import java.util.Scanner;

public class ejercicio1 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("introduce dos números(puede tener decimales) separados por espacio ");
  
  double x1 = s.nextDouble();
  double x2 = s.nextDouble(); 
  
  double mult = x1 * x2;
  
  System.out.println(x1 + " por " + x2 + " es igual a " + mult);
 }
}
