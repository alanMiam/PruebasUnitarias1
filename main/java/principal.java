
public class principal {
    
    public static void main (String[] args){
        
        int a =200;int b=2;
        operaciones operacion1 = new operaciones();
        System.out.println("La suma es: "+operacion1.suma(a, b));
        System.out.println("La resta es: "+operacion1.resta(a, b));
        
        
        System.out.println("El resultado de: "+a+"^"+b+" es: "+operacion1.expon(a, b));
        System.out.println("El "+b+"% de "+a+" es: "+operacion1.porcent(a, b));
        System.out.println("La raíz cuadrada de "+a+" es: "+operacion1.raiz2(a));
    }
}
