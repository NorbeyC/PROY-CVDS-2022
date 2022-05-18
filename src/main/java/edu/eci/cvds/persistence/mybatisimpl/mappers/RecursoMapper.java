package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.Recurso;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecursoMapper {

	public List<Recurso> getRecursos();
	
	public List<Recurso> getCategorias(@Param("categoria") int categoria);
	
	public void registrarRecurso(@Param("recurso") Recurso recurso);
}
