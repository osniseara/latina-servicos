package br.com.latina.testes;

import br.com.latina.modelos.*;

public class TesteSistema {
	
	public static void main(String[] args) {
		
		Tecnico tecnico = new Tecnico();
		
		tecnico.setSenha(123);
		
		Diretor diretor = new Diretor();
		
		diretor.setSenha(1995);
		
		Torre torres = new Torre();
		
		torres.setSenha(1995);
		SistemaInterno si = new SistemaInterno();
		
		si.autentica(tecnico);
		si.autentica(torres);
		si.autentica(diretor);
		
		
		
		
		
		
	}
}
