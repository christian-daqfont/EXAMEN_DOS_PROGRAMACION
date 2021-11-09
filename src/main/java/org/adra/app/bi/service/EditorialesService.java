package org.adra.app.bi.service;

import java.util.List;

import org.adra.app.bi.entity.Editoriales;

public interface EditorialesService {
	Editoriales create(Editoriales e);
	List<Editoriales> readAll();
	Editoriales read(Long id);
	void delete(Long id);
	Editoriales update(Editoriales e);
}
