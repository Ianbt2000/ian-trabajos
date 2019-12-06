import java.util.Scanner;

public class ejercicio11 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("Indique un número ");

  int result;
  int result2;
  int x = s.nextInt();
  int exp = 0;
for (int i = 0; i < 5; i++) {
  
  result = x*x;
  result2 = x*x*x;
  System.out.printf("%1d%-1s%1d%6d%-1s%1d\n", x, "^² = ", result, x, "^³ = ", result2);
  x++;
}
}
}








