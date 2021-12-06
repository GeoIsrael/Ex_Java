import java.util.Scanner;

public class Consumo {
public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	double  salario, unidade, consumidos, reais, descontos;
	System.out.println("Quanto vale o salario minimo?");
	salario= teclado .nextDouble();
	System.out.println("Qual a quantidade de Kw consumida");
	consumidos= teclado .nextDouble();
	unidade = salario/700;
	reais= unidade*consumidos;
	descontos= reais*0.90;
	System.out.println("O seu desconto é:"+ descontos);
			
}
}
