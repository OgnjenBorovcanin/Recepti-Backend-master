package org.njp.services;

import java.util.List;

import org.njp.entities.BasicEntity;

public interface IServiceAbstract<T extends BasicEntity> {
	public boolean add(T object);
	public boolean removeById(int id);
	public boolean update(T object);
	public List<T> getAll();
	public T getById(int id);
}
