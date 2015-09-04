package DB;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.Goshitem;
import model.Goshuser;
import customTools.DBUtil;

/*import model.Shoplineitem;
import model.Shopproduct;
import customTools.DBUtil;*/


public class GoshitemDB {

	public static void insert(Goshitem goshuser) 
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin(); 
		try 
		{
			em.persist(goshuser);
			trans.commit();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
			trans.rollback();
		} 
		finally 
		{
			em.close();
		}
	}

	public static void update(Goshitem product) 
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin(); 
		try 
		{
		em.merge(product);
			trans.commit();
		} catch (Exception e) 
		{
			System.out.println(e);
			trans.rollback();
		} 
		finally 
	{
			em.close();
		}
	}

	public static void delete(Goshitem lineItem) 
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin(); 
		try 
		{
			em.remove(em.merge(lineItem));
			trans.commit();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
			trans.rollback();
		} finally 
		{
			em.close();
		} 
	}
	
	public static List<Goshitem> getAllProducts(Goshuser user)
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		String queryStr = "SELECT p FROM Goshitem p where p.goshuser2 = :goshuser";
		List<Goshitem> products = null;
		try
		{
			Query query = em.createQuery(queryStr)
					.setParameter("goshuser", user);
			products =  query.getResultList();
			System.out.println("size = " + products.size());
			System.out.println("size = " + user.getUserId() + user.getUserName());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			em.close();
		}
		return products;
	}
	
}
