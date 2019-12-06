
/*Ejercicio 4 del exámen de Ián Banderas Tomillo*/



import java.util.Scanner;

public class examenej4rev {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);

System.out.println("Este programa calcula el dia de la semana que corresponde a una fecha");
System.out.println("Válido para fechas entre 1/1/1700 y 31/12/2299");
System.out.print("introduzca la fecha con espacios ");

int dia = s.nextInt();

int mes = s.nextInt();

int año = s.nextInt();

int Csiglo = 0;
int Caño = 0;
int Cbis = 0;
int Cdia;
int Cmes = 0;

int Rsiglo;
int Raño;
int Raño2;
int Rbis;
int Rbis2;
int Rbis3;

int suma;
int result;




Rsiglo = año/100;

/* calculo de coeficiente de siglo*/
switch (Rsiglo) {
  
  case 17:
  Csiglo = 5;
  break;
  
  case 18:
  Csiglo = 3;
  break;

  case 19:
  Csiglo = 1;
  break;

  case 20:
  Csiglo = 0;
  break;
  
  case 21:
  Csiglo = -2;
  break;
  
  case 22:
  Csiglo = -4;
  break;
}

/* calculo cociente año*/

Raño = año%100;
Raño2 = Raño/4;
Caño = Raño+Raño2;


/*calculo coeficiente bisiesto*/

Rbis = año%4;
Rbis2 = año%100;
Rbis3 = año%400;


if ((mes == 1) || (mes == 2)) {
  if ((Rbis == 0 && Rbis2 != 0) || (Rbis3 == 0)) {
    Cbis = -1;
  } 
  } else { 
    Cbis = 0;
  }

/*calculo coeficiente mes*/

switch (mes) {
  
  case 1:
  case 10:
  Cmes = 6;
  break;
  
  case 2:
  case 3:
  case 11:
  Cmes = 2;
  break;
  
  case 4:
  case 7:
  Cmes = 5;
  break;
  
  case 5:
  Cmes = 0;
  break;
  
  case 6:
  Cmes = 3;
  break;
  
  case 8:
  Cmes = 1;
  break;
  
  case 9:
  case 12:
  Cmes = 4;
  break;
  
}

/*coeficiente dia*/

Cdia = dia;


/*calculo dia*/

suma = Cdia+Cmes+Cbis+Csiglo+Caño;

result = suma%7;

switch (result) {

  case 1:
  System.out.print("la fecha " + dia + "/" + mes + "/" + año + " cae en: Lunes");
  break;

  case 2:
  System.out.print("la fecha " + dia + "/" + mes + "/" + año + " cae en: Martes");
  break;
  
  case 3:
  System.out.print("la fecha " + dia + "/" + mes + "/" + año + " cae en: Miércoles");
  break;
  
  case 4:
  System.out.print("la fecha " + dia + "/" + mes + "/" + año + " cae en: Jueves");
  break;
  
  case 5:
  System.out.print("la fecha " + dia + "/" + mes + "/" + año + " cae en: Viernes");
  break;
  
  case 6:
  System.out.print("la fecha " + dia + "/" + mes + "/" + año + " cae en: Sábado");
  break;
  
  case 0:
  System.out.print("la fecha " + dia + "/" + mes + "/" + año + " cae en: Domingo");
  break;
}





}
}
