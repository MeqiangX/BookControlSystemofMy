package com.mybcs.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybcs.bean.Book;
import com.mybcs.daoImpl.BookDaoImpl;

/**
 * Servlet implementation class Servlet_Add
 */
@WebServlet("/Servlet_Add")
public class Servlet_Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_Add() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String bookCount = request.getParameter("bookCount");
		String author = request.getParameter("author");
		
		Book book = new Book();
		BookDaoImpl bdi = new BookDaoImpl();
		
		book.setId((new Integer(id)).intValue());
		book.setName(name);
		book.setPrice((new Double(price)).doubleValue());
		book.setBookCount((new Integer(bookCount)).intValue());
		book.setAuthor(author);
		
		boolean tag =  bdi.AddBook(book);
		List list = bdi.list();
		request.setAttribute("list", list);
		
		if (tag) {
		request.getRequestDispatcher("/JSP/addsuccess.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("/JSP/addfail.jsp").forward(request, response);
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
