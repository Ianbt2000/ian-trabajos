import java.util.Scanner;

public class ejercicio8 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);

System.out.print("indique un número ");
int y = s.nextInt();
int total;

for (int x = 0; x <= 9; x++) {
  
  total = x*y;

  System.out.println(y + "x" + x + "= " + total);

}
}
}
