import java.util.Scanner;

public class ejercicio10 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  double suma = 0;
  double total;
  int divisor = -1;
  double i;
  double media;
  
  System.out.println("escribe numeros para hacer la media y acabe con uno negativo");
do {
  
  i = s.nextDouble();
  
  total = suma+i;
  suma = total;
  divisor++;
  
} while (i >= 0); 

total = total-i;
media = total/divisor;

  System.out.print("la media es " + media);

}
}






