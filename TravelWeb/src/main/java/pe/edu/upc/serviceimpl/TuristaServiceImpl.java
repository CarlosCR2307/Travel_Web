package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITuristaDao;
import pe.edu.upc.entity.Turista;
import pe.edu.upc.service.ITuristaService;

@Named
@RequestScoped

public class TuristaServiceImpl implements ITuristaService,Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ITuristaDao td;

	@Override
	public void insertar(Turista turista) {		
		td.insertar(turista);
	}

	@Override
	public List<Turista> listar() {
		
		return td.listar();
	}

	@Override
	public void eliminar(int idTurista) {
		td.eliminar(idTurista);
		
	}

	@Override
	public void actualizar(Turista turista) {
		// TODO Auto-generated method stub
		td.actualizar(turista);
	}
}
