import java.util.Scanner;

public class ejercicio5 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);

System.out.println("El sistema mostrará 50 números aleatorios entre 100 y 199");

int max = 0;
int min = 200;
int media;
int numero;
int suma = 0;

for (int i = 0; i < 50; i++) {

numero = (int)(Math.random()*100 + 100);
System.out.print(numero + " ");
suma += numero;

if (numero > max) {
  max = numero;
} else { 
  if (numero < min) {
    min = numero;
  }
}

}
media = suma/50;
System.out.println(" ");
System.out.println("la media es " + media);
System.out.println("máx= " + max);
System.out.println("mín= " + min);

}
}
