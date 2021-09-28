/*
 * No le entiendo a mi propio código. XDXDXD
 * :'v
 */
package calculadora.simple;

import java.util.Scanner;
/**
 *
 * @author Angelito 7u7
 */
public class CalculadoraSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op = 0;
        double n1, n2, s, m, d, r;
        do{
            System.out.println("Seleccione la operación deseada");
            System.out.println("*********** \n"+
                "[1] SUMAR \n"+
                "[2] RESTAR \n"+
                "[3]MULTIPLICAR \n"+
                "[4]DIVIDIR \n"+
                "[5]SALIR \n"+
                "INGRESA UNA OPCION: ");
            Scanner teclado = new Scanner(System.in);
            op = teclado.nextInt();
            switch(op){
                case 1:
                    System.out.println("Ingrese un numero 1");
                    Scanner numero1 = new Scanner(System.in);
                    System.out.println("Ingrese el numero 2");
                    Scanner numero2 = new Scanner(System.in);
                    
                    s=numero1.nextDouble()+numero2.nextDouble();
                    System.out.println("La suma es: "+s);
                    break;
                case 2:
                    System.out.println("Ingrese un numero 1");
                    Scanner numero3 = new Scanner(System.in);
                    System.out.println("Ingrese el numero 2");
                    Scanner numero4 = new Scanner(System.in);
                    
                    r=numero3.nextDouble()-numero4.nextDouble();
                    System.out.println("La resta es: "+r);
                    break;
                case 3:
                    System.out.println("Ingrese un numero 1");
                    Scanner numero5 = new Scanner(System.in);
                    System.out.println("Ingrese el numero 2");
                    Scanner numero6 = new Scanner(System.in);
                    
                    m=numero5.nextDouble()*numero6.nextDouble();
                    System.out.println("La multiplicacion es: "+m);
                    break;
                case 4:
                    System.out.println("Ingrese un numero 1");
                    Scanner numero7 = new Scanner(System.in);
                    System.out.println("Ingrese el numero 2");
                    Scanner numero8 = new Scanner(System.in);
                    
                    d=numero7.nextDouble()/numero8.nextDouble();
                    System.out.println("La division es: "+d);
                    break;
                case 5:
                    break;
            
            }   
        } while(op!=5);
    }
}
