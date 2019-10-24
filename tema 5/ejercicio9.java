import java.util.Scanner;

public class ejercicio9 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);

System.out.print("indique un número ");
int y = s.nextInt();
int largo = 0;

for (int x = 1; x <= y; x *= 10) {

largo++;
}
System.out.print(largo + " dígitos");
}
}
