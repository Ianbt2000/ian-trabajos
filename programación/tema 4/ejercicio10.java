import java.util.Scanner;

public class ejercicio10 {
 public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("indique su fecha de nacimiennto (mes y día) con un espacio ");
  
  int mes = s.nextInt();
  int dia = s.nextInt();
  
  String horoscopo;
  
  switch (mes) {
    
    case 1:
    
    if (dia <= 20 ) {
      
      horoscopo = "capricornio";
      System.out.print("su horóscopo es: " + horoscopo);
    
    } else {
      
      horoscopo = "acuario";
      System.out.print("su horóscopo es: " + horoscopo);
    } 
    break;
    
    case 2:
    
    if (dia <= 19) {
      
      horoscopo = "acuario";
      System.out.print("su horóscopo es: " + horoscopo);
    
    } else {
      
      horoscopo = "piscis";
      System.out.print("su horóscopo es: " + horoscopo);
    } 
    break;
  
    case 3:
    
    if (dia <= 20) {
      
      horoscopo = "piscis";
      System.out.print("su horóscopo es: " + horoscopo);
    
    } else {
      
      horoscopo = "aries";
      System.out.print("su horóscopo es: " + horoscopo);
    } 
    break;
  
    case 4:
    
    if (dia <= 20) {
      
      horoscopo = "aries";
      System.out.print("su horóscopo es: " + horoscopo);
    
    } else {
      
      horoscopo = "tauro";
      System.out.print("su horóscopo es: " + horoscopo);
    } 
    break;
  
    case 5:
    
    if (dia <= 21) {
      
      horoscopo = "tauro";
      System.out.print("su horóscopo es: " + horoscopo);
    
    } else {
      
      horoscopo = "géminis";
      System.out.print("su horóscopo es: " + horoscopo);
    } 
    break;

    case 6:
    
    if (dia <= 21) {
      
      horoscopo = "géminis";
      System.out.print("su horóscopo es: " + horoscopo);
    
    } else {
      
      horoscopo = "cáncer";
      System.out.print("su horóscopo es: " + horoscopo);
    } 
    break;
    
    case 7:
    
    if (dia <= 23) {
      
      horoscopo = "cáncer";
      System.out.print("su horóscopo es: " + horoscopo);
    
    } else {
      
      horoscopo = "leo";
      System.out.print("su horóscopo es: " + horoscopo);
    } 
    break;
    
    case 8:
    
    if (dia <= 23) {
      
      horoscopo = "leo";
      System.out.print("su horóscopo es: " + horoscopo);
    
    } else {
      
      horoscopo = "virgo";
      System.out.print("su horóscopo es: " + horoscopo);
    } 
    break;
    
    case 9:
    
    if (dia <= 23) {
      
      horoscopo = "virgo";
      System.out.print("su horóscopo es: " + horoscopo);
    
    } else {
      
      horoscopo = "libra";
      System.out.print("su horóscopo es: " + horoscopo);
    } 
    break;
    
    case 10:
    
    if (dia <= 23) {
      
      horoscopo = "libra";
      System.out.print("su horóscopo es: " + horoscopo);
    
    } else {
      
      horoscopo = "escorpio";
      System.out.print("su horóscopo es: " + horoscopo);
    } 
    break;
    
    case 11:
    
    if (dia <= 22) {
      
      horoscopo = "escorpio";
      System.out.print("su horóscopo es: " + horoscopo);
    
    } else {
      
      horoscopo = "sagitario";
      System.out.print("su horóscopo es: " + horoscopo);
    } 
    break;
    
    case 12:
    
    if (dia <= 21) {
      
      horoscopo = "sagitario";
      System.out.print("su horóscopo es: " + horoscopo);
    
    } else {
      
      horoscopo = "capricornio";
      System.out.print("su horóscopo es: " + horoscopo);
    } 
    break;
  }
    
    
  }
}
    
    
    
    
