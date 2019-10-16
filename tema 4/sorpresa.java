import java.util.Scanner;

public class sorpresa {
  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   
    System.out.print("introduce simbolo de la piramide, altura, numero de piramides e incremento de altura ");
    
    
    int altura;
    int incremento = 0;
    int numpiramide = 0;
    String simbolo = s.next();
    int limpiramide;
    int numincremento;
    int longlinea = 1;
  


    
    altura = s.nextInt();
    limpiramide = s.nextInt();
    numincremento = s.nextInt();


  
  
  do {
      
      numpiramide++;
  
   while (incremento <= numincremento) {
    
     for (int i = 1; i <= altura; i++) {
     
     System.out.print(simbolo);
     }
   
     for (int i = 1; i <=longlinea; i++) {
     
     System.out.print(simbolo);
   }
  
   System.out.println();
  
   incremento++;
   altura--;
   longlinea += 2;
 }
   } while (num piramide <= limpiramide);
   
   
   }
  }
 }

