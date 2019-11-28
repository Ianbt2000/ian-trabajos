// Javier Luque Rodríguez -- 29/10/2019

public class Ex18JLR4 {
  
  public static void main (String[] args) {
    
    long num;
    long aux;
    int digito;
    String palabra = "";
    
    System.out.println("Este programa codifica número en \"letras similares"
      + "\".");
    
    do {
      // Pide número por pantalla
      System.out.print("Introduzca un número entero (0 para salir): ");
      num = Long.parseLong(System.console().readLine());
      
      // Reinicia el valor de las variables
      aux = num;
      palabra = "";
      
      // Codifica el número
      while (aux > 0) {
	digito = (int)aux % 10;
	
	switch (digito) {
	  case 0:
	    palabra = "O" + palabra;
	    break;
	  case 1:
	    palabra = "l" + palabra;
	    break;
	  case 2:
	    palabra = "Z" + palabra;
	    break;
	  case 3:
	    palabra = "E" + palabra;
	    break;
	  case 4:
	    palabra = "A" + palabra;
	    break;
	  case 5:
	    palabra = "S" + palabra;
	    break;
	  case 6:
	    palabra = "b" + palabra;
	    break;
	  case 7:
	    palabra = "J" + palabra;
	    break;
	  case 8:
	    palabra = "B" + palabra;
	    break;
	  case 9:
	    palabra = "g" + palabra;
	    break;
	  default:
	}
	
	aux /= 10;
      }
      
      // Imprime el número codificado si no queremos salir 
      if (num != 0) {
	System.out.println("El valor codificado es: " + palabra);
      }
      
    } while (num != 0);
  } 
}

