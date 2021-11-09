package org.adra.app.bi.repository;

import org.adra.app.bi.entity.Autores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoresRepository extends JpaRepository<Autores, Integer>{
	
}
