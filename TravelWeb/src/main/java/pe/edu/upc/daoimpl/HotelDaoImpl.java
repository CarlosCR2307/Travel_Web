package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IHotelDao;
import pe.edu.upc.entity.Hotel;

public class HotelDaoImpl implements IHotelDao, Serializable{

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName="a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		em.persist(hotel);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Hotel> listar() {
		List<Hotel> lista=new ArrayList<Hotel>();
		Query q=em.createQuery("select h from Hotel h");
		lista=(List<Hotel>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idHotel) {
		Hotel hotel=new Hotel();
		hotel=em.getReference(Hotel.class, idHotel);
		em.remove(hotel);
		
	}
	

}
