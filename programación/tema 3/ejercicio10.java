import java.util.Scanner;


public class ejercicio10 {
 public static void main(String[] args) {
   
  Scanner s = new Scanner(System.in);
  
  System.out.print("introduce los Mb ");
  
  double mb = s.nextDouble();
  
  double kb = mb * 1024;
  
  System.out.printf("%.2f%-1s%.2f%-1s\n", mb, " Mb son ", kb, " Kb");
  }
}
