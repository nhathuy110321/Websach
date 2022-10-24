package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Struct;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ktdn
 */
@WebServlet("/ktdn")
public class ktdn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ktdn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String un =request.getParameter("txtun");
	    String pass=request.getParameter("txtpass");
	    if(un!=null && pass != null ) {
	    //tạo đối tượng session
	    HttpSession session = request.getSession();
	    //nêu chưa tạo session
	    if(session.getAttribute("dn")==null)
   		 session.setAttribute("dn","");
	   	session.setAttribute("dn", un);
	 	RequestDispatcher rd= request.getRequestDispatcher("htsach.jsp");
	 	rd.forward(request, response);
	    }else {
   	 //chuyển tiếp về trang chủ htsach.jsp
   	RequestDispatcher rd= request.getRequestDispatcher("dangnhap.jsp");
	rd.forward(request, response);
	}}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
