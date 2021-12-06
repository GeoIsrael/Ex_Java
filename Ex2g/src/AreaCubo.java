import java.util.Scanner;

public class AreaCubo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int lado1, lado2, lado3, area;
		System.out.println("Descubra a área do seu cubo");
		System.out.println("Comprimento do primeiro lado do seu cubo (em m)");
		lado1= teclado .nextInt();
		System.out.println("Comprimento do segundo lado do seu cubo (em m)");
		lado2= teclado .nextInt();
		System.out.println("Comprimento do terceiro lado do seu cubo (em m)");
		lado3= teclado .nextInt();
		area= lado1*lado2*lado3;
		System.out.println("A Área do seu cubo é: " + area + "m²");
	}
}
