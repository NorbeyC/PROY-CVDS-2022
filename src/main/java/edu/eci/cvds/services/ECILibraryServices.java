package edu.eci.cvds.services;

import edu.eci.cvds.entities.Recurso;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.UsuarioDAO;
import com.google.inject.Inject;

import java.util.List;

public interface ECILibraryServices {
	

	public String getTipo(String correo);

	public List<Recurso> listarRecursos();
	
	public List<Recurso> listarCategorias(int categoria);

	public void registrarRecurso(Recurso recurso);

	public abstract Usuario validarUsuario(String username, String password) throws Exception;
}
