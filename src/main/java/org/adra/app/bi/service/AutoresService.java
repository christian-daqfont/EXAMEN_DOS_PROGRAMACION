package org.adra.app.bi.service;

import java.util.List;

import org.adra.app.bi.entity.Autores;

public interface AutoresService {
	Autores create(Autores a);
	List<Autores> readAll();
	Autores read(Long id);
	void delete(Long id);
	Autores update(Autores a);
}
