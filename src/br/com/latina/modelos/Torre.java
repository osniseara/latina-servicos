package br.com.latina.modelos;


public class Torre extends Funcionario implements Autenticavel{
	
	private AutenticadorUtil autenticador;
	
	public Torre () {
	
		this.autenticador = new AutenticadorUtil();
	}
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);	 	
	}
		public boolean autentica (int senha) {
		return this.autenticador.autentica(senha);
		
	}
}
