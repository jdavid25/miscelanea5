package miscelanea5;

import java.util.Scanner;

public class Miscelanea5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un valor para (x)");
        // se lee el número que será el valor la variable "x"
        double x = scanner.nextDouble();
        System.out.println("Digite el número de la operacion a realizar");
        System.out.println("1. calcular valor para n dado");
        System.out.println("2. calcular valor de n");
        //en el ejercicio se pide realizar dos acciones diferentes por lo cual se lee la opción a realizar
        int opcion = scanner.nextInt();
        //se verifica la opción ingresada
        if (opcion == 1) {
            //en esta opción se calcula el valor de la formula x^n/n! para un número n dado mayor que 0 
            double sumatoria = 1;
            System.out.println("Introduzca un número entero (n), mayor que cero");
            //se lee el número ingresado y se asigna a la variable "n"
            int n = scanner.nextInt();
            //se emplea el ciclo for para ir desde 1 hasta n
            for (int i = 1; i <= n; i++) {
                int factorial = 1;
                //se calcula el factorial de n
                for(int l = 1; l <=i; l++){
                    factorial = factorial * l;
                }
                //System.out.println("valor i "+i);
                //System.out.println("factorial "+ factorial);
                //System.out.println("valor de s "+(Math.pow(x, i) / factorial));
                //se calcula el valor de la formula x^n/n! en n igual a i y se agrega a 
                //la variable acumuladora "sumatoria"
                sumatoria += Math.pow(x, i) / factorial;
            }
            System.out.println("la sumatoria es "+sumatoria);
        }else if(opcion == 2){
            //en esta opción se calcula el valor de n tal que x^n/n! < e (sumatoria de x^n/n!)
            double sumatoria = 1;
            int n = 1;
            boolean continuar = true;
            System.out.println("Introduzca el valor de E");
            //se lee el valor ingresado para la variable "e"
            double e = scanner.nextDouble();
            //se emplea el ciclo while para calcular el valor de n
            while (continuar) {
                //System.out.println("valor n calculado "+n);
                int factorial = 1;
                //se calcula el factorial de n
                for(int i = 1; i <=n; i++){
                    factorial = factorial * i;
                }
                //System.out.println("factorial n = "+n);
                //se calcula el valor de la formula x^n/n! en n y se agrega a 
                //la variable acumuladora "sumatoria"
                sumatoria += Math.pow(x, n) / factorial; 
                //System.out.println("valor sumatoria " + sumatoria);
                //se verifica que la sumatoria sea menor que el valor de e ingresado
                //si es asi se continua calculando valores para n, incrementando n en 1
                //si no se reduce n en 1 y se sale del ciclo while
                if (sumatoria < e){
                    n++;
                }else{
                    n--;
                    continuar = false;
                }
            }
            System.out.println("El valor de n deberia ser "+n);
        }else{
            //si no se ingresa ninguna de las opciones validas no se realiza ningun calculo
            System.out.println("Debe digitar un valor valido");
        }
    }

}
