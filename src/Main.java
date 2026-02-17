import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        System.out.println("PRIMEROS COMANDOS DE GIT");

        System.out.println("NOMBRES - JAVA");


        System.out.println("1. COMANDOS DE GIT VISTOS");
        System.out.println("1. git add .");
        System.out.println("2. GIT COMMIT -M");
        System.out.println("3. GIT PUSH");
        System.out.println("4. GIT SWITCH");

*/

        // COMENTARIOS DE UNA LINEA

        /*
            comentarios multilinea

         */

        // Variables
        /*
        SON ESPACIOS EN MEMORIA QUE PERMITEN ALMACENAR DATOS DE TIPO ALFANUMERICOS
        QUE PUEDEN CAMBIAR DURANTE SU CICLO DE EJECUCION
         */

        // TIPOS VARIABLES

        /*
        // VARIABLES DE TIPO ENTERO

        int numero1 = 45;
        int numero2 = 15;

        int suma;

        int n1=45, n2=36, resta;

        suma = numero1 + numero2;

        System.out.println("LA SUMA DE: " + numero1 + " CON: " + numero2 + " ES:  " + suma);

        // Variables decimal

        double raiz, dato;

        dato = 145;
        raiz = Math.sqrt(dato);

        System.out.println("LA RAIZ DE: " + dato +" ES: " + Math.sqrt(dato) );
        System.out.println("LA RAIZ DE: " + dato +" ES: " + raiz );

        // Variables de tipo cadena de caracter

        String nombre = "Juan Lopez";

        System.out.println("HOLA BIENVENIDO: " + nombre.toUpperCase());

        // Variables de tipo caracter

        char letra = 'A';   // EQUIVALENTE EN CODIGO ASCII

        System.out.println("imprimir el char " + letra);


        // VARIABLES DE LOGICO

        boolean estado = false;

        System.out.println("EL VALOR LOGICO ACTUAL ES: " + estado);
*/

        /*

        // ENTRADA DE DATOS



        int n1, n2, suma;

        System.out.println("Ingrese el primer numero de tipo entero");
        n1 = teclado.nextInt();

        System.out.println("Ingrese el segundo valor de tipo entero");
        n2 = teclado.nextInt();

        suma = n1 + n2;

        System.out.println("LA SUMA DE : " + n1 + " CON: " + n2 + " ES: " + suma);
*/

        // CONDICIONALES if - else

        /*
            if(condicion){
                instruccion v;
            }else{
                instruccion f:
            }
         */
        /*
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero para calcular si es positivo o negativo");
        numero = teclado.nextInt();

        if (numero>0){
            System.out.println("Numero positivo");

        }else{
            System.out.println("Numero negativo");
        }
*/

        // if anidados

        /*
            if(condicion 1){
                instruccion v1;
            }else if (condicion 2){
                instruccion v2;
            }else if (condicion 3){
                instruccion v3;
            }else{
                instruccion f;
            }

         */

        /*
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero para calcular si es positivo o negativo");
        numero = teclado.nextInt();

        if (numero>0){
            System.out.println("Numero positivo");
        }else if (numero < 0 ){
            System.out.println("Numero negativo");
        }else {
            System.out.println("Numero es neutro o Cero");
        }
*/

        // switch case

         /*

            switch (condicion){

                case 1:
                        instruccion v1;
                break;

                case 2:
                         instruccion v2;

                break;

                case 3:
                         instruccion v3;

                break;

                case 4:
                         instruccion v4;

                break;

                default:
                         instruccion f;

            }
           1. Lunes
           2. Martes
           3. Miercoles
           4. Jueves
           5. Viernes
           6. Sabado
           7. Domingo

          */

        /*
        int dia;
        Scanner teclado = new Scanner(System.in);

        System.out.println("""
                           1. Lunes
                           2. Martes
                           3. Miercoles
                           4. Jueves
                           5. Viernes
                           6. Sabado
                           7. Domingo
                """);
        System.out.println("Ingrese un dia de la semana");
        dia = teclado.nextInt();

        switch (dia){
            case 1:
                System.out.println("Es Lunes");
                break;
            case 2:
                System.out.println("Es Martes");
                break;
            case 3:
                System.out.println("Es Miercoles");
                break;
            case 4:
                System.out.println("Es Jueves");
                break;
            case 5:
                System.out.println("Es Viernes");
                break;
            case 6:
                System.out.println("Es Sabado");
                break;
            case 7:
                System.out.println("Es Domingo");
                break;

            default:
                System.out.println("el dia no esta");
        }
*/

        // Ciclos - for - para

        /*
            for (inicio; limite; incremento){
                                 deremento

                        InstruccionV

            }
        */

        /*
        int suma;
        suma=0;
        for(int i=1; i <=100; i++){
            suma +=i;    // suma = suma +i
            System.out.println(i);

        }
        System.out.println("----------------------------------");
        System.out.println(suma);
        */
        /*
        int tabla;
        tabla = 8;
        for(int i=1; i<=10;i++){
            System.out.println(tabla + " * "+ i + " = "+ (tabla*i));

        }
*/

        // While - Mientras que

        /*
            while(condicion){
                instruccion v
            }

         */

        /*
        // SUMA DE N NUMEROS HASTA QUE EL USUARIO PRESIONE 0
        Scanner teclado = new Scanner(System.in);
        int suma=0, numero;
        numero = 1;
        while(numero != 0){
            System.out.println("Ingrese un numero");
            numero =  teclado.nextInt();

            suma+=numero;
        }
        System.out.println("Los numeros suman: " + suma);
*/

        // do while -- Hacer mientras que

        /*
            do{
                instruccion
            } while(condicion);

         */

        // EJERCICIO PARA SUMAR 5 NUMEROS

        Scanner teclado = new Scanner(System.in);
        int contador=0, numero, suma=0;

        do{
            System.out.println("INGRESE EL NUMERO A SUMAR");
            numero = teclado.nextInt();

            suma+= numero;

            contador ++;

        }while(contador <5);
        System.out.println("LA SUMA DE LOS NUMEROS INGRESADOS ES: " + suma );















    }
}