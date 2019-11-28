// Javier Luque Rodríguez -- 29/10/2019
public class Ex18JLR3 {
  
  public static void main (String[] args) {
    // Declaración de variables
    long num;
    long copia = 0;
    int digito = 0;
    int desplazamientos = 0;
    int longitud = 0;
    long aux;
    long resultado = 0;
    int i;
    String tipoDes;
    
    System.out.println("Este programa da \"vueltas\" a un número: ");
    
    System.out.print("Introduzca un número: ");
    num = Long.parseLong(System.console().readLine());
    
    // Calcula la longitud del número
    copia = num;
    while (copia > 0) {
      copia /= 10;
      longitud++;
    }
    
    do {
      System.out.print("Introduzca el tipo de desplazamiento (izquierda, "
	+ "derecha; salir): ");
      tipoDes = System.console().readLine();
      
      if (tipoDes.equals("salir") == false) {
	System.out.print("Introduzca la cantidad de cifras que desea "
	  + "desplazar: ");
	desplazamientos = Integer.parseInt(System.console().readLine());
      }
      
      // Desplaza el número a la izquierda o derecha tantas veces como le 
      // indiquemos en los desplazamientos
      switch (tipoDes) { 
	case "izquierda": 
	  for (i = 0; i < desplazamientos; i++) {
	    digito = (int)(num / Math.pow(10, longitud - 1));
	    aux = (long)(digito * Math.pow(10, longitud - 1));
	    resultado = (num - aux) * 10 + digito;
	    num = resultado;
	  }
	  
	  System.out.println("El número resultado es " + resultado);
	  break;
	  
	case "derecha":
	  for (i = 0; i < desplazamientos; i++) {
	    digito = (int) (num % 10); 
	    aux = num / 10; // número sin el dígito
	    resultado = digito * (long) Math.pow(10, longitud - 1) + aux;
	    num = resultado;
	  }
	  
	  System.out.println("El número resultante es " + resultado);
	  break;
	  
	default:
      }
    } while (tipoDes.equals("salir") == false);
    
  } 
}

