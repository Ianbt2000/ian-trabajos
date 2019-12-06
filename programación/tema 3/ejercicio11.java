import java.util.Scanner;


public class ejercicio11 {
 public static void main(String[] args) {
   
  Scanner s = new Scanner(System.in);
  
  System.out.print("introduce los Kb ");
  
  double kb = s.nextDouble();
  
  double mb = kb / 1024;
  
  System.out.printf("%.2f%-1s%.2f%-1s\n", kb, " Kb son ", mb, " Mb");
  }
}
