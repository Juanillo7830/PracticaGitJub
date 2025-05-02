/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora5;

import java.util.Scanner;

public class Main {
    public static void panel(){
        System.out.println("##############################");
        System.out.println("###     *CALCULADORA* 123     ###");
        System.out.println("### 1. para sumar          ###");
        System.out.println("### 2. para restar         ###");
        System.out.println("### 3. para multiplicar    ###");
        System.out.println("### 4. para dividir        ###");
        System.out.println("### 5. para raiz cuadrada  ###");
        System.out.println("### 6. para potencia       ###");
        System.out.println("### 7. para factorial      ###");
        System.out.println("### 8. para logaritmo      ###");
        System.out.println("### 9. para salir          ###");
        System.out.println("##############################");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a=0;
        double b=0;
        double z=5;
        Calculadora calculadora1 = new Calculadora(a, b);
        boolean fin = true;  
       
         
            try{
                
            
            do { 
                panel();
                int numero = teclado.nextInt();
                switch (numero) {
                    case 1:
                        System.out.println("###SUMA###");
                        System.out.println("Introduce el primer numero ");
                        a = teclado.nextDouble();
                        System.out.println("Introduce el segundo numero ");
                        b = teclado.nextDouble();
                        calculadora1.suma(a, b);
                        break;
                    case 2:
                        System.out.println("###RESTA###");
                        System.out.println("Introduce el primer numero ");
                        a = teclado.nextDouble();
                        System.out.println("Introduce el segundo numero");
                        b = teclado.nextDouble();
                        calculadora1.resta(a, b);
                        break;
                    case 3:
                        System.out.println("###MULTIPLICACION###");
                        System.out.println("Introduce el primer numero ");
                        a = teclado.nextDouble();
                        System.out.println("Introduce el segundo numero");
                        b = teclado.nextDouble();
                        calculadora1.multiplicacion(a, b);
                        break;
                    case 4:
                        System.out.println("###DIVISION###");
                         System.out.println("Introduce el primer digito ");
                        a = teclado.nextDouble();
                        System.out.println(" Introduce el segundo digito");
                        b = teclado.nextDouble();
                        calculadora1.division(a, b);
                        break;
                    case 5:
                        System.out.println("###RAIZ CUADRADA###");
                        System.out.println("Introduce un numero para realizarle"
                                + " la raiz cuadrada");
                        a = teclado.nextDouble();
                        calculadora1.raizCuadrada(a);
                        break;
                    case 6:
                        System.out.println("###POTENCIA###");
                        System.out.println("introduce la base a realizar ");
                        a = teclado.nextDouble();
                        System.out.println(" introduce la potencia que deseas "
                                + "que se realice");
                        b = teclado.nextDouble();
                        calculadora1.potencia(a, b);
                        
                        break;
                    case 7:
                        System.out.println("###FACTORIAL###");
                        System.out.println(" Introduce el numero para "
                                + "obtener su factorial ");
                        a = teclado.nextDouble();
                        calculadora1.factorial(a);
                        break;
                    case 8:
                        System.out.println("###LOGARITMO###");
                        System.out.println(" introduce el numero al que deseas"
                                + " realizar el logaritmo");
                        a = teclado.nextDouble();
                        calculadora1.logaritmo(a);
                        break;
                    case 9:
                        fin=false;
                        System.out.println("Gracias por utilizar nuestra"
                                + " calculadora");
                        break;
                    default:
                        System.out.println("Error: " + " Numero no esperado ");
                        break;
                }
           } while (fin == true); 
        } catch (Exception e) {
            System.out.println("ERROR: " + e.toString());
                
        }
        
    
    }
}
