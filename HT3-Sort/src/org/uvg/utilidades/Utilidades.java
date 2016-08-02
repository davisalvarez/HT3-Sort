package org.uvg.utilidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class Utilidades {
	
	public void lectorArchivo(){
		File datos;
		FileReader datosLeidos=null;
		BufferedReader br;
		try{
			datos = new File ("./datos.txt");
			datosLeidos = new FileReader (datos);
			br = new BufferedReader(datosLeidos);
			
			String linea;
			while((linea=br.readLine())!=null){
            		String [] expresionDividida = linea.split(" ");
	            	//expresiones.add(expresionDividida);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try{                    
            if( null != datosLeidos ){   
            	datosLeidos.close();     
            }                  
         }catch (Exception e){ 
            e.printStackTrace();
         }
	}
	
	public int[] generarNumeros(int cant, int max){
		int cont=0;
		int[] lista = new int[cant] ;
		Random rnd = new Random();
		int n=0;
		do{
			n=(int)(rnd.nextDouble() * max + 1);
			//System.out.println((int)(rnd.nextDouble() * max + 1));
			lista[cont] = n;
			cont++;
			//System.out.println(lista[cont -1]);
		}while(cont<cant-1);
		return lista;
	}
}
