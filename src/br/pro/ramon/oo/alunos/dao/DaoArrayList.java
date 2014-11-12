package br.pro.ramon.oo.alunos.dao;

import java.util.ArrayList;

import br.pro.ramon.oo.alunos.modelos.Aluno;

public class DaoArrayList implements Dao {

	private static ArrayList<Aluno> bd = new ArrayList<Aluno>();

	@Override
	public void inserir(Aluno aluno) {
		bd.add(aluno);
	}

	@Override
	public ArrayList<Aluno> listar() {
		return bd;
	}

	@Override
	public Aluno pesquisar(String matricula) {
		Aluno resultado = null;

		for (int i = 0; i < bd.size(); i++) {
			Aluno atual = bd.get(i);
			
			if (atual.getMatricula().equals(matricula)) {
				resultado = atual;
				break;
			}
		}

		return resultado;
	}
	
	@Override
	public void atualizar(Aluno aluno) {
		Aluno pesquisado = pesquisar(aluno.getMatricula());
		
		pesquisado.setNome(aluno.getNome());
		pesquisado.setP1(aluno.getP1());
		pesquisado.setP2(aluno.getP2());
	}

}
