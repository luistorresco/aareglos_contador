/*Hacer un programa que lea un vector de tamaño N, de números enteros, 
y luego me imprima la cantidad de elementos de las posiciones pares que 
son mayores que el promedio de los elementos de las posiciones impares 
(tomar la posición 0 como par)
 */
package arregloscontador;

import java.util.Scanner;

/**
 *
 * @author luistorresco
 */
public class Arregloscontador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        float prom,acum=0;
        int n,cont=0,cont_elem=0;
        //Lectura de la cantidad de elementos del vector
        System.out.print("Digite cantidad de elementos del vector ");
        n=objread.nextInt();
        //Definir el vector
        int[] datos=new int[n];
        /*Lectura del vector y promedio de los elementos 
        de las posiciones impares*/
        for (int i = 0; i < n; i++) {
            System.out.print("Digite elemento del vector ");
            datos[i]=objread.nextInt();
            if (i % 2 == 1){
                acum+=datos[i]; //equivalente a acum=acum + datos[i]
                cont++;
            }
        }//fin para
        //Contar elementos posiciones pares
        prom=acum/cont;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && datos[i] > prom)
			cont_elem++;
        }//fin para
        System.out.println("\n La cantidad de elementos mayores es "+cont_elem);
    }  
}
