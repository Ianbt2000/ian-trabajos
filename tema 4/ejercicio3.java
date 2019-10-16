import java.util.Scanner;

public class ejercicio3 {
 public static void main(String[] args) {
 
 Scanner s = new Scanner(System.in); 
 
 System.out.print("Escribe un número del 1 al 7 ");
 
  int numdia = s.nextInt();
  String dia;
 
 switch (numdia){
   
   case 1:
    dia = "Lunes";
    System.out.print("hoy es " + dia);
    break;
    
   case 2:
    dia = "Martes";
    System.out.print("hoy es " + dia);
    break;
    
   case 3:
    dia = "Miércoles";
    System.out.print("hoy es " + dia);
    break;
    
   case 4:
    dia = "Jueves";
    System.out.print("hoy es " + dia); 
    break;
  
   case 5:
    dia = "Viernes";
    System.out.print("hoy es " + dia); 
    break;
  
   case 6:
    dia = "Sábado";
    System.out.print("hoy es " + dia);
    break;
    
   case 7:
    dia = "Domingo";
    System.out.print("hoy es " + dia); 
    break;
    
   default:
    dia = "escribiste algo mal o no es un número valido";
    System.out.print(dia);
  }
 }
}
