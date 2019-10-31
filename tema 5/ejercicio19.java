import java.util.Scanner;

public class ejercicio19 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("indique la altura ");
  
  int planta = 1;
  int longitud = 1;
  int altura = s.nextInt();
  
  System.out.print("indique un caracter para la pirámide");
  String caracter = s.next();
  int espacio = altura-1;
  
  while (planta <= altura) {
    
    for (int i = 1; i <= espacio; i++) {
      
      System.out.print(" ");
    }
    
    for (int i = 1; i <= longitud; i++) {
      
      System.out.print(caracter);
    }
    
    System.out.println();
    
    planta++;
    espacio--;
    longitud += 2;
  }
}
}
      
      
      
  
