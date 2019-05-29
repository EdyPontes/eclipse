/**
 * Criando um objeto
 */
package br.com.senac.poo;

public class Fusca {

	public static void main(String[] args) {
		// a linha abaixo cria um objeto de nome fusquinha
		// tendo como modelo a classe carro
		Carro fusquinha = new Carro();
		// a linha abaixo atribui o valor 1967 a vari�vel ano
		// tipos de vari�veis inteiros n�o usam "" 
		fusquinha.ano = 1967;
		// a linha abaixo atribui a cor azul a vari�vel cor
		// Vari�vel do tipo String usa ""
		fusquinha.cor = "azul";
		System.out.println("Carro: fusca");
		// a linha abaixo "junta" concatena um texto com o 
		// conte�do da vari�vel ano
		System.out.println("Ano: " + fusquinha.ano);
		System.out.println("Cor: " + fusquinha.cor);
		// a linha abaixo executa o m�todo acelerar
		fusquinha.acelerar();
	}

}
