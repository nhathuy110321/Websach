package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.loaibean;
import bean.sachbean;
import bo.loaibo;
import bo.sachbo;

/**
 * Servlet implementation class htsah
 */
@WebServlet("/htsah")
public class htsah extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		loaibo lbo = new loaibo();
		ArrayList<loaibean> dsloai = lbo.getloai();
		
		request.setAttribute("dsloai", dsloai);
		
		sachbo sbo = new sachbo();
		ArrayList<sachbean> dssach =sbo.getsach();
		
		if (request.getParameter("search")!=null){
		    	//dssach = sbo.timKiemTheoTen(dssach, request.getParameter("search"));}
				dssach = sbo.timkiemteni(dssach, request.getParameter("search"));}
		 else if (request.getParameter("ml")!=null){
		    	dssach = sbo.timkiemloai(dssach, request.getParameter("ml"));
		    
		    }
		request.setAttribute("dssach", dssach);
		RequestDispatcher rd = request.getRequestDispatcher("htsach.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
