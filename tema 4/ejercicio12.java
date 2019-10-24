import java.util.Scanner;

public class ejercicio12 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);

  System.out.println("Se le va a efectuar un test responda con v o f ");
  System.out.println(" ");


  int puntuacion = 0;
  int acierto = 0; 
  int error = 0;

  System.out.println("pregunta 1");
  System.out.print("El es tomate una fruta ");

  String respuesta1 = s.nextLine();

  if (respuesta1.equals("v")) {
  
  System.out.println("respuesta correcta");
  
  puntuacion++;
  acierto++;
  
} else { if (respuesta1.equals("f")) {
  
  System.out.println("respuesta incorrecta");
  
  error++;
}
}
  System.out.println(" ");
  System.out.println("pregunta 2");
  System.out.print("Las moscas viven 24 horas ");

  String respuesta2 = s.nextLine();

  if (respuesta2.equals("v")) {
  
  System.out.println("respuesta incorrecta");
  
  error++;
  
} else { if (respuesta2.equals("f")) {
  
  System.out.println("respuesta correcta");
  
  acierto++;
  puntuacion++;
}
}

  System.out.println(" ");
  System.out.println("pregunta 3");
  System.out.print("caminar es un ejercicio anaeróbico ");

  String respuesta3 = s.nextLine();

  if (respuesta3.equals("v")) {
  
  System.out.println("respuesta incorrecta");
  
  error++;
  
} else { if (respuesta3.equals("f")) {
  
  System.out.println("respuesta correcta");
  
  acierto++;
  puntuacion++;
}
}
  System.out.println(" ");
  System.out.println("pregunta 4");
  System.out.print("El gazpacho lleva tomate ");

  String respuesta4 = s.nextLine();

  if (respuesta4.equals("v")) {
  
  System.out.println("respuesta correcta");
  
  acierto++;
  puntuacion++;
  
} else { if (respuesta4.equals("f")) {
  
  System.out.println("respuesta correcta");
  
  error++;
}
}

  System.out.println(" ");
  System.out.println("pregunta 5");
  System.out.print("plutón es un planeta enano ");

  String respuesta5 = s.nextLine();

  if (respuesta5.equals("v")) {
  
  System.out.println("respuesta correcta");
  
  acierto++;
  puntuacion++;
  
} else { if (respuesta5.equals("f")) {
  
  System.out.println("respuesta correcta");
  
  error++;
}
}
  System.out.println(" ");
  System.out.println("pregunta 6");
  System.out.print("el dia tiene 86.600 segundos ");

  String respuesta6 = s.nextLine();

  if (respuesta6.equals("v")) {
  
  System.out.println("respuesta incorrecta");
  
  error++;
  
} else { if (respuesta6.equals("f")) {
  
  System.out.println("respuesta correcta");
  
  acierto++;
  puntuacion++;
}
}
  System.out.println(" ");
  System.out.println("pregunta 7");
  System.out.print("Steve Jobs es el dueño de windows ");

  String respuesta7 = s.nextLine();

  if (respuesta7.equals("v")) {
  
  System.out.println("respuesta incorrecta");
  
  error++;
  
} else { if (respuesta7.equals("f")) {
  
  System.out.println("respuesta correcta");
  
  acierto++;
  puntuacion++;
}
}
  System.out.println(" ");
  System.out.println("pregunta 8");
  System.out.print("Marc Zuckerberg es el creador de Facebook ");

  String respuesta8 = s.nextLine();

  if (respuesta8.equals("v")) {
  
  System.out.println("respuesta correcta");
   
  acierto++;
  puntuacion++;
  
} else { if (respuesta8.equals("f")) {
  
  System.out.println("respuesta incorrecta");
  
  error++;
}
}
  System.out.println(" ");
  System.out.println("pregunta 9");
  System.out.print("El dolar vale más que el euro ");

  String respuesta9 = s.nextLine();

  if (respuesta9.equals("v")) {
  
  System.out.println("respuesta incorrecta");
  
  error++; 
  
} else { if (respuesta9.equals("f")) {
  
  System.out.println("respuesta correcta");
  
  acierto++;
  puntuacion++;  
  
}
}
  System.out.println(" ");
  System.out.println("pregunta 10");
  System.out.print("España tiene 14 comunidades autónomas ");

  String respuesta10 = s.nextLine();

  if (respuesta10.equals("v")) {
  
  System.out.println("respuesta incorrecta");
  
  error++; 
  
} else { if (respuesta10.equals("f")) {
  
  System.out.println("respuesta correcta");
  
  acierto++;
  puntuacion++;  
  
}
}
System.out.println(" ");
System.out.println("aciertos: " + acierto);
System.out.println("errores: " + error);
System.out.println("puntuación final: " + puntuacion);

}
}
  
  
  
  
  
  
  
  
