 

// o Erro est� no codigo "distancia = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), 1/2)" 
// a onde o calculo est� sendo por 1/2, isso est� fazendo com que retorne um valor inteiro
// e por isso sempre a dist�ncia � 1.0
 
// para corrigir o codigo � somente trocar o 1/2 por 2, veja a seguir:

import java.util.Scanner;
public class questao3 {
 public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
 double x1, y1, x2, y2, distancia;
 
 System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
 x1 = teclado.nextFloat();
 y1 = teclado.nextFloat();
 x2 = teclado.nextFloat();
 y2 = teclado.nextFloat();
 
 distancia = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), 2);
 System.out.println("A dist�ncia �: " + distancia);
 }
}

	 
	 
	 
	   


