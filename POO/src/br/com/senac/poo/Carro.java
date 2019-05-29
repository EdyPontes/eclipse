/**
 * POO
 */
package br.com.senac.poo;

/**
 * @author Jos� de Assis Classe modelo
 */

/*
 * Modificadores de acesso:
 * null / protected -> Mesmo pacote
 * private -> Mesma classe
 * public -> Todas as classes e todos os pacotes
 */


public class Carro {
	// a linha abaixo cria uma vari�vel do tipo inteiro
	public int ano;
	// a linha abaixo cria uma vari�vel do tipo literal
	public String cor;

	// criando um m�todo
	public void acelerar() {
		System.out.println("Vrummmmmmmmmmmm");
	}
	
	void transformar() {
		System.out.println("Transformer !!!!!!");
		System.out.println("Virei um rob�");
	}

}
