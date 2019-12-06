import java.util.Scanner;

public class ejercicio7 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("escriba la contraseña (4 dígitos) ");
  
  for (int i = 0; i < 4; i++) { 
      
  int pass = s.nextInt();
      
    if (pass == 1234) {
      System.out.print("contraseña correcta");
      
      i = 4;
    } else { 
      System.out.println("vuelva a intentarlo");
    }
  
 if (i == 3) {
   System.out.print("no le quedan intentos la caja se autodestruirá");
 }
  
}
}
}
