package test;
import java.io.*;
import java.util.*;
import java.sql.*;
public class ViewAllProductDAO
{
	public ArrayList<ProductBean> al=new ArrayList<ProductBean>();
	public ArrayList<ProductBean> retrieve()
	{
	try {
		Connection con=DBConnection.getCon();//Accesing the connection object
		PreparedStatement ps=con.prepareStatement("select*from product59");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			ProductBean pb= new ProductBean();
			pb.setCode(rs.getString(1));
			pb.setName(rs.getString(2));
			pb.setPrice(rs.getFloat(3));
			pb.setQty(rs.getInt(4));
			al.add(pb);
		}//end while loop
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
		
		
		
		
		return al;
	}
	

}