import java.util.Scanner;

public class ejercicio15 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
System.out.print("Elige un símbolo para pintar la piramide ");

String x = s.nextLine();

System.out.println("elige un tipo de pirámide (con el número");
System.out.println("1. pirámide hacia arriba");
System.out.println("2. pirámide hacia derecha");
System.out.println("3. pirámide hacia abajo");
System.out.println("4. pirámide hacia izquierda");

int opcion = s.nextInt();

switch (opcion) {
  
  case 1:
   System.out.println("  " + x);
   System.out.println(" " + x + x + x);
   System.out.println(x + x + x + x + x);
  break;
  
  case 2:
   System.out.println(x);
   System.out.println(x + x);
   System.out.println(x + x + x);
   System.out.println(x + x);
   System.out.println(x);
  break;
  
  case 3:
   System.out.println(x + x + x + x + x);
   System.out.println(" " + x + x + x);
   System.out.println("  " + x);
  break;
  
  case 4:
   System.out.println("  " + x);
   System.out.println(" " + x + x);
   System.out.println(x + x + x);
   System.out.println(" " + x + x);
   System.out.println("  " + x);
   break;
 }
}
}
