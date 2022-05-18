package edu.eci.cvds.persistence;

import edu.eci.cvds.entities.Recurso;

import java.util.List;

public interface RecursoDAO {

	public List<Recurso> listarTodos();
	
	public List<Recurso> listarCategorias(int categoria);

	public void registrarRecurso(Recurso recurso);

}
