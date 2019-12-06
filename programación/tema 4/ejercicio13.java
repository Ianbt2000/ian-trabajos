import java.util.Scanner;

public class ejercicio13 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("introduce tres numeros (diferentes) enteros para ser ordenados ");
  
  int a = s.nextInt();
  int b = s.nextInt();
  int c = s.nextInt();
  
  
  if ((a > b) || (a > c)) {
    
    if ((a > b) && (a >c)) {
      
      if (b > c) {
        
        System.out.print(a + ">" + b + ">" + c);
      
      } else {
         System.out.print(a + ">" + c + ">" + b);
        }
      } else { if (a > b) {
         System.out.print(c + ">" + a + ">" + b);
        
      } else {
         System.out.print(b + ">" + a + ">" + c);
        }
      }
      } else { if (b > c) {
         System.out.print(b + ">" + c + ">" + a);
      } else { 
         System.out.print(c + ">" + b + ">" + a);
       }
     }
   }
 }
        
        
        
        
        
        
        
        
