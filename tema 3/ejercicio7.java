import java.util.Scanner;

public class ejercicio7 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("introduce precio de tres productos(puede tener dos decimales) ");
  
  double x1 = s.nextDouble();
  double x2 = s.nextDouble();
  double x3 = s.nextDouble();
   
 
  System.out.printf("%-1s%.2f%-1s\n", "P1 ", x1, "€");
  System.out.printf("%-1s%.2f%-1s\n", "P2 ", x2, "€");
  System.out.printf("%-1s%.2f%-1s\n", "P3 ", x3, "€");
 
  
  double precio = x1 + x2 + x3;
  
  System.out.printf("%-1s%.2f\n", "el precio de igual a ", precio);

 }
}
