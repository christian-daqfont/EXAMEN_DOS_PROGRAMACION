package org.adra.app.bi.serviceImpl;

import java.util.List;

import org.adra.app.bi.entity.Libros;
import org.adra.app.bi.repository.LibrosRepository;
import org.adra.app.bi.service.LibrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LibrosServiceImpl implements LibrosService{

	@Autowired
	private LibrosRepository Librosrepository;
	
	@Override
	public Libros create(Libros l) {
		// TODO Auto-generated method stub
		return Librosrepository.save(l);
	}

	@Override
	public List<Libros> readAll() {
		// TODO Auto-generated method stub
		return Librosrepository.findAll();
	}

	@Override
	public Libros read(int id) {
		// TODO Auto-generated method stub
		return Librosrepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Librosrepository.deleteById(id);
	}

	@Override
	public Libros update(Libros l) {
		// TODO Auto-generated method stub
		return Librosrepository.save(l);
	}
}


