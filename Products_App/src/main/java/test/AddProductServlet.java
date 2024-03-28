package test;
import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@SuppressWarnings("serial")
@WebServlet("/add")
public class AddProductServlet extends GenericServlet {
	@Override
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		ProductBean pb=new ProductBean();//Bean Object
		pb.setCode(req.getParameter("code"));
		pb.setName(req.getParameter("name"));
		pb.setPrice(Float.parseFloat(req.getParameter("price")));
		pb.setQty(Integer.parseInt(req.getParameter("qty")));
		AddProductDAO ob=new AddProductDAO();
		int k=ob.insert(pb);
		if(k>0)
		{
			req.setAttribute("msg", "product added succusfully");
			RequestDispatcher rd=req.getRequestDispatcher("AddProduct.jsp");
			rd.forward(req,res);
		}
		
	}

}
