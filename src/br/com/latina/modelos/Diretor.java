package br.com.latina.modelos;


public class Diretor extends Funcionario implements Autenticavel{
	
	
	private AutenticadorUtil autenticador;
	
	public Diretor (){
		this.autenticador = new AutenticadorUtil();
	}
	
	public void setSenha(int senha) {
		
		this.autentica(senha);
	}
	
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
