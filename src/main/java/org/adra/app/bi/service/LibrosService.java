package org.adra.app.bi.service;

import java.util.List;

import org.adra.app.bi.entity.Libros;

public interface LibrosService {
	Libros create(Libros l);
	List<Libros> readAll();
	Libros read(int id);
	void delete(int id);
	Libros update(Libros l);
}
