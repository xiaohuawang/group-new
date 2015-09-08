package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Goshitem;
import model.Goshuser;
import DB.GoshitemDB;

/**
 * Servlet implementation class Editnew
 */
@WebServlet("/Editnew")
public class Editnew extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Editnew() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("doGet Editnew");
		
		
		
		String itemIdStr = request.getParameter("itemId");
		
		long itemId = Long.parseLong(itemIdStr);
		System.out.println(itemId);
		
		Goshitem goshitem = GoshitemDB.getProduct(itemId);
		request.setAttribute("goshitem", goshitem);
		getServletContext().getRequestDispatcher("/editnew.jsp").forward(request, response);
	}

		
		
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost Editnew");
	
		
	
		
		
		HttpSession session = request.getSession();
		Goshuser user = (Goshuser) session.getAttribute("user");
		
		/*
	    
		String imageLink = request.getParameter("pic");
		String priceStr = request.getParameter("price");
		String productDescription = request.getParameter("productDescription");
		String productName = request.getParameter("productName");
		String productType = request.getParameter("productType");
		String available = request.getParameter("available");
		String shippingcostStr = request.getParameter("shippingcost");
		
		*/
		
		
		
		String itemIdStr = request.getParameter("itemId");
		System.out.println(itemIdStr);
		long itemId = Long.parseLong(itemIdStr);
		
		System.out.println(itemIdStr);

		
		
		
		String priceStr = request.getParameter("price");
		String description = request.getParameter("description");
		String itemName = request.getParameter("itemName");
		//String productType = request.getParameter("productType");
		//String avail = request.getParameter("avail");
		String shipCostStr = request.getParameter("shipCost");
		String avail=request.getParameter("avail");
		String piclink=request.getParameter("piclink");
		double price = Double.parseDouble(priceStr);
		double shipCost = Double.parseDouble(shipCostStr);
		
		
		
		
		
		Goshitem goshitem = GoshitemDB.getProduct(itemId);
		
		//System.out.println(itemId);
		
//		Goshitem goshitem=new Goshitem();
		//Goshitem goshitem = new Goshitem();
	    goshitem.setPiclink(piclink);
		//	goshitem.setImageLink(imageLink);
		goshitem.setPrice(price);
	    //product.setPrice(price);
		goshitem.setDescription(description);
		//product.setProductDescription(productDescription);
		goshitem.setItemName(itemName);
		//product.setProductName(productName);
		
		//product.setProductType(productType);
	   goshitem.setAvail(avail);
		//product.setAvailable(available);
		goshitem.setShipCost(shipCost);
		
		Goshuser seller =(Goshuser) session.getAttribute("user");
		   // seller.setEmail(email);
			Goshuser buyer = new Goshuser();
			buyer.setUserId(14);
			
			goshitem.setGoshuser1(buyer);
			goshitem.setGoshuser2(seller);
			System.out.println("update");
			
			//product.setShopuser(user);
			
			
			GoshitemDB.update(goshitem);
		
		
		
		
		
		getServletContext().getRequestDispatcher("/EditServlet").forward(request, response);;
	}
		
		
	
}
