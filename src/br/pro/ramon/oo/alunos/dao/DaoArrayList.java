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

}
