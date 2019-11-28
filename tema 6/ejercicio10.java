import java.util.Scanner;

public class ejercicio10 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
int simbolo;
int longlin;



for (int i = 0; i <11; i++) {
  
  simbolo = (int)(Math.random() * 6) + 1;
  longlin = (int)(Math.random() * 40) + 1;
  switch (simbolo) {
    
    case 1:
    for (int x = 0; x <= longlin; x++) {
      System.out.print("@");
    } break;
  
    case 2:
    for (int x = 0; x <= longlin; x++) {
      System.out.print("*");
    } break;

    case 3:
    for (int x = 0; x <= longlin; x++) {
      System.out.print("-");
    } break;

    case 4:
    for (int x = 0; x <= longlin; x++) {
      System.out.print("=");
    } break;

    case 5:
    for (int x = 0; x <= longlin; x++) {
      System.out.print(".");
    } break;

    case 6:
    for (int x = 0; x <= longlin; x++) {
      System.out.print("|");
    } break;
}
System.out.println(" ");
}
}
}

