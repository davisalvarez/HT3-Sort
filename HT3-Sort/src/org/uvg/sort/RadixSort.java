
import java.util.Random;


/*
Algoritmos y Estructura de datos
Nombres: Marlon Fuentes, Davis Alvarez, Joyce Miranda
Fecha: 01/08/16
Proposito: En este programa se utiliza el codigo encontrado en internet, cuya
referencia se encuentra mas adelante. Este usara el metodo Radixsort para 
ordenar las listas. Aqui tambien se crearan las listas random 
Enlace: http://www.sanfoundry.com/java-program-implement-radix-sort/
 */

public class RadixSort {
     public static void sort( int[] a)
    {
        int i, m = a[0], exp = 1, n = a.length;
        int[] b = new int[10];
        for (i = 1; i < n; i++)
            if (a[i] > m)
                m = a[i];
        while (m / exp > 0)
        {
            int[] bucket = new int[10];
 
            for (i = 0; i < n; i++)
                bucket[(a[i] / exp) % 10]++;
            for (i = 1; i < 10; i++)
                bucket[i] += bucket[i - 1];
            for (i = n - 1; i >= 0; i--)
                b[--bucket[(a[i] / exp) % 10]] = a[i];
            for (i = 0; i < n; i++)
                a[i] = b[i];
            exp *= 10;        
        }
    }    
    //Ciclo para la lista random
  	public int[] generarNumeros(int cant, int max){
		int cont=0;
		int[] arr = new int[cant] ;
		Random rnd = new Random();
		int n=0;
		do{
			n=(int)(rnd.nextDouble() * max + 1);
			//System.out.println((int)(rnd.nextDouble() * max + 1));
			arr[cont] = n;
			cont++;
			//System.out.println(lista[cont -1]);
		}while(cont<cant-1);
		return arr;
	}
        
}

