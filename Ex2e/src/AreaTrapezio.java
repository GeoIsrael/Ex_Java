import java.util.Scanner;

public class AreaTrapezio {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double base_menor, base_maior, altura, area;
		System.out.println("Descubra a área do seu Losango");
		System.out.println("Comprimento da sua base menor do seu Trapezio (em m)");
		base_menor = teclado.nextDouble();
		System.out.println("Comprimento da sua base maior do seu Trapezio (em m)");
		base_maior = teclado.nextDouble();
		System.out.println("Comprimento da altura seu Trapezio (em m)");
		altura = teclado.nextDouble();
		area = ((base_maior + base_menor) * altura) * 2;
		System.out.println("A Área do seu Trapezio é: " + area + "m²");

	}

}
