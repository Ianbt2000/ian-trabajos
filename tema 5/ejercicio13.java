import java.util.Scanner;

public class ejercicio13 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("vaya escribiendo una lista de 10 números ");
  
  int x = 0;
  int n;
  
  
  do {
    
    n = s.nextInt();
    
    if (n >= 0) {
      
      System.out.println(n + " es positivo"); 
    } else {
      
      System.out.println(n + " es negativo");
    }
    x++;
    
  } while (x < 10);
}
}
