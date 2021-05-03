package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IProvinciaDao;
import pe.edu.upc.entity.Provincia;
import pe.edu.upc.service.IProvinciaService;

@Named
@RequestScoped
public class ProvinciaServiceImpl implements IProvinciaService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IProvinciaDao pd;

	@Override
	public void insertar(Provincia provincia) {
		// TODO Auto-generated method stub
		pd.insertar(provincia);
	}

	@Override
	public List<Provincia> listar() {
		// TODO Auto-generated method stub
		return pd.listar();
	}

	@Override
	public void eliminar(int idProvincia) {
		// TODO Auto-generated method stub
		pd.eliminar(idProvincia);
	}
	@Override
	public void actualizar(Provincia provincia) {
		// TODO Auto-generated method stub
		md.actualizar(provincia);
	}
}
