import java.util.Scanner;

public class ejercicio3 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("introduce las pesetas ");
  
  double x1 = s.nextDouble();
  
  double div = x1 / 166.386;
  
  System.out.printf("%.0f%-1s%-1s%.2f%-1s\n", x1, " pesetas", " es igual a ", div, "€");
 }
}
