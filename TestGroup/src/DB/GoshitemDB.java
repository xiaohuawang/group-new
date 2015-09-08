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
			System.out.println("in insert");
		em.merge(product);
			trans.commit();
		} catch (Exception e) 
		{
			e.printStackTrace();
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
	
	
	
	
	public static Goshitem getProduct(long itemId)
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try
		{
			Goshitem goshitem = em.find(Goshitem.class, itemId);
			return goshitem;
		}
		finally
		{
			em.close();
		}
	}
	
	

	public static List<Goshitem> getLineItemsByOrderID(int sellerid)
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		String queryStr = "SELECT l FROM Goshitem l where l.seller_id = " + sellerid;
		List<Goshitem> goshitem = null;
		try
		{
			Query query = em.createQuery(queryStr);
			goshitem =  query.getResultList();
			System.out.println("size = " + goshitem.size());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			em.close();
		}
		return goshitem;
	}
	
	
	
	
	
}
