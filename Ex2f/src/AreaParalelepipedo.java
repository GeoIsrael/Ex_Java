import java.util.Scanner;

public class AreaParalelepipedo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int altura, largura, profundidade, area;
		System.out.println("Descubra a �rea do seu paralelep�pedo");
		System.out.println("Comprimento da altura do seu paralelep�pedo (em m)");
		altura = teclado.nextInt();
		System.out.println("Comprimento da largura do seu paralelep�pedo (em m)");
		largura = teclado.nextInt();
		System.out.println("Comprimento da profundidade do seu paralelep�pedo (em m)");
		profundidade = teclado.nextInt();
		area = altura * largura * profundidade;
		System.out.println("A �rea do seu paralelep�pedo �: " + area + "m�");

	}
}
