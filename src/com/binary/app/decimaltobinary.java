package com.binary.app;
import java.util.Scanner;
public class decimaltobinary 
{

	public static void main(String[] args) 
	{
		//se declaran las variables a utilizar
		int numero=0; //numero a evaluar
		String binario="";//string vacio para guardar el numero binario
		String cadenainvertida=""; //cadena invertida del codigo binario
		
		//se instancia la clase escaner en el objeto input
		Scanner input=new Scanner(System.in);
		
		//se solicita al usuario el numero a evaluar
		System.out.println("Dame un Numero para convertir a Binario: ");
		numero=input.nextInt();
		
		//auxiliar para dividir entre dos en el proceso
		int aux=numero; 
		
		//se cierra la entrada de datos por el usuario
		input.close();
		
		// se analiza el resto de modulo 2 de la división y se asigna un 0 o 1 a la cadena binario
		// se divide el numero entre 2 hasta que el numero sea menor a 0 
		while(aux>0) {
			
			if(aux%2==0)
			{
				binario=binario+0;
			}
			else
			{
				binario=binario+1;
			}
			
			aux=aux/2;	
		}
		
		//se invierte el resultado de la cadena binario
		StringBuilder builder=new StringBuilder(binario);
		cadenainvertida=builder.reverse().toString();
		
		//se imprime el valor binario
		System.out.println("El Numero "+numero+" en binario es: "+cadenainvertida);
		
		
	}

}
