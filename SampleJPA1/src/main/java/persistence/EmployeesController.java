package persistence;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import model.Employees;

public class EmployeesController {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SampleJPA1");
	private EntityManager em = emf.createEntityManager();
	
	//CRUD
	
	//Get All
	public List<Employees> getAll() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Employees> cq = cb.createQuery(Employees.class);
		Root<Employees> registro = cq.from(Employees.class);
		CriteriaQuery<Employees> todos = cq.select(registro);
		TypedQuery<Employees> lista = em.createQuery(todos);
		return lista.getResultList();
	}
	
	//Get by Id
	public Employees getById(int id) {
		em.getTransaction().begin();
		Employees e = em.find(Employees.class, id);
		em.getTransaction().commit();
		return e;
	}
	
	//Create
	public void create(Employees e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println("El registro se creó correctamente");
	}

		
	//Update
	public void update(Employees e) {
		em.getTransaction().begin();
		Employees emp = em.find(Employees.class, e.getEmp_no());
		emp.setBirth_date(e.getBirth_date());
		emp.setFirst_name(e.getFirst_name());
		emp.setLast_name(e.getLast_name());
		emp.setGender(e.getGender());
		emp.setHire_date(e.getHire_date());
		em.getTransaction().commit();
		System.out.println("El registro se actualizó correctamente");
	}
		
	//Delete
	public void delete(int id) {
		em.getTransaction().begin();
		Employees e = em.find(Employees.class, id);
		em.remove(e);
		em.getTransaction().commit();
		System.out.println("El registro se eliminó correctamente");
	}
}
