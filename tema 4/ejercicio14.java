import java.util.Scanner;

public class ejercicio14 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.println("introduce un número entero para saber si es par ");
  System.out.print("y/o divisible entre 5 ");
  
  int x = s.nextInt();
  
  int resto;
  resto = x % 2;
 
  int resto2;
 resto2 = x % 5;
 
 if (resto == 0) {
   
   System.out.println(x + ", es número par");
 } else { 
   
   System.out.println(x + ", es número impar");
 }
 
 if (resto2 == 0) {
   
   System.out.println(x + ", es divisible entre 5");
 } else {
   
   System.out.println(x + ", no es divisible entre 5");
 }
}
}
 
 
 
 
 
