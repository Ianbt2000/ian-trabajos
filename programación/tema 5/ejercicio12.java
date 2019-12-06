import java.util.Scanner;

public class ejercicio12 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("escriba hasta que número quiere que se llegue");
  
  int n = s.nextInt();
  int x = 0;
  int num1 = 0;
  int num2 = 1;
  int suma = 0;
  
  do {
    
    suma = num1 + num2;
     
    num2 = num1;
    num1 = suma;
    
    
    System.out.print(suma + ", ");
    
    x++;
    
  } while (x < n);
  
}
}












