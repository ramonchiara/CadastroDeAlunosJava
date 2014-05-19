package br.pro.ramon.oo.alunos.menus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.pro.ramon.oo.alunos.modelos.Aluno;

public class ListarAlunos extends ItemDeMenu implements Comparator<Aluno> {

	@Override
	public String getDescricao() {
		return "Listar alunos";
	}

	@Override
	public boolean executar() {
		ArrayList<Aluno> alunos = dao.listar();
		
		Collections.sort(alunos, this);

		for (int i = 0; i < alunos.size(); i++) {
			Aluno atual = alunos.get(i);
			System.out.println(atual.getMatricula() + " - " + atual.getNome() + " - " + atual.calcularMedia());
		}

		return false;
	}

	@Override
	public int compare(Aluno o1, Aluno o2) {
		String nome1 = o1.getNome();
		String nome2 = o2.getNome();
		
		return nome1.compareTo(nome2);
	}

}
