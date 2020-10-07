package myPkg;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PersonServlet_±è±âÇö
 */
@WebServlet("/PersonServlet")
public class PersonServlet_±è±âÇö extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonServlet_±è±âÇö() {
        super();
        System.out.println("PersonServlet_±è±âÇö()");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String name =request.getParameter("name");
		String age =request.getParameter("age");
		String gender =request.getParameter("gender");
		String[] hobby =request.getParameterValues("hobby");
		
		String str = "";
		for(int i=0;i<hobby.length;i++) {
			str += hobby[i]+" ";
		}
		
		System.out.print(str);
		
		Person2 p2 = new Person2();
		p2.setName(name);
		p2.setAge(age);
		p2.setGender(gender);
		p2.setHobby(str);
		
		request.setAttribute("p2", p2);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("PersonResult_±è±âÇö.jsp");
		dispatcher.forward(request, response);
		
	}

}
