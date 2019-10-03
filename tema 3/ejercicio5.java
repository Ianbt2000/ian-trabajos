import java.util.Scanner;

public class ejercicio5 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.println("introduce los lados del rectángulo(puede tener dos decimales)");
  System.out.print("y la unidad de medida separados por un espacio ");
  
  double x1 = s.nextDouble();
  double x2 = s.nextDouble();
  
  String unidadDeMedida = s.nextLine();
   
  double area = x1 * x2;
  
  System.out.printf("%-1s%.2f%-1s\n", "el área del rectángulo es igual a ", area, unidadDeMedida);

 }
}
