
import java.util.Scanner;

public class ejercicio16 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print(" escribe un número para saber si es primo ");
  
  int n = s.nextInt();
  int x = 3;
  int resto = 1;
  int cont = 0;
  
  if (n%2 == 0) {
    System.out.print(n + " no es primo");
  } else { 
    do {
      if (resto == 0) {
        System.out.print(n + " no es primo");
      } else {
      resto = n % x;
      
      x = x + 2;
      cont++;
      }
    } while ((cont < n) && (resto != 0));
    
    System.out.print(n + " es primo");
  }
}
}
    
    
    
