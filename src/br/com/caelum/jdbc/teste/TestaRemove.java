package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Contato contato = new Contato();
	
	contato.setId(3L);
	
	ContatoDao dao =  new ContatoDao();
	dao.remove(contato);
	
	System.out.println("Contato removido");

	}

}
