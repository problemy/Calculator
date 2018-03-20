package servlets;
import JavaPackage.*;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/credit")
public class CreditServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double sum;

	DecimalFormat df = new DecimalFormat("#0.00");
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String name = request.getParameter("name");
		String years = request.getParameter("years");
		response.setContentType("text/html");
		response.getWriter().println("<h1>Hello " +name + "World </h1>");
		response.getWriter().println("years " +years );
			
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String years = request.getParameter("years");
		String amount = request.getParameter("amount");
		String commision = request.getParameter("commision");
		String percentage = request.getParameter("percentage");
		String typeParam = request.getParameter("type");
		
		
		if(isEmpty(years) || isEmpty(amount) || isEmpty(commision) || isEmpty(percentage) || isEmpty(typeParam) ) {
			response.sendRedirect("/");
		}
		
		Integer yearsInt = Integer.parseInt(years);
		Double amountDouble = Double.parseDouble(amount);
		Double commisionDouble = Double.parseDouble(commision.replace(',', '.'))/100;
		Double percentageDouble = Double.parseDouble(percentage.replace(',','.'))/100;
		InstalmentsType type;
		
		if(typeParam.equalsIgnoreCase("stale")){
			type = InstalmentsType.EQUAL;
		} else {
			type = InstalmentsType.DECREASING;
		}
		
		Credit credit = new Credit(yearsInt, amountDouble, commisionDouble, percentageDouble, type);
		
		ArrayList<Installment> installments = credit.getInstallments();
		
		response.setContentType("text/html");
		response.getWriter().println("<h1>Oto twoje raty: </h1>");
		
		

		response.getWriter().print(" <table><tr><th>Numer raty</th> "
				+ "<th>Kwota</th>" + "<th>Odsetki</th>" + "<th>Łącznie</th>");
		for(int i = 0; i < installments.size(); i++) {
			Installment rate = installments.get(i);
			response.getWriter().println("<tr><td> " + (i + 1) + "</td><td>"+  df.format(rate.getPrincipal()) + "</td>"
			+ "<td>" +df.format(rate.getInterest()) +"</td> <td>" +df.format(rate.getTotal()) + "</td> </tr>");
			sum += installments.get(i).getTotal();
		}
		
		response.getWriter().println("</table>");
		response.getWriter().println("<h2>Calkowita kwota kredytu: " + df.format(sum) + "</h2>");
	}
	
	
	public boolean isEmpty(String parameter) {
		if(parameter.equals(null) || parameter.equals("")) {
			return true;
		}
		return false;
		
	}

}
