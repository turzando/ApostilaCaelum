package br.com.caelum.ed.listasligadas;

public class TestePegaPorPosicaoListaLigada {
	
	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		
		System.out.println(lista.pega(0));
		System.out.println(lista.pega(1));
		
	}

}
