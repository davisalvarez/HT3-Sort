
import java.util.Random;

/*
Algoritmos y Estructura de datos
Nombres: Marlon Fuentes, Davis Alvarez, Joyce Miranda
Fecha: 01/08/16
Proposito: En este programa se utiliza el codigo encontrado en internet, cuya
referencia se encuentra mas adelante. Este usara el metodo mergesort para 
ordenar las listas. 
Enlace: http://www.java2novice.com/java-sorting-algorithms/merge-sort/
 */

/**
 *
 * Creacion de los array, y temMergeArr
 */
public class MyMergeSort {
    private int[] array;
    private int[] tempMergArr;
    private int length;
 
     
    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }
 
    private void doMergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }
    /*Ciclo para generar la lista random*/
	public int[] generarNumeros(int cant, int max){
		int cont=0;
		int[] array = new int[cant] ;
		Random rnd = new Random();
		int n=0;
		do{
			n=(int)(rnd.nextDouble() * max + 1);
			//System.out.println((int)(rnd.nextDouble() * max + 1));
			array[cont] = n;
			cont++;
			//System.out.println(lista[cont -1]);
		}while(cont<cant-1);
		return array;
	}
   
    }



