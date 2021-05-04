package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IAlquilerAutoDao;
import pe.edu.upc.entity.AlquilerAuto;
import pe.edu.upc.entity.Departamento;

public class AlquilerAutoDaoImpl implements IAlquilerAutoDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(AlquilerAuto alquilerAuto) {
		// TODO Auto-generated method stub
		em.persist(alquilerAuto);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<AlquilerAuto> listar() {
		List<AlquilerAuto> lista=new ArrayList<AlquilerAuto>();
		Query q=em.createQuery("select a from AlquilerAuto a");
		lista=(List<AlquilerAuto>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idAlquilerAuto) {
		// TODO Auto-generated method stub
		AlquilerAuto alquilerAuto=new AlquilerAuto();
		alquilerAuto=em.getReference(AlquilerAuto.class, idAlquilerAuto);
		em.remove(alquilerAuto);
		
	}

	 @Transactional
		@Override
		public void actualizar(AlquilerAuto alquilerAuto) {
			try {
				em.merge(alquilerAuto);
			} catch (Exception e) {
				System.out.println("Error al editar curso");
			}
		}
}
