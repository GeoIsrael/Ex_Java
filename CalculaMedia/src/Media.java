import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, media;
		System.out.println("por favor, digite a primeiro nota!");
		nota1 = teclado.nextDouble();
		System.out.println("por favor, digite a Segunda nota!");
		nota2 = teclado.nextDouble();
		media = (nota1 + nota2) / 2;

		if (media >= 7) {
			System.out.println("a sua media � igual a: " + media + " Voc� foi APROVADO");
		} else if(media>=5 ){
			System.out.println("a sua media � igual a: " + media + " Voc� foi para a RECUPERA��O");
		} else {
			System.out.println("a sua media � igual a: " + media + " Voc� foi REPROVADO");
		}

	}
}
