package org.adra.app.bi.repository;

import org.adra.app.bi.entity.Editoriales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorialesRepository extends JpaRepository<Editoriales, Integer>{

}
