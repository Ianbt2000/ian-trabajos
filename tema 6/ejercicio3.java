import java.util.Scanner;

public class ejercicio3 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.println("se mostrara una carta de la baraja española");
  
  String carta = "";
  
  int numcarta;
  
  numcarta = (int)(Math.random()*10 + 1);
  
  int palo;
  
  palo = (int)(Math.random()*4 + 1);
 
  String simbolo = "";
  
 switch (palo) {
   
   case 1:
 
  simbolo = "Bastos";
  break;
  
   case 2:
 
  simbolo = "Espadas";
  break;
  
   case 3:
 
  simbolo = "Copas";
  break;
  
   case 4:
 
  simbolo = "Oros";
  break;
 default:
}
  
  switch (numcarta) {
    
    case 1:
    
    carta = "A";
    break;
    
    case 7:
    
    carta = "sota";
    break;
    
    case 9:
    
    carta = "caballo";
    break;
    
    case 10:
    carta = "rey";
    break;
    
    default: 
    
    carta = String.valueOf(numcarta);
  }
  
    System.out.print("su a carta es " + carta + " de " + simbolo);

}
}

