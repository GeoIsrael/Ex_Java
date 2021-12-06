import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		Scanner Teclado = new Scanner (System.in);
		float base, altura, area;
		System.out.println("Descubra a área do seu Triangulo");
		System.out.println("Comprimento da base do seu Triangulo (em m)");
		base= Teclado.nextFloat();
		System.out.println("Comprimento da Altura do seu Triangulo (em m)");
		altura=Teclado.nextFloat();
		area= (base*altura)/2;
		System.out.println("A Área do seu triangulo é: "+area+"m²");
	}
}
