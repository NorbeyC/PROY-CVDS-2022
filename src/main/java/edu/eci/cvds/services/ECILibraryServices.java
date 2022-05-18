package edu.eci.cvds.services;

import edu.eci.cvds.entities.Recurso;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.entities.Reservas;
import edu.eci.cvds.persistence.UsuarioDAO;
import com.google.inject.Inject;

import java.util.List;

public interface ECILibraryServices {
	

	public String getTipo(String correo);

	public List<Recurso> listarRecursos();
	
	public List<Recurso> listarCategorias(int categoria);

	public void registrarRecurso(Recurso recurso);

	public abstract Usuario validarUsuario(String username, String password) throws Exception;

	public abstract List<Reservas> buscarReservasId(int id);

	public abstract List<Reservas> buscarReservasUsuario(String usuario);

	public List<Reservas> reservasRecurso(int id);

	public abstract void crearReserva(Reservas reserva);
}
