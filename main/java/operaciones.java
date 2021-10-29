

/**
 *
 * @author PC
 */
public class operaciones {
    
     public  int  suma( int a,  int b){
        return a+b;
    }

    public  int  resta( int a,  int b){
        return a-b;
    }
    
    public  int  multiplicacion( int a,  int b){
        return a*b;
    }
    
    public  int  division( int a,  int b){
        return a/b;
    }
    
    
    public double expon(double a, double b){
        return Math.pow(a, b);
    }
    
    public double raiz2(int a){
      return Math.sqrt(a); 
    }
    
    public double porcent(int a, int b){
      return   (a * b) / 100;
    }
    
}
