// Javier Luque Rodríguez -- 29/10/2019
// noestandificil --> contraseña
public class Ex18JLR1 {
  
  public static void main (String[] args) {
    int espaciosIzq = 0;
    int espaciosDer = 19;
    int i;
    char controles;
    
    System.out.println("Controles: j = abajo-izquierda // k = abajo // l "
      + "abajo-derecha (seguido de ENTER)\nPara salir, pulse 's'");
      
    do {
      // Introduce los espacios a la izquierda del gusano
      for (i = 0; (i < espaciosIzq); i++){
	System.out.print(" ");
      }
      // Pinta el gusano
      System.out.print("*");
      
      // Pinta los espacios a la derecha del gusano
      for (i = 0; (i < espaciosDer); i++){
	System.out.print(" ");
      }
      // Controles
      System.out.print("¿j, k, l, s? ");
      controles = System.console().readLine().charAt(0);
      
      switch (controles) {
	case 'j': // Izquierda
	  if (espaciosIzq > 0) {
	    espaciosIzq -= 1;
	    espaciosDer += 1;
	  }
	  break;
	case 'k': // Abajo
	  espaciosIzq = espaciosIzq;
	  break;
	case 'l': // Derecha
	  if (espaciosIzq < 9) {
	    espaciosIzq += 1;
	    espaciosDer -= 1;
	  }
	case 's': // Salir
	default:
      }
    } while (controles != 's');
  } 
}

