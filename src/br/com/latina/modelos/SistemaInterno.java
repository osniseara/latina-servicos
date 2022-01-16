package br.com.latina.modelos;


public class SistemaInterno {
	
	private int senha = 1995;
	
	public void autentica(Autenticavel ex) {
		
		boolean autentica = ex.autentica(this.senha);
		
		if (autentica) {
			System.out.println("Bem vindo ao Sistema");
		}
		else {
			System.out.println("Sua entrada não é permitida.");
		}
	}
}
