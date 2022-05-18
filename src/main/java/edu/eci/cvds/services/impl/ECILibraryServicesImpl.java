package edu.eci.cvds.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Recurso;
import edu.eci.cvds.entities.Reservas;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.RecursoDAO;
import edu.eci.cvds.persistence.ReservaDAO;
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
	@Inject
	private ReservaDAO resevaDAO;

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

	@Override
	public List<Reservas> ReservasId(int id)  {

			return resevaDAO.ReservasId(id);

	}

	@Override
	public List<Reservas> ReservasUsuario(int usuario) {

			return resevaDAO.ReservasUsuario(usuario);

	}

	@Override
	public List<Reservas> ReservasRecurso(int id) {

			return resevaDAO.ReservasRecurso(id);

	}

	@Override
	public void CrearReserva(Reservas reserva)  {

			resevaDAO.CrearReserva(reserva);

	}

}
