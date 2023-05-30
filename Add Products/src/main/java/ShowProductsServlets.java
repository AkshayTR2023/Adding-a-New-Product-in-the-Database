
//ShowProductsServlets.java
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.ecommerce.pojo.Product;
import com.ecommerce.util.DBUtil;

public class ShowProductsServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ShowProductsServlets() {
        super();
        
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DBUtil dbconn=new DBUtil();
		Session session=dbconn.dbConn();
		Transaction trans=session.beginTransaction();
		//HQL
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		@SuppressWarnings("unchecked")
		Query<Product> query=session.createQuery("FROM Product");
		List<Product> list=query.list();
		trans.commit();
		session.close();
		 out.println("<html>");
	        out.println("<head><title>Product List</title></head>");
	        out.println("<body>");
	        out.println("<h1>Product List</h1>");
	        out.println("<table>");
	        out.println("<tr><th>ID</th><th>Name</th><th>Cost</th></tr>");
	        
	        for (Product product : list) {
	            out.println("<tr>");
	            out.println("<td>" + product.getpID() + "</td>");
	            out.println("<td>" + product.getpName() + "</td>");
	            out.println("<td>" + product.getpCost() + "</td>");
	            out.println("</tr>");
	        }
	        
	        out.println("</table>");
	        
	        out.println("<br>");
	        out.println("<form action='index.jsp'>");
	        out.println("<input type='submit' value='Go Back to Home'>");
	        out.println("</form>");
	        out.println("</body>");
	        out.println("</html>");
	        
	        
	    }

	}

