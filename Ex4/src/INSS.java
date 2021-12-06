import java.util.Scanner;

public class INSS {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double valor_hora, horas, aliquota, salario_bruto, salario_liquido;

		System.out.println("Digite o valor da sua hora de trabalho");
		valor_hora = teclado.nextDouble();

		System.out.println("Digite a sua jornada de trabalho (mensal) ");
		horas = teclado.nextDouble();

		System.out.println("Digite a sua aliquota do INSS");
		aliquota = teclado.nextDouble();
		salario_bruto = valor_hora * horas;
		salario_liquido = salario_bruto - (salario_bruto * aliquota);

		System.out.println("o seu salario bruto é: " + salario_bruto + " seu salario liquido é: " + salario_liquido);
	}
}
