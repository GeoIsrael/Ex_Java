import java.util.Scanner;

public class AreaCilindro {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double volume, pi, raio, altura;
		pi = 3.14;
		System.out.println("Descubra a área do seu cilindro");

		System.out.println("Comprimento do raio do seu cilindro (em m)");
		raio = teclado.nextDouble();
		System.out.println("Comprimento da altura do seu cilindro (em m)");
		altura = teclado.nextDouble();
		
		
		volume= pi*raio*raio*altura;

		System.out.println("A Área do seu cubo é: " + volume);
	}
}
