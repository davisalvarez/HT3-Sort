package org.uvg.sort;

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

public class GnomeSort {
	public static void gnomeSort (Comparable[] lista){
		int index=0;
		Comparable tempVal=0;
		for ( index=1; index<lista.length;){
			if (lista[index-1].compareTo(lista[index])<0){
				index++;
			} 
			else{
				tempVal=  lista[index];
				lista[index] =lista[index-1];
				lista[index-1]= tempVal;
				--index;
				if (index==0){
					index=1;
				}
			}
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
