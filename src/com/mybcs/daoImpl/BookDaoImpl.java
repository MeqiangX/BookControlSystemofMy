package com.mybcs.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mybcs.bean.Book;
import com.mybcs.dao.BookDao;
import com.mybcs.util.DBUtil;

public class BookDaoImpl implements BookDao{

	
	@Override
	public boolean AddBook(Book book) {
		DBUtil db = new DBUtil();
		Connection ct = db.openConnection();
		
		String sql = "insert into tb_books (id,name,price,bookCount,author) value (?,?,?,?,?)";
		
		try {
			PreparedStatement psmt = ct.prepareStatement(sql);
			psmt.setInt(1, book.getId());
			psmt.setString(2, book.getName());
			psmt.setDouble(3, book.getPrice());
			psmt.setInt(4, book.getBookCount());
			psmt.setString(5, book.getAuthor());
			
			psmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.CloseConet(ct);
		}
		return false;
	}

	
	@Override
	public List list() {
		DBUtil db = new DBUtil();
		Connection ct = db.openConnection();
		
		List list = new ArrayList();
		
		String sql = "select * from tb_books";
		
		try {
			Statement st = ct.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				Book book = new Book(rs.getInt("id"),rs.getString("name"),rs.getDouble("price"),
						rs.getInt("bookCount"),rs.getString("author"));
				list.add(book);	
			}
			
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.CloseConet(ct);
		}
		
		
		return null;
	}
	
	

	@Override
	public boolean delete(String nameofBook) {
		DBUtil db = new DBUtil();
		Connection ct = db.openConnection();
		
		String sql = "delete from tb_books where name=?";
		
		try {
			PreparedStatement psmt = ct.prepareStatement(sql);
			psmt.setString(1, nameofBook);
			psmt.executeUpdate();
			
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.CloseConet(ct);
		}
		
		return false;
	}
	
	

	@Override
	public Book findBook(String nameofBook) {
		DBUtil db = new DBUtil();
		Connection ct = db.openConnection();
		
		String sql = "select * from tb_books where name=?";
		Book book = new Book();
		try {
			PreparedStatement psmt = ct.prepareStatement(sql);
			psmt.setString(1, nameofBook);
			ResultSet rs = psmt.executeQuery();
			
			if (rs.next()) {
				book.setId(rs.getInt("id"));
				book.setName(rs.getString("name"));
				book.setPrice(rs.getDouble("price"));
				book.setBookCount(rs.getInt("bookCount"));
				book.setAuthor(rs.getString("author"));
				
				return book;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.CloseConet(ct);
		}
		return null;
	}

	@Override
	public void Update(Book book) {
		
		DBUtil db = new DBUtil();
		Connection ct = db.openConnection();
		
		String sql = "Update tb_books set id=?,name=?,price=?,bookCount=?,author=? where id=?";
		
		try {
			PreparedStatement psmt = ct.prepareStatement(sql);
			psmt.setInt(1, book.getId());
			psmt.setString(2, book.getName());
			psmt.setDouble(3, book.getPrice());
			psmt.setInt(4, book.getBookCount());
			psmt.setString(5, book.getAuthor());
			psmt.setInt(6, book.getId());
			
			psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.CloseConet(ct);
		}
	}
     
}
