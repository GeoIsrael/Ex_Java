import java.util.Scanner;

public class CombustivelGastos {
public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	double consumo_medio = 12, distancia, vel_media, hora, litros_ulizados;
	
	System.out.println("quantas horas serão gastas na viagem");
	hora= teclado .nextDouble();
	
	System.out.println("Digite a sua Velocidade Media: ");
	vel_media= teclado .nextDouble();
	
	distancia = vel_media/hora;
	litros_ulizados = distancia/consumo_medio;
	
	System.out.println("Quantidade de litros de combustível gastos em sua viagem foi:" + litros_ulizados);
	
	
}
}
