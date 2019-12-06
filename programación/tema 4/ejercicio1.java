import java.util.Scanner;

public class ejercicio1 {
 public static void main(String[] args) {
 
 Scanner s = new Scanner(System.in); 
 
 System.out.print("Escribe un dia (minúsculas) ");
 
  String dia = s.nextLine();
  String asig;
 
 switch (dia){
   
   case "lunes":
    asig = "LM";
    System.out.print("hoy toca a primera hora: " + asig);
    break;
    
   case "martes":
    asig = "PRO";
    System.out.print("hoy toca a primera hora: " + asig);
    break;
    
   case "miércoles":
    asig = "PRO";
    System.out.print("hoy toca a primera hora: " + asig);
    break;
    
   case "jueves":
    asig = "SINF";
    System.out.print("hoy toca a primera hora: " + asig); 
    break;
  
   case "viernes":
    asig = "ED";
    System.out.print("hoy toca a primera hora: " + asig); 
    break;
  
   case "sábado":
    asig = "es fin de semana no hay clase";
    break;
    
   case "domingo":
    asig = "es fin de semana no hay clase";
    System.out.print("hoy toca a primera hora: " + asig); 
    break;
    
   default:
    asig = "escribiste algo mal o no es un día valido";
    System.out.print(asig);
  }
 }
}
