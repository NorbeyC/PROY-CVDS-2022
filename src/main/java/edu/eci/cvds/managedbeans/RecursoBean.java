package edu.eci.cvds.managedbeans;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Recurso;
import edu.eci.cvds.services.ECILibraryServices;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;

@ManagedBean(name = "recursoBean")
@RequestScoped
public class RecursoBean extends BasePageBean {

	@Inject
	private ECILibraryServices ECILibraryServices;

	public List<Recurso> getRecurso() {
		return ECILibraryServices.listarRecursos();
	}

}
