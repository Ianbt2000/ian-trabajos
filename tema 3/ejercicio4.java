import java.util.Scanner;

public class ejercicio4 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("introduce dos números(puede tener dos decimales) separados por un espacio ");
  
  double x1 = s.nextDouble();
  double x2 = s.nextDouble();
  double sum = x1 + x2;
  double res = x1 - x2;
  double mult = x1 * x2;
  double div = x1 / x2;
  
  System.out.printf("%.2f%-1s%.2f%-1s%.2f\n", x1, " + ", x2, " = ", sum);
  System.out.printf("%.2f%-1s%.2f%-1s%.2f\n", x1, " - ", x2, " = ", res);
  System.out.printf("%.2f%-1s%.2f%-1s%.2f\n", x1, " * ", x2, " = ", mult);
  System.out.printf("%.2f%-1s%.2f%-1s%.2f\n", x1, " / ", x2, " = ", div);
 }
}
