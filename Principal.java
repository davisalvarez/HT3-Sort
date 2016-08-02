package org.uvg.principal;

import org.uvg.utilidades.Utilidades;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utilidades u =new Utilidades();
		
                RadixSort u =new RadixSort();
                MyMergeSort v = new MyMergeSort();
                quicksort m = new quicksort();
                
                m.sort(u.generarNumeros(3000,3000));
                u.sort(u.generarNumeros(3000,3000));
                v.sort(u.generarNumeros(3000,3000));
	}

}
