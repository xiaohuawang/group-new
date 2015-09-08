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
 * Servlet implementation class ConfirmServlet
 */
@WebServlet("/ConfirmServlet")
public class ConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfirmServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		
        String piclink=request.getParameter("piclink");
		HttpSession session = request.getSession();
		String priceStr = request.getParameter("price");
		String description = request.getParameter("description");
		String itemName = request.getParameter("itemName");
		//String productType = request.getParameter("productType");
		String avail = request.getParameter("avail");
		String shipCostStr = request.getParameter("shipCost");
	
		
		
		double price = Double.parseDouble(priceStr);
		double shipCost = Double.parseDouble(shipCostStr);
		
		Goshitem goshitem=new Goshitem();
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
		//product.setShippingcost(shippingcost);
		
		//HttpSession session = request.getSession();
		Goshuser seller =(Goshuser) session.getAttribute("user");
	   // seller.setEmail(email);
		Goshuser buyer = new Goshuser();
		buyer.setUserId(14);
		
		goshitem.setGoshuser1(buyer);
		goshitem.setGoshuser2(seller);
		System.out.println("wtf");
		
		//product.setShopuser(user);
		
		GoshitemDB.insert(goshitem);
		//GoshitemDB.insert(goshitem);
		//DBProduct.insert(product);
		getServletContext().getRequestDispatcher("/AddProduct").forward(request, response);
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}

}
