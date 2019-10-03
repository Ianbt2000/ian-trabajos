import java.util.Scanner;

public class ejercicio2 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("introduce los euros ");
  
  double x1 = s.nextDouble();
  
  double mult = x1 * 166.386;
  
  System.out.printf("%.2f%-1s%-1s%.0f%-1s\n", x1, "€", " es igual a ", mult, " pesetas");
 }
}
