import java.util.Scanner;

public class ejercicio7 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.println("Este programa efectua la media de tres notas");
  System.out.print("introduzca las tres notas separadas por espacio ");
  
  double n1; 
  double n2;
  double n3;
  
  double media;
  
  n1 = s.nextDouble();
  n2 = s.nextDouble();
  n3 = s.nextDouble();
  
  media = (n1+n2+n3)/3;
  
  System.out.println("nota 1 =" + n1);
  System.out.println("nota 2 =" + n2);
  System.out.println("nota 3 =" + n3);
  System.out.printf("%-1s%.2f\n","nota media = ", media); 
  
  }
 }
