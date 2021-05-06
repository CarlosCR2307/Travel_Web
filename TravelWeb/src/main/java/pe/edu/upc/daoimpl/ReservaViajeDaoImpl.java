package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IReservaViajeDao;
import pe.edu.upc.entity.ReservaViaje;

public class ReservaViajeDaoImpl implements IReservaViajeDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(ReservaViaje reservaViaje) {
		// TODO Auto-generated method stub
		em.persist(reservaViaje);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ReservaViaje> listar() {
		List<ReservaViaje> lista=new ArrayList<ReservaViaje>();
		Query q=em.createQuery("select r from ReservaViaje r");
		lista=(List<ReservaViaje>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idReservaViaje) {
		// TODO Auto-generated method stub
		ReservaViaje reservaViaje=new ReservaViaje();
		reservaViaje=em.getReference(ReservaViaje.class, idReservaViaje);
		em.remove(reservaViaje);
		
	}

	 @Transactional
		@Override
		public void actualizar(ReservaViaje reservaViaje) {
			try {
				em.merge(reservaViaje);
			} catch (Exception e) {
				System.out.println("Error al editar curso");
			}
		}
}
