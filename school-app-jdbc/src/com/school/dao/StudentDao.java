package com.school.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.cj.protocol.Resultset;
import com.school.configuration.HelperClass;
import com.school.dto.Student;

public class StudentDao {
	HelperClass helperClass = new HelperClass();
	Connection connection = null;
	public void getAllStudent() {
		connection=helperClass.getConnection();
		String sql="SELECT * FROM student";
	try {
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		ResultSet resultset =  preparedStatement.executeQuery();
		while(resultset.next()) {
			 System.out.println(resultset.getInt(1));
			 System.out.println(resultset.getString(2));
			 System.out.println(resultset.getString(3));
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	}
	
	
	//to get student data
	public int getStudent(int id) {
		//establish connection 
		connection =helperClass.getConnection();
		String sql = "SELECT * FROM student WHERE ID= ?";
		
		try {
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			
			
			preparedStatement.setInt(1,id);
			ResultSet a =preparedStatement.executeQuery();
       while(a.next()) {
				 System.out.println(a.getInt(1));
				 System.out.println(a.getString(2));
				 System.out.println(a.getString(3));
       }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return id;
	}
	//to update student data 
	public Student updateStudent(Student student) {
		// establish connection
		connection=helperClass.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("UPDATE student set name = ? ,email = ? WHERE id  = ?");
			//passed the values to set holders
			preparedStatement.setString(1,student.getName());
			preparedStatement.setString(2,student.getEmail());
			preparedStatement.setInt(3,student.getId());
			//execute
			int a = preparedStatement.executeUpdate();
			
				if(a>0) {
					   System.out.println("updated");
				   }
				   else {
					   System.out.println("not updated"
					   		+ ""
					   		+ ""
					   		+ ""
					   		+ ""
					   		+ "");
				   }				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return student;
	}
	// to delete student data
    public boolean studentDeleteById(int id) {
    	//step 1 establish connection
    connection = helperClass.getConnection();
    String sql ="DELETE from student WHERE id =?";
    //establish statement
    try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		//passed the values to place-holders
		preparedStatement.setInt(1, id);
		//EXECUTE
		int i =  preparedStatement.executeUpdate();
		if(i>0) {
			return true;
		}
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    return false;
    }
	
	//to save a student data
	public Student saveStudent(Student student) {
		connection =helperClass.getConnection();
		String sql ="INSERT INTO student Values(?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			// passed the values to delimiters/placeholders ----> ?
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2,student.getName());
			preparedStatement.setString(3, student.getEmail());
			//execute
			preparedStatement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return student;
		
	}


}
