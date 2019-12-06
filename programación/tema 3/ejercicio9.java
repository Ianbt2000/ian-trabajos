import java.util.Scanner;


public class ejercicio9 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
 
  System.out.print("introduce r (radio de la base) y h (altura del cono)  ");

  double r = s.nextDouble();
  double h = s.nextDouble();
 
  double pi = 3.14;
 
  double r2 = r * r;
  double volumen = r2 * pi * 1/3 * h; 
 
  System.out.printf("%-1s%.2f\n", "el volumen es ", volumen);
  
  }
}
