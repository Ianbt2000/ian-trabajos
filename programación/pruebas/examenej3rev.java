/*Ejercicio 3 del exámen de Ián Banderas Tomillo*/


import java.util.Scanner;

public class examenej3rev {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);

System.out.println("Este programa codifica números enteros a MORSE");
System.out.print("Introduzca un valor entero a codificar (>= 0)");

int numero = 0;
int numconteo = numero;
int contlong = 0;
int restonum;
int div = 1;
int contdiv = 1;
int suma;



while (numero >= 0) {
numero = s.nextInt();
numconteo = numero;
contlong = 0;
contdiv = 1;
div = 1;

if (numero >= 0) {

do {
  
  numconteo = numconteo/10;
  contlong++;
  
} while (numconteo > 0);

do {
  div = div*10;
  contdiv++;
} while (contdiv < contlong);

for (int i = 0;i < contlong;i++) {
  restonum = numero/div;
  
  if (restonum > 10) {
  restonum = restonum%10;
}


  switch (restonum) {
    
    case 1:
    System.out.print(".---- ");
    break;
    
    case 2:
    System.out.print("..--- ");
    break;
    
    case 3:
    System.out.print("...-- ");
    break;
    
    case 4:
    System.out.print("....- ");
    break;
    
    case 5:
    System.out.print("..... ");
    break;
    
    case 6:
    System.out.print("-.... ");
    break;
    
    case 7:
    System.out.print("--... ");
    break;
    
    case 8:
    System.out.print("---.. ");
    break;
    
    case 9:
    System.out.print("----. ");
    break;
    
    case 0:
    System.out.print("----- ");
    break;
  }
  div = div/10;

}
System.out.println(" ");
}
}



}
}
