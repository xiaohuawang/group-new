package DB;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.Goshuser;
import customTools.DBUtil;

/*import model.Shoplineitem;
import model.Shopproduct;
import customTools.DBUtil;*/


public class GoshuserDB {

	public static void insert(Goshuser goshuser) 
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

	public static void update(Goshuser product) 
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

	
	
	
	
	
	public static void delete(Goshuser lineItem) 
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
	
	
}
