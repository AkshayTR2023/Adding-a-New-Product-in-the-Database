//AddProductServlet.java

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ecommerce.pojo.Product;
import com.ecommerce.util.DBUtil;

public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AddProductServlet() {
        super();
        
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String prodName=request.getParameter("pName");
		Double prodCost=Double.parseDouble(request.getParameter("pCost"));
		
		Product product=new Product();
			product.setpName(prodName);
			product.setpCost(prodCost);
			
			DBUtil dbconn=new DBUtil();
			Session session=dbconn.dbConn();
			Transaction trans=session.beginTransaction();
			int value=(Integer) session.save(product);
			trans.commit();
			session.close();
			if(value>0)
					response.sendRedirect("success.jsp");
			
	}

}
