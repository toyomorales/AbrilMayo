
package abril;

import java.util.Scanner;


public class Abril {

    //definir un metodo con valores estático: public, private, protected
    
    
    
    //Crear un metodo dinámico, es decir, con parámetros
   
    
    //Crear una función
    
    
   
    
    public static void main(String[] args) {
       
        //Creo un objeto de la clase Abril
        //Abril a=new Abril();
        
        Mayo m=new Mayo();
        Scanner s=new Scanner(System.in);
        //a.sumando();
        int c,d;
        System.out.println("Ingrese el valor en c: ");
        c=s.nextInt();
        System.out.println("Ingrese el valor en d: ");
        d=s.nextInt();
        //a.sumar(c, d);
        int res1;
        res1=m.sumita(c, d);
        System.out.println("La sumita es: "+res1);
    }
     
    
}
