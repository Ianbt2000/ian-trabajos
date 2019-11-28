// Javier Luque Rodríguez -- 29/10/2019
public class Ex18JLR2 {
  
  public static void main (String[] args) {
    
    int i;
    int linea = 1;
    int altura;
    int espaciosIzq;
    int numCaracteres;
    String orientacion;
    String caracter1;
    String caracter2;
    boolean correcto;
    
    System.out.println("Este programa pinta piramides.");
    
    // Comprueba que la altura este bien introducida
    do {
      correcto = true;
      
      System.out.print("Introduzca la altura (1-10): ");
      altura = Integer.parseInt(System.console().readLine());
      
      if (altura < 1 || altura > 10) {
	System.out.print("Incorrecto. ");
	correcto = false;
      }
      
    } while (correcto == false);
    
    // Comprueba que la orientación este bien introducida
    do {
      correcto = true;
      
      System.out.print("Introduzca la orientacion (izquierda, derecha, "
	+ "arriba, abajo): ");
      orientacion = System.console().readLine();
      
      if (orientacion.equals("izquierda") || orientacion.equals("derecha") ||
	orientacion.equals("arriba") || orientacion.equals("abajo")) {
	  correcto = true;
	} else {
	  System.out.print("Incorrecto. ");
	  correcto = false;
	}
    } while (correcto == false);
    
    System.out.print("Introduzca el primer carácter: ");
    caracter1 = System.console().readLine();
    
    System.out.print("Introduzca el segundo carácter: ");
    caracter2 = System.console().readLine();
    
    // Pinta la piramide
    switch (orientacion) {
      case "izquierda":
      espaciosIzq = altura - 1;
      while (linea <= altura) {
	  // Inserta espacios a la izquierda
	  for (i = 0; i < espaciosIzq; i++) {
	    System.out.print(" ");
	  }
	  // Pinta caracteres
	  numCaracteres = 0;
	  while (numCaracteres < linea) { 
	    if (numCaracteres < linea) {
	      System.out.print(caracter1);
	      numCaracteres++;
	    }
	    if (numCaracteres < linea) {
	      System.out.print(caracter2);
	      numCaracteres++;
	    }
	    
	  }
	  System.out.println();
	  
	  espaciosIzq--;
	  linea++;
	}
	
	// Pinta la parte inferior de la piramide
	linea -= 2;
	espaciosIzq = 1;
	while (linea > 0) {
	  // Inserta espacios a la izquierda
	  for (i = 0; i < espaciosIzq; i++) {
	    System.out.print(" ");
	  }
	  
	  // Pinta caracteres
	  numCaracteres = 0;
	  while (numCaracteres < linea) { 
	    if (numCaracteres < linea) {
	      System.out.print(caracter1);
	      numCaracteres++;
	    }
	    if (numCaracteres < linea) {
	      System.out.print(caracter2);
	      numCaracteres++;
	    }
	  
	  }
	  System.out.println();
	  
	  espaciosIzq++;
	  linea--;
	}
      
	break;
      case "derecha":
	// Pinta la parte superior de la piramide
	while (linea <= altura) {
	  // Pinta caracteres
	  numCaracteres = 0;
	  while (numCaracteres < linea) { 
	    if (linea % 2 != 0) {
	      if (numCaracteres < linea) {
		System.out.print(caracter1);
		numCaracteres++;
	      }
	      if (numCaracteres < linea) {
		System.out.print(caracter2);
		numCaracteres++;
	      }
	    }
	    if (linea % 2 == 0) {
	      if (numCaracteres < linea) {
		System.out.print(caracter2);
		numCaracteres++;
	      }
	      if (numCaracteres < linea) {
		System.out.print(caracter1);
		numCaracteres++;
	      }
	    }
	  }
	  System.out.println();
	  
	  linea++;
	}
	
	// Pinta la parte inferior de la piramide
	linea -= 2;
	while (linea > 0) {
	  // Pinta caracteres
	  numCaracteres = 0;
	  while (numCaracteres < linea) { 
	    if (linea % 2 != 0) {
	      if (numCaracteres < linea) {
		System.out.print(caracter1);
		numCaracteres++;
	      }
	      if (numCaracteres < linea) {
		System.out.print(caracter2);
		numCaracteres++;
	      }
	    }
	    if (linea % 2 == 0) {
	      if (numCaracteres < linea) {
		System.out.print(caracter2);
		numCaracteres++;
	      }
	      if (numCaracteres < linea) {
		System.out.print(caracter1);
		numCaracteres++;
	      }
	    }
	  }
	  System.out.println();
	  
	  linea--;
	}
      
	break;
	
      case "arriba":
	espaciosIzq = altura - 1;
	
	while (linea <= altura) {
	  // Inserta los espacios a la izquierda
	  for (i = 0; i < espaciosIzq; i++) {
	    System.out.print(" ");
	  }
	  
	  // Pinta carácter de la izquierda
	  System.out.print(caracter1);
	  // Pinta los caracteres de la derecha alternando ambos caracteres
	  for (i = 1; i < linea; i++) {
	    System.out.print(caracter2 + caracter1);
	  }
	  System.out.println();
	  
	  espaciosIzq--;
	  linea++;
	}
	break;
	
      case "abajo":
	numCaracteres = altura - 1;
	
	while (linea <= altura) {
	  // Inserta los espacios a la izquierda
	  for (i = 1; i < linea; i++) {
	    System.out.print(" ");
	  }
	  
	  // Pinta carácter de la izquierda
	  System.out.print(caracter1);
	  // Pinta los caracteres de la derecha alternando ambos caracteres
	  for (i = 0; i < numCaracteres; i++) {
	    System.out.print(caracter2 + caracter1);
	  }
	  System.out.println();
	  
	  linea++;
	  numCaracteres--;
	}
	break;
    }
    
  } 
}

