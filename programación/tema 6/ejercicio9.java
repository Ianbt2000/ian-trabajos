import java.util.Scanner;

public class ejercicio9 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);

System.out.println("El sistema calculará números pares aleatorios entre 0 y 100");

int num;
int par = 0;
int resto;

do {
  num = (int)(Math.random() * 101);
  resto = num % 2;
  
  if (resto == 0) {
    par ++;
  }
  
  
  } while (num != 24);

System.out.print("se han generado " + par + " números");

}
}
