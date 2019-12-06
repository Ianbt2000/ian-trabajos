import java.util.Scanner;

public class ejercicio8 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("introduce horas trabajadas esta semana ");
  
  int horas = s.nextInt();
  
  System.out.printf("%-1s%-1s\n", "horas: ", horas);
  System.out.printf("%-1s%-1s\n", "euros por hora: ", "12€");
  
  int pago = horas * 12;
  
  System.out.println("el salario de esta semana es igual a " + pago + "€");

 }
}
