public class fredylopez01 {
    /*
 * EJERCICIO:
 * - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
 *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
 *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
 * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
 *   que representen todos los tipos de estructuras de control que existan
 *   en tu lenguaje:
 *   Condicionales, iterativas, excepciones...
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea un programa que imprima por consola todos los números comprendidos
 * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
 *
 * Seguro que al revisar detenidamente las posibilidades has descubierto algo nuevo.
 */

    public static void main(String[] args) {
        fredylopez01 reto = new fredylopez01();
        int a = 3, b = 2;
        boolean x = true, y = false;

        System.out.println("Operadores aritméticos:");
        reto.arithmetical(0, 1);

        System.out.println("Operadores Lógicos:");
        reto.logical(x, y);

        System.out.println("Operadores de asignación:");
        reto.assignment(a, b);

        System.out.println("Operadores de comparación:");
        reto.comparison(a, b);

        System.out.println("Operadores con bits:");
        reto.assignment(a, b);

        System.out.println("Estructura Condicionales:");
        reto.conditionals(a, b);

        System.out.println("Estructura Iterativas, ciclos o loops:");
        reto.iteratives(a, b);

        System.out.println("Estructura para capturar exceptions:");
        reto.exceptions();

        System.out.println("Ejercicio Extra:");
        reto.dificultadExtra();
    }

    public void arithmetical(int a, int b) {
        System.err.println("a = " + a + " b = " + b);
        System.out.println("Add -> a + b = " + (a + b));
        System.out.println("Sub -> a - b = " + (a - b));
        System.out.println("Product -> * b = " + (a * b));
        System.out.println("Div -> a / b = " + (a / b));
        System.out.println("Mod ->a % b = " + (a % b));
    }

    public void logical(boolean x, boolean y) {
        System.err.println("x = " + x + " y = " + y);
        System.out.println("AND lógico: x= true && y = false : " + (x && y));
        System.out.println("OR lógico: true || y = false : " + (x || y));
        System.out.println("NOT lógico: !true, : " + (!x));
    }

    public void assignment(int a, int b){
        System.err.println("a = " + a + " b = " + b);
        a = b;
        a += b; 
        System.out.println("Asignación:a(10) = b(5), a+=b -> " + a);
    }
    public void comparison(int a, int b) {
        System.err.println("a = " + a + " b = " + b);
        System.out.println("Igual -> a == b = " + (a == b));
        System.out.println("Diferente -> a != b = " + (a != b));
        System.out.println("Mayor que -> a > b = " + (a > b));
        System.out.println("Mayor o igual que -> a >= b = " + (a >= b));
        System.out.println("Menor que -> a < b = " + (a < b));
        System.out.println("Menor o igual que -> a <= b = " + (a <= b));
    }
    public void bits(int a, int b) {
        System.out.println("a = " + a + " b = " + b);
        System.out.println("AND bit a & b = " + (a & b));
        System.out.println("OR bit a | b = " + (a | b));
        System.out.println("XOR bit a ^ b = " + (a ^ b));
        System.out.println("NOT bit ~a = " + (~a));
        System.out.println("Desplazamiento a << 2 = " + (a << 2));
        System.out.println("Desplazamiento a >> 2 = " + (a >> 2));
    }
    public void conditionals(int a, int b) {
        System.out.println("a = " + a + " b = " + b);

        System.out.println("if-else or if:");
        if (a > b) System.out.println("a > b");
        else System.out.println("a < b");

        System.out.println("switch:");
        switch (a) {
            case 10 -> System.out.println("a = 10");
            case 5 -> System.out.println("a = 5");
            default -> System.out.println("a != 10 && a != 5");
        }
    }
    public void iteratives(int a, int b) {
        System.out.println("a = " + a + " b = " + b);

        System.out.println("*for:");
        for (int i = 0; i < a; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("*while:");
        while (b > 0) {
            System.out.println("b = " + b);
            b--;
        }
        
        System.out.println("*do while:");
        do {
            System.out.println("a = " + a);
            a--;
        } while (a > 0);
    }
    public void exceptions() {
        try {
            int[] arr = new int[5];
            System.out.println(arr[5]); // This will throw an exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e);
        }
    }
    public void dificultadExtra(){
        for(int i = 10; i <= 55; i++){
            if(i%3!=0 && i != 16 && i%2==0){
                System.out.print(i + ", ");
            }
        }
    }

}
