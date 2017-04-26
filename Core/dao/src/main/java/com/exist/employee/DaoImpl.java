package com.exist.employee;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class DaoImpl extends HibernateDaoSupport implements Dao {
	
	public <E> void save(E e) {
		getHibernateTemplate().save(e);
	}

	public <E> void update(E e) {
		getHibernateTemplate().update(e);
	}

	public <E> void delete(E e) {
		getHibernateTemplate().delete(e);
	}

	public <E> E findById(final Class<E> type, final Long id) {
		return (E) getHibernateTemplate().get(type,id);
	}

}