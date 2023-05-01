package questao2e3e4;

import java.util.ArrayList;

public class Servico {

	private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

	public void cadastrar(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}

	public void remover(String cpf) {
		for (Funcionario fun : funcionarios) {
			if (fun.getCpf().equals(cpf)) {
				funcionarios.remove(fun);
				break;
			}
		}

	}

	public void procurar(String nome) {
		for (Funcionario fun : funcionarios) {
			if (fun.getNome().equals(nome)) {
				System.out.println(fun);
				break;
			}
		}
	}

	public void listar() {
		if (funcionarios.isEmpty()) {
			System.out.println("Não existem funcionários cadastrados");
		} else {
			System.out.println("Lista de funcionários: ");
			for (Funcionario fun : funcionarios) {
				System.out.println(fun);
			}
		}
	}
}
