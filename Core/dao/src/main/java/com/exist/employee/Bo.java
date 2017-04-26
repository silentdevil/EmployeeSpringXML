package com.exist.employee;

public interface Bo {

	<E> void save(E e);
	<E> void update(E e);
	<E> void delete(E e);
	<E> E findById(final Class<E> type, final Long id);
}