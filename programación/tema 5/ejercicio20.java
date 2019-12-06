import java.util.Scanner;

public class ejercicio20 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("indique la altura ");
  
  int planta = 1;
  int altura = s.nextInt();
  int interior = 0;
  int i = 0;
  
  System.out.print("indique un caracter para la pirámide");
  String caracter = s.next();
  int espacio = altura-1;
  
  while (planta < altura) {
    
    for (i = 1; i <= espacio; i++) {
      
      System.out.print(" ");
    }
      System.out.print(caracter);
    
    for (i = 1; i < interior; i++) {
      
      System.out.print(" ");
    }
    if (planta>1) {
      System.out.print(caracter);
    }
      
      
    
    System.out.println();
    
    planta++;
    espacio--;
    interior += 2;
    
  }
    for (i = 1; i < planta*2; i++) {
      System.out.print(caracter);
    
    }
    
}
}
      
      
      
