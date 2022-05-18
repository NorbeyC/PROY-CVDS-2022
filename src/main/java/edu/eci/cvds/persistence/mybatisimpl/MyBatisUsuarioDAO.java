package edu.eci.cvds.persistence.mybatisimpl;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.UsuarioMapper;

public class MyBatisUsuarioDAO implements UsuarioDAO {

	@Inject
	private UsuarioMapper usuarioMapper;

	@Override
	public String getTipo(String correo) {
		return usuarioMapper.getTipo(correo);

	}

	@Override
	public List<Usuario> validarUsuario(String userName, String userPassword) {
		return usuarioMapper.validarUsuario(userName, userPassword);
	}

}
