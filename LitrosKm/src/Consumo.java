import java.util.Scanner;

public class Consumo {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		float  km, l;
		System.out.println("Digite a Distancia (em Km)");
		km = teclado.nextInt();
		System.out.println("Digite o Consumo (Em litros)");
		l = teclado.nextInt();
		System.out.println("o seu consumo é: " + km/l+ " Km/l");
	}
}
