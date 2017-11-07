package com.mybcs.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybcs.bean.Book;
import com.mybcs.daoImpl.BookDaoImpl;

/**
 * Servlet implementation class Servlet_Delete
 */
@WebServlet("/Servlet_Delete")
public class Servlet_Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		
		BookDaoImpl bdi = new BookDaoImpl();
	    Book b = bdi.findBook(name);
	    if (b != null) {
		    bdi.delete(name);
			request.getRequestDispatcher("/Servlet_list").forward(request, response);
			
		}
		else {
			request.getRequestDispatcher("/JSP/searchfail.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
