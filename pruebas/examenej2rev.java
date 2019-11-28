/*Ejercicio 2 del exámen de Ián Banderas Tomillo*/


import java.util.Scanner;

public class examenej2rev {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
System.out.println("Este programa calcula Centros Numéricos");
System.out.print("Indique que número desea procesar ");
int numero = s.nextInt();
int suma = 1;
int suma2 = 0;
int i;
int x;
int y = 2;
int centro = 0;

while (numero < 2) {
  System.out.print("incorrecto. ");
  System.out.print("Indique que número desea procesar ");
  numero = s.nextInt();
}



do {
  suma = 0;
  suma2 = 0;
  for (i = 1; i < y; i++) {

 suma = (suma+i);

}
 for (x = (y+1) ; suma2 < suma; x++) {
 
  suma2 = (suma2+x);
}
  
  
if (suma2 == suma) { 

  System.out.println(i +" es Centro Numérico." + " Grupos: (1-" + (y-1) + ") (" + (i+1) + "-" + (x-1) + "). Suma: " + suma + " y Suma2: " + suma2);

centro++;
 }

  
  
y++;


  
} while (y < numero);

if (centro == 0) {
  System.out.print("no existen centros");

}
}
}
