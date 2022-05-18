package edu.eci.cvds.persistence;

import edu.eci.cvds.entities.Recurso;
import edu.eci.cvds.entities.Usuario;

import java.util.List;

public interface UsuarioDAO {

	public String getTipo(String correo);
	
	public List<Usuario> validarUsuario(String userName, String userPassword);
}
