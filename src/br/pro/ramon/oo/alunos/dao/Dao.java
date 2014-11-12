package br.pro.ramon.oo.alunos.dao;

import java.util.ArrayList;

import br.pro.ramon.oo.alunos.modelos.Aluno;

public interface Dao {

	void inserir(Aluno aluno);

	ArrayList<Aluno> listar();

	Aluno pesquisar(String matricula);
	
	void atualizar(Aluno aluno);

}
