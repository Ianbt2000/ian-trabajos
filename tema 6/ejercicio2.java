import java.util.Scanner;

public class ejercicio2 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.println("se mostrara una carta de la baraja francesa");
  
  String carta = "";
  
  int numcarta;
  
  numcarta = (int)(Math.random()*13 + 1);
  
  int palo;
  
  palo = (int)(Math.random()*4 + 1);
 
  String simbolo = "";
  
 switch (palo) {
   
   case 1:
 
  simbolo = "corazones";
  break;
  
   case 2:
 
  simbolo = "diamantes";
  break;
  
   case 3:
 
  simbolo = "tréboles";
  break;
  
   case 4:
 
  simbolo = "picas";
  break;
 default:
}
  
  switch (numcarta) {
    
    case 1:
    
    carta = "A";
    break;
    
    case 11:
    
    carta = "J";
    break;
    
    case 12:
    
    carta = "Q";
    break;
    
    case 13:
    carta = "K";
    break;
    
    default: 
    
    carta = String.valueOf(numcarta);
  }
  
    System.out.print("su a carta es " + carta + " de " + simbolo);

}
}
