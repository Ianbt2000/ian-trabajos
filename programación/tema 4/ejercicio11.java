import java.util.Scanner;

public class ejercicio11 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("Indique la hora (hora y minutos) ");
 
  
  int hora = s.nextInt();
  int min = s.nextInt();
  int sec;
  int secrest;
  System.out.println(" ");
  
  if ((hora <24) && (min <60)) { 
    
    sec = min*60+hora*3600;
    secrest = 86400-sec;
  
  System.out.println("Han pasado " + sec + " segundos desde medianoche");
  System.out.println(" ");
  System.out.print("Quedan " + secrest + " segundos para media noche");
  
} else {
   System.out.print("Hora incorrecta");
 }
}
}
