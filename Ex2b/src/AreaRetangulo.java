import java.util.Scanner;

public class AreaRetangulo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Descubra a área do seu Retangulo");
		int base, altura, area;
		System.out.println("Comprimento da base do seu Triangulo (em m)");
		base= teclado.nextInt();
		System.out.println("Comprimento da Altura do seu Triangulo (em m)");
		altura=teclado.nextInt();
		area=base*altura;
		System.out.println("A Área do seu triangulo é: "+area+"m²");
		
	}
}

