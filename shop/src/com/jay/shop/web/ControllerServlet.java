package com.jay.shop.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jay.shop.domain.Cart;
import com.jay.shop.domain.CartItem;
import com.jay.shop.domain.Item;
import com.jay.shop.service.ItemsServices;
import com.jay.shop.service.LoginService;



public class ControllerServlet extends HttpServlet{
	private LoginService loginService;
	private ItemsServices itemsServices;
	HttpSession session = null;
	@Override
	public void init() throws ServletException {
		loginService = new LoginService();
		itemsServices= new ItemsServices();		}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page");
		String action = request.getParameter("action");
		String nextpage = "/login.jsp";
		
		
		if(page!=null) {
			if(page.equalsIgnoreCase("login")) {
				if(action.equalsIgnoreCase("Login" )) {
					String username = request.getParameter("username");
					String password = request.getParameter("password");
					boolean isValidUser = loginService.authenticate(username, password);
					if(isValidUser) {
						nextpage = "/items.jsp";
						
						request.setAttribute("items", itemsServices.all());
						session=request.getSession();
						
					}
					else {
						nextpage="/login.jsp";
						request.setAttribute("loginError","invalid username or password");
					}
				}
				
			
				
			}else if(page.equalsIgnoreCase("items")) {
				if(action.equalsIgnoreCase("Add to Cart"))
				try{
					String[] ids=request.getParameterValues("chk");
					List<CartItem>selectedItems=new ArrayList<>();
					for(String id : ids) {
						
						Item item= itemsServices.getDb().get(Integer.parseInt(id));
						String quantity=request.getParameter("quantity"+id);
						Integer cartQuantity = Integer.parseInt(quantity);
						Integer cartId = Integer.parseInt(id);
						
						float cartPrice = cartQuantity*item.getPrice();	
						CartItem cartitem = new CartItem(item.getName(),cartId,cartQuantity,cartPrice);
						selectedItems.add(cartitem);
						}
					Cart cart = null;
					Cart existingCart = (Cart)session.getAttribute("cart");
					if(existingCart != null) {
						selectedItems.addAll(existingCart.getItems());
						float newGrandTotal = itemsServices.calculateGrandTotal(selectedItems);
						float existingGrandTotal = existingCart.getGrandTotal();
						float grossGrandTotal = newGrandTotal+ existingGrandTotal;
						cart = new Cart(selectedItems,grossGrandTotal);
						
					}
					else {
						cart = new Cart(selectedItems,itemsServices.calculateGrandTotal(selectedItems));
					}
					session.setAttribute("cart",cart);
					
					request.setAttribute("items", itemsServices.all());
					request.setAttribute("cartsuccess", "Items added to cart successfully");
					nextpage="/items.jsp";
					
				
				}
				catch (Exception e) {
					request.setAttribute("items", itemsServices.all());
					nextpage="/items.jsp";
					request.setAttribute("cartmessage", "please select any items first");
					
				}
				else if(action.equalsIgnoreCase("Checkout")) {
				
						nextpage="/summary.jsp";
				
				}
				
					else if (action.equalsIgnoreCase("help")) {
					nextpage="/Help.jsp";
					
				}
				if(action.equalsIgnoreCase("Logout" )) {
					session.invalidate();
					response.sendRedirect("login.jsp");
			        return;
			        
				}
			
				
			}
			 
			else if (page.equalsIgnoreCase("summary")) {
				if(action.equalsIgnoreCase("Back to cart")) {
					
					request.setAttribute("items", itemsServices.all());
					
					nextpage="/items.jsp";
					
				}
				else if (action.equalsIgnoreCase("Checkout")) {
					session.invalidate();
					nextpage="/Thankyou.jsp";
					
				}
				else if (action.equalsIgnoreCase("help")) {
					nextpage="/Help.jsp";
					
				}
				if(action.equalsIgnoreCase("Logout" )) {
					
					response.sendRedirect("login.jsp");
			        return;
				}
				
			}
		}
				
	RequestDispatcher rd = request.getRequestDispatcher(nextpage);
	rd.forward(request, response);
}
}
 