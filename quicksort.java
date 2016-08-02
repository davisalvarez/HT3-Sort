/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marlon
 */


import java.util.Random;

public class quicksort {
    
    public static void sort(Comparable[] a) {
        quicksort(a, 0, a.length-1);
    }

    private static void quicksort(Comparable[] a, int lo, int hi) {
        if(lo >= hi) return;
        int pi = partition(a, lo, hi);
        quicksort(a, lo, pi-1);
        quicksort(a, pi+1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo + 1;
        int j = hi;

        while(i <= j) {
            if(a[i].compareTo(a[lo]) <= 0) { 
                i++; 
            }
            else if(a[j].compareTo(a[lo]) > 0) { 
                j--;
            }
            else if(j < i) {
                break;
            }
            else
                exchange(a, i, j);
        }
        exchange(a, lo, j);
        return j;
    }

    private static void exchange(Object[] a, int i, int j) {
        Object tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    
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
