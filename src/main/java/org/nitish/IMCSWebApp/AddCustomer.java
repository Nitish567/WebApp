package org.nitish.IMCSWebApp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCustomer
 */
public class AddCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");

		Customer customer = new Customer(firstName, lastName, email);
		String address = request.getParameter("billingStreet");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String country = request.getParameter("country");
		String zipCode = request.getParameter("billingZip");
		Address billingAddress = new Address(address, city, state, country, zipCode);
		customer.setAddress(billingAddress);
		System.out.println(customer);
		request.setAttribute("customer", customer);
		
		System.out.println(request.getAttribute("customer"));
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/customerinfo.jsp");
		rd.forward(request, response);
	}

}
