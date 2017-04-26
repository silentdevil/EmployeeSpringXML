package com.exist.employee;

public class BoImpl implements Bo {


	private Dao dao;

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	public <E> void save(E e) {
		dao.save(e);
	}

	public <E> void delete(E e) {
		dao.delete(e);
	}

	public <E> void update(E e) {
		dao.update(e);
	}

	public <E> E findById(final Class<E> type, final Long id) {
		return dao.findById(type, id);
	}
}