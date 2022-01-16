package br.com.latina.modelos;


public class Tecnico extends Funcionario implements Autenticavel {
	
	private AutenticadorUtil autenticador;
	
	public Tecnico () {
		this.autenticador = new AutenticadorUtil();
		}
	
	public void setSenha(int senha) {
		  this.autenticador.setSenha(senha);
		}

		
	public boolean autentica(int senha) {
		 return	this.autenticador.autentica(senha);
		
		}
}
