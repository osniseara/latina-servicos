package br.com.latina.testes;

import br.com.latina.modelos.*;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Tecnico marcio = new Tecnico();
		
		marcio.setNome("Marcio");
		marcio.setCodId("123");
		marcio.setNumeroDeRegistro("1256");
		
		System.out.println(marcio.getNome());
		System.out.println(marcio.getCodId());
		System.out.println(marcio.getNumeroDeRegistro());
		
		
		
	}

}
