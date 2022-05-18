package edu.eci.cvds.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Recurso;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.RecursoDAO;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.services.ECILibraryServices;

import java.io.IOException;
import java.util.List;

public class ECILibraryServicesImpl implements ECILibraryServices {
	@Inject
	private UsuarioDAO usuarioDAO;
	@Inject
	private RecursoDAO recursoDAO;
	@Inject
	private Usuario usuario;

	@Override
	public String getTipo(String correo) {
		return usuarioDAO.getTipo(correo);

	}

	@Override
	public List<Recurso> listarRecursos() {
		return recursoDAO.listarTodos();

	}
	
	@Override
	public List<Recurso> listarCategorias(int categoria) {
		return recursoDAO.listarCategorias(categoria);

	}

	@Override
	public void registrarRecurso(Recurso recurso){
		recursoDAO.registrarRecurso(recurso);

	}

	@Override
	public Usuario validarUsuario(String username, String password) throws Exception{
		try {
            List<Usuario> usuariosEncontrados = usuarioDAO.validarUsuario(username, password);
            System.out.println(usuariosEncontrados.get(0));
            if(!usuariosEncontrados.isEmpty()) {
                usuario = usuariosEncontrados.get(0);
            }
		}catch (Exception e){
            throw new Exception("Error francisquito", e);
        }
		return usuario;
    }

}
