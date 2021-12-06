import java.util.Scanner;

public class juros {
public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	double valor, taxa, tempo, valor_final;
	
	System.out.println("Insira o valor do emprestimo");
	valor= teclado .nextDouble();
	
	System.out.println("Insira em quantos meses você pretende pagar: ");
	tempo = teclado .nextDouble();
	
	System.out.println("Informe a taxa de Juros desejada: ");
	taxa= teclado .nextDouble();
	
	valor_final= valor* (taxa/100)* tempo+valor;
	
	System.out.println("O valor pago apos o perodo estipulado será: " + valor_final);
	
}
}
