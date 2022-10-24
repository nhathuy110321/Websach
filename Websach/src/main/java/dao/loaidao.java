package dao;

import java.nio.channels.SelectableChannel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import bean.loaibean;

public class loaidao {
	 public ArrayList<loaibean> getloai() throws SQLException{
		 try {
			 ArrayList<loaibean> dsloai= new ArrayList<loaibean>();
			   	CoSodao cs= new CoSodao();
			   	cs.Ketnoi();
			   	//b2 lây dữ liệu về
			   	String sql= "select * from loai";
			   	PreparedStatement cmd= cs.cn.prepareStatement(sql);
			   	ResultSet rs=cmd.executeQuery();
			   	 while(rs.next()) {
			   		 String maloai=rs.getString("maloai");
			   		 String tenloai=rs.getString("tenloai");
			   		 dsloai.add(new loaibean(maloai,tenloai));
			   	 }
			   	 rs.close(); cs.cn.close();
			   	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;  	
		}
		return null;
		
		   	
		 
	   }
}
