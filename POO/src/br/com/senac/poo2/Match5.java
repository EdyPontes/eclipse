package br.com.senac.poo2;
// quando a classe modelo n�o estiver no mesmo pacote � necess�rio fazer a importa��o
import br.com.senac.poo.Carro;

public class Match5 {

	public static void main(String[] args) {
		Carro speed = new Carro();
		speed.ano = 1990;
		speed.cor = "Branco";
		System.out.println("Carro: Match 5");
		System.out.println("Ano: " + speed.ano);
		System.out.println("Cor: " + speed.cor);
		speed.acelerar();
	}

}
