import java.util.Scanner;

public class ejercicio4 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("introduce horas trabajadas esta semana ");
  
  int horas; 
  
  horas = s.nextInt();
  
  
  
  if ((horas > 0) && (horas <=40)) {
  System.out.printf("%-1s%-1s\n", "horas: ", horas);
  System.out.printf("%-1s%-1s\n", "euros por hora: ", "12€");
  
  int pago = horas * 12;
  
  System.out.println("el salario de esta semana es igual a " + pago + "€");
} else { if (horas > 40) {

  System.out.printf("%-1s%-1s\n", "horas: ", horas);
  System.out.printf("%-1s%-1s\n", "euros por hora: ", "12€");
  System.out.printf("%-1s%-1s\n", "euros por horas extra: ", "16€");
  
  int pago = (horas - 40) * 12 + 480 ;
  
  System.out.println("el salario de esta semana es igual a " + pago + "€");
   }
  }

 }
}
