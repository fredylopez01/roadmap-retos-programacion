public class fredylopez01 {
/*
 * EJERCICIO:
 * Entiende el concepto de recursividad creando una función recursiva que imprima
 * números del 100 al 0.
 *
 * DIFICULTAD EXTRA (opcional):
 * Utiliza el concepto de recursividad para:
 * - Calcular el factorial de un número concreto (la función recibe ese número).
 * - Calcular el valor de un elemento concreto (según su posición) en la 
 *   sucesión de Fibonacci (la función recibe la posición).
 */

    public static void main(String[] args) {
        System.out.println("----------Numeros menores de n---------");
        numbersDown(100);

        System.out.println("----------Factorial de n---------");
        System.out.println(factorial(5));

        System.out.println("----------Numero de la seríe fibonasi segun la posición---------");
        System.out.println(numberFibonasi(7));
    }

    public static int numbersDown(int n){
        System.out.println(n);
        return n<1?n:numbersDown(n-1);
    }

    public static int factorial(int n){
        return n<=1?n:n*factorial(n-1);
    }

    public static int numberFibonasi(int i){
        return i==1?0:i==2||i==3?1:numberFibonasi(i-2)+numberFibonasi(i-1);
    }
}
