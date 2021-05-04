package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITransporteDao;
import pe.edu.upc.entity.Transporte;

public class TransporteDaoImpl implements ITransporteDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Transporte transporte) {
		// TODO Auto-generated method stub
		em.persist(transporte);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Transporte> listar() {
		List<Transporte> lista=new ArrayList<Transporte>();
		Query q=em.createQuery("select t from Transporte t");
		lista=(List<Transporte>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idTransporte) {
		// TODO Auto-generated method stub
		Transporte transporte=new Transporte();
		transporte=em.getReference(Transporte.class, idTransporte);
		em.remove(transporte);
		
	}
    @Transactional
	@Override
	public void actualizar(Transporte transporte) {
		try {
			em.merge(transporte);
		} catch (Exception e) {
			System.out.println("Error al editar transporte");
		}
	}

}
