package br.pro.ramon.oo.alunos.menus;

import br.pro.ramon.oo.alunos.dao.Dao;
import br.pro.ramon.oo.alunos.dao.DaoArrayList;
import br.pro.ramon.oo.alunos.io.Leitor;

public abstract class ItemDeMenu {
	
	protected Leitor leitor;
	protected Dao dao;
	
	public ItemDeMenu() {
		leitor = new Leitor();
		dao = new DaoArrayList();
	}
	
	public abstract String getDescricao();

	public abstract boolean executar();

}
