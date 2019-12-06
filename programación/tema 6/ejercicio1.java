import java.util.Scanner;

public class ejercicio1 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);

System.out.println("se van a tirar 3 dados: ");

int suma = 0;
int num = 0;

for(int i = 1; i <= 3; i++) {
  
  num = (int)(Math.random()*6 + 1);
  System.out.println("dado " + i + "= " + num);
  
  suma += num;

}
System.out.print("la suma total es " + suma);

}
}
