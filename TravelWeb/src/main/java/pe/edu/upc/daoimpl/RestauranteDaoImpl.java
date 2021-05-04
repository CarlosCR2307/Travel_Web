package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IRestauranteDao;
import pe.edu.upc.entity.Restaurante;

public class RestauranteDaoImpl implements IRestauranteDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="a")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Restaurante restaurante) {
		// TODO Auto-generated method stub
		em.persist(restaurante);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Restaurante> listar() {
		List<Restaurante> lista=new ArrayList<Restaurante>();
		Query q=em.createQuery("select r from Restaurante r");
		lista=(List<Restaurante>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idRestaurante) {
		// TODO Auto-generated method stub
		Restaurante restaurante=new Restaurante();
		restaurante=em.getReference(Restaurante.class, idRestaurante);
		em.remove(restaurante);
	}

	
	@Transactional
	@Override
	public void actualizar(Restaurante restaurante) {
			try {
				em.merge(restaurante);
			} catch (Exception e) {
				System.out.println("Error al editar restaurante");
			}
		}
	
}
