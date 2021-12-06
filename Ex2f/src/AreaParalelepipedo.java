import java.util.Scanner;

public class AreaParalelepipedo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int altura, largura, profundidade, area;
		System.out.println("Descubra a área do seu paralelepípedo");
		System.out.println("Comprimento da altura do seu paralelepípedo (em m)");
		altura = teclado.nextInt();
		System.out.println("Comprimento da largura do seu paralelepípedo (em m)");
		largura = teclado.nextInt();
		System.out.println("Comprimento da profundidade do seu paralelepípedo (em m)");
		profundidade = teclado.nextInt();
		area = altura * largura * profundidade;
		System.out.println("A Área do seu paralelepípedo é: " + area + "m²");

	}
}
