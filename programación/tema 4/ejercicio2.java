import java.util.Scanner;

public class ejercicio2 {
 public static void main(String[] args) {
 
 Scanner s = new Scanner(System.in); 
 
 System.out.print("indique la hora (sin minutos) ");
 
 int hora;
 
 hora = s.nextInt();

 if ((hora >= 6) && (hora <= 12)) {
  System.out.print("buenos días");
} else {
  
 if ((hora >= 13) && (hora <= 20)) {
  System.out.print("buenas tardes");
} else {
  
 if ((hora >= 21) && (hora <= 24)) {
  System.out.print("buenas noches");
} else {
  
 if ((hora >= 0) && (hora <= 5)) {
  System.out.print("buenas noches");
} else {  
  System.out.print("la hora no es valida, escribe solo la hora sin minutos");
}
}
}
}

  }
 }
