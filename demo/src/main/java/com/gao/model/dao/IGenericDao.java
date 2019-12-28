package com.gao.model.dao;

public interface IGenericDao <T, ID>{
	void create(T object);
	void update(T object);
	void delete(T object);
}
