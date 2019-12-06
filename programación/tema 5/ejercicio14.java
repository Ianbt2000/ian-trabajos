import java.util.Scanner;

public class ejercicio14 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  
  System.out.print("indique un número como base y otro como potencia ");
  
  int x = s.nextInt();
  int n = s.nextInt();
  int cont = 1;
  int pot;
  int sum = x;
  
  do {
    
  pot = sum * x;
  sum = pot;
   
  cont++;
    
  } while (cont < n);


  
  System.out.print(pot);
  
}
}
