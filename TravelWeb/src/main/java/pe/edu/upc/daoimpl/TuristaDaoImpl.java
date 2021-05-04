package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITuristaDao;
import pe.edu.upc.entity.Departamento;
import pe.edu.upc.entity.Turista;

public class TuristaDaoImpl implements ITuristaDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Turista turista) {
		// TODO Auto-generated method stub
		em.persist(turista);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Turista> listar() {
		List<Turista> lista=new ArrayList<Turista>();
		Query q=em.createQuery("select c from Turista c");
		lista=(List<Turista>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idTurista) {
		// TODO Auto-generated method stub
		Turista turista=new Turista();
		turista=em.getReference(Turista.class, idTurista);
		em.remove(turista);
		
	}

	 @Transactional
		@Override
		public void actualizar(Turista turista) {
			try {
				em.merge(turista);
			} catch (Exception e) {
				System.out.println("Error al editar curso");
			}
		}
}
