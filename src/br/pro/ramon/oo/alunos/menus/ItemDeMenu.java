package br.pro.ramon.oo.alunos.menus;

import br.pro.ramon.oo.alunos.dao.Dao;
import br.pro.ramon.oo.alunos.dao.DaoArrayList;

public abstract class ItemDeMenu {
	
	protected Dao dao;
	
	public ItemDeMenu() {
		dao = new DaoArrayList();
	}
	
	public abstract String getDescricao();

	public abstract boolean executar();

}
