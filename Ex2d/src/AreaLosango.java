import java.util.Scanner;

public class AreaLosango {
	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);
		int diagonal1, diagonal2, area;
		System.out.println("Descubra a área do seu Losango");
		System.out.println("Comprimento da primeira Diagonal do seu Losango (em m)");
		diagonal1 = Teclado.nextInt();
		System.out.println("Comprimento da Segunda Diagonal do seu Losango (em m)");
		diagonal2 = Teclado.nextInt();
		area = diagonal1 * diagonal2;
		System.out.println("A Área do seu Losango é: " + area + "m²");
	}
}
