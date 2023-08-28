package primer_proyecto;
/**
 *
 * @author SENA
 */
//para importr una libreria se usa la palabra clave import
//import java.util.*;
//el "*" indica importar todo lo que esta dentro de una carpeta
import java.util.Scanner;
public class Primer_Proyecto {
    public static void main(String[] args) {
        // TODO code application logic here
        //primero mostrar un mensaje por consola
        System.out.println("Hola Mundo");    
        //segundo definir una variable y asignar un valor
        /*
        para definir una variable primero se escribe el tio de dato
        segundo el nombre de la variable ejemplo:
        int numero;
        */
        String nombre;
        /*para la lectura de teclado
        se crea un objeto de tipo scanner el nombre del objeto
        y por ultimo se instancia la clase
        ejemplo:
        Scanner sc=new Scanner(System.in);
        new se utiliza para instanciiar un nuevo objeto
        */
        Scanner sc=new Scanner(System.in);
        int numero,edad;
        numero = 10;
        System.out.println(numero);
        //este proceso se llama concatenar
        System.out.println("el resultado es"+" "+8+8);
        System.out.println("el resultado es"+" "+(8+8));
        //se va a solicitar los valores por teclado
        System.out.println("ingrese su nombre");
        /*para poder leer se indica donde se va a guardar el valor
        
        */
        nombre=sc.nextLine();
        System.out.println("hola"+" "+nombre);
        System.out.println("ingrese su edad");
        edad=sc.nextInt();
        System.out.println("su edad es"+" "+edad);
        /*
        si (condicion) entonces
        if (condicion){
        
        seccion verdadera
        }
        else{
        seccion falsa
        }
        */
        if (edad>=18){
            System.out.println("eres mayor de edad");
        }else{
            System.out.println("sos 4menor de edad");
        }
        System.out.println("Bievenido a la calculadora");
        System.out.println("ingrese 1 para sumar");
        System.out.println("ingrese 2 para restar");
        System.out.println("ingrese 3 para multiplicar");
        System.out.println("ingrese 4 para dividir");
        int opcion=sc.nextInt();
        /*
        para manejar casos multiples se utiliza la estructura
        switch(variable);{
        case 1;
        break
        case 2;
        break
        case 3;
        break
        case 4;
        break
        case n;
        */
        int num1,num2;
        System.out.println("ingrese el primer valor");
        num1=sc.nextInt();
        System.out.println("ingrese el segundo valor");
        num2=sc.nextInt();
        int resultado;
        switch (opcion){
            case 1 -> {
                resultado=num1+num2;
                System.out.println("el resultado de la suma es "+resultado);
                //break cierra el caso
            }
            case 2 -> {
                resultado=num1-num2;
                System.out.println("el resultado es "+resultado);
            }
            case 3 -> {
                resultado=num1*num2;
                System.out.println("el resultado es "+resultado);
            }
            case 4 -> {
                double resultado2;
                resultado2=num1/num2;
                System.out.println("el resultado es "+resultado2);
            }
            default -> 
                /*
                Se utiliza cuando la opcion ingresada no esta en el caso
                */
                System.out.println("opcion no valida");
        }
    }
}