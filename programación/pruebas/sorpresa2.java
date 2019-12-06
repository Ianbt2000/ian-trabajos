
import java.util.Scanner;

public class sorpresa2 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("Vaya poniendo notas (acabe con un número negativo) ");
  
  int n;
  int cont = -1;
  int mayornum = 0;
  double media;
  int suma = 0;
  
  do {
    n = s.nextInt();
    
    if (n <= 10) {
      
      if (n < 5) {
        
        if (n > mayornum) {
        
        mayornum = n;
        suma += n;
        cont++;
        } else {
        
        suma += n;
        cont++;
        }
      
      } else {
        
        suma += n;
        cont++;
      } 
      
      } else {
        
       System.out.print("elige otro número");
      }
        
  
  
  
  
  
} while (n >= 0);
  suma = suma-n;
  
 media = (double)suma / (double)cont;
 
 if ((media > mayornum) && (mayornum != 0)) {
   
   System.out.print("tu nota final es " + mayornum);
 } else {
   
   System.out.print("tu nota final es " + media);
 }
 
 
}
}
  
