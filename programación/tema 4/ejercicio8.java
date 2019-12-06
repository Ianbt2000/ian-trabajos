import java.util.Scanner;

public class ejercicio8 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.println("Este programa efectua la media de tres notas");
  System.out.print("introduzca las tres notas (entre 0 y 10) separadas por espacio ");
  
  double n1; 
  double n2;
  double n3;
  
  double media;
  
  String calif;
  
  n1 = s.nextDouble();
  n2 = s.nextDouble();
  n3 = s.nextDouble();
  
  media = (n1+n2+n3)/3;
  
  if ((media >= 0) && (media < 5)) {
  
  calif = "insuficiente";
  
  System.out.println("nota 1 =" + n1);
  System.out.println("nota 2 =" + n2);
  System.out.println("nota 3 =" + n3);
  System.out.printf("%-1s%.2f\n","nota media = ", media);
  System.out.println("tu calificación final es: " + calif);
  
} else { 

  if ((media >= 5) && (media < 6)){
  calif = "suficiente";
  
  System.out.println("nota 1 =" + n1);
  System.out.println("nota 2 =" + n2);
  System.out.println("nota 3 =" + n3);
  System.out.printf("%-1s%.2f\n","nota media = ", media);
  System.out.println("tu calificación final es: " + calif);
}
  else {

  if ((media >= 6) && (media < 7)) {
  calif = "bien";
  
  System.out.println("nota 1 =" + n1);
  System.out.println("nota 2 =" + n2);
  System.out.println("nota 3 =" + n3);
  System.out.printf("%-1s%.2f\n","nota media = ", media);
  System.out.println("tu calificación final es: " + calif);
  
} else {

  if ((media >=7) && (media < 9)) {
  calif = "notable";
  
  System.out.println("nota 1 =" + n1);
  System.out.println("nota 2 =" + n2);
  System.out.println("nota 3 =" + n3);
  System.out.printf("%-1s%.2f\n","nota media = ", media);
  System.out.println("tu calificación final es: " + calif);
  
} else {

  if ((media >=9) && (media <= 10)) {
  calif = "sobresaliente";
  
  System.out.println("nota 1 =" + n1);
  System.out.println("nota 2 =" + n2);
  System.out.println("nota 3 =" + n3);
  System.out.printf("%-1s%.2f\n","nota media = ", media);
  System.out.println("tu calificación final es: " + calif);
  
} else {
  
  System.out.println("nota incorrecta");
  
}
}
}
}
}
  
 
  
  
  
  }
 }
