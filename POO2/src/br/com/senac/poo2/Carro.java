/**
 * 
 */
package br.com.senac.poo2;

/**
 * @author jose.afilho3
 * POO2 - Construtores e m�todos com retorno
 */
public class Carro {
	int ano;
	String cor;
	double velocidade = 170;
	//construtores s�o blocos  de comando que podem ser usados para inicializar objetos
	//construtores precisam ter o mesmo nome da classe principal
	public Carro(int ano, String cor){
		this.ano = ano;
		this.cor = cor;
	}
	//m�todo com retorno (n�o usa void)
	//o retorno � a vari�vel velocidade, portanto devemos criar o m�todo com o tipo da vari�vel (no exemplo double)
	public double acelerar(){
		return velocidade;
	}
}
