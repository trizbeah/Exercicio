package questao2e3e4;

import ifba.biblioteca.array.ArrayIFBA;

public class Principal {
	
	public static void main(String[] args) {
		
		
		Funcionario f1 = new Funcionario("Murilo", "6757", "devIOS");
		Funcionario f2 = new Funcionario("Beatriz", "4343", "DBA");
		Funcionario f3 = new Funcionario("Luana", "9876", "devAndroid");
		Funcionario f4 = new Funcionario("Igor", "7754", "professor");
		
		Servico s = new Servico();
		ArrayIFBA<Funcionario> b = new ArrayIFBA<Funcionario>(); 
		b.adicionar(f1);
		b.adicionar(f2);
		b.adicionar(f3);
		b.adicionar(f4);
		
		b.listar();
		
		/*
		s.cadastrar(f1);
		s.cadastrar(f2);
		s.cadastrar(f3);
		s.cadastrar(f4);
		
		s.listar();
		
		s.remover("7754");
		
		s.listar();
		
		s.procurar("Murilo");
		*/
		
	}

}
