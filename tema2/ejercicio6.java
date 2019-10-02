public class ejercicio6 {
 public static void main(String[] args) {
 
 double precioNoIVA;
 double IVA= 0.21;
 double totalIVA;
 double precioTotal;
 
 System.out.print("Precio sin IVA: ");
 precioNoIVA = 200;
 System.out.println(precioNoIVA + "€");
 totalIVA = precioNoIVA * IVA;
 precioTotal = precioNoIVA + totalIVA;
 System.out.println("Precio con IVA: " + precioTotal +"€");
 }
}

