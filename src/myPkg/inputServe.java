package myPkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class inputServe
 */
@WebServlet("/serve")
public class inputServe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inputServe() {
        super();
        System.out.println("inputServe()");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init()");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("destroy()");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
		//doGet(request, response);
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String name = request.getParameter("name");
		
		request.setAttribute("age", 30);
		
		Person per = new Person("태연",23,162.4); 
		request.setAttribute("per", per);
		
		
		System.out.println("name : " + name);
		
		PrintWriter pw = response.getWriter();
		pw.print("이름 : " +name + "<br>");
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
		dispatcher.forward(request, response);
		/* 
		 input.jsp에서 시작해서 -> 현재 servlet에서 -> result.jsp로 넘어가라는 명령이다
		 servlet이 잠시 거쳐가는 페이지가 되는 것이다(forword액션태그와 동일한 기능)
		 */
		
		
		}

}
