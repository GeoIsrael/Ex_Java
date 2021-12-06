import java.util.Scanner;

public class AreaQuadrado {
	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);
		int l1, l2, area;
		System.out.println("Comprimento do primeiro lado seu quadrado (em m)");
		l1 = Teclado.nextInt();
		System.out.println("Comprimento do Segundo lado seu quadrado (em m)");
		l2 = Teclado.nextInt();
		area = l1 * l2;
		System.out.println("A Área do seu Quadrado é: " + area + "m²");
	}
}
