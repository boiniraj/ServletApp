package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import java.util.*;

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewAllProductsServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		ViewAllProductDAO ov=new ViewAllProductDAO();
		ArrayList<ProductBean> al=ov.retrieve();
		req.setAttribute("alist", al);
		RequestDispatcher rd=req.getRequestDispatcher("ViewAllProducts.jsp");
		rd.forward(req, res);
		
	}

}
