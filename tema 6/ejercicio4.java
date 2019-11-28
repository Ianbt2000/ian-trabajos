import java.util.Scanner;

public class ejercicio4 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);

System.out.println("El sistema mostrará 20 números aleatorios entre 0 y 10");

for (int i = 0; i < 20; i++) {

System.out.print((int)(Math.random()*10 + 1) + " ");

}
}
}
