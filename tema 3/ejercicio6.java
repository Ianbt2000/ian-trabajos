import java.util.Scanner;

public class ejercicio6 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.println("introduce base y altura del triángulo(puede tener dos decimales)");
  System.out.print("y la unidad de medida separados por un espacio ");
  
  double x1 = s.nextDouble();
  double x2 = s.nextDouble();
  
  String unidadDeMedida = s.nextLine();
   
  double area = (x1 * x2) / 2;
  
  System.out.printf("%-1s%.2f%-1s\n", "el área del triángulo es igual a ", area, unidadDeMedida);

 }
}
