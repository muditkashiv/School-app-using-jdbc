package com.school.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.school.configuration.HelperClass;

import com.school.dto.Teacher;
import java.sql.Connection;

     

public class TeacherDao {
	HelperClass helperClass = new HelperClass();
	Connection connection = null;
	
	//to all details of teacher
	public void getAllTeacher() {
		connection=helperClass.getConnection();
		String sql="SELECT * FROM teacher";
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
	
	
	//to get teacher data
	public int getTeacher(int id) {
		//establish connection 
		connection =helperClass.getConnection();
		String sql = "SELECT * FROM teacher WHERE ID= ?";
		
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
	//to update Teacher data 
	public Teacher updateTeacher(Teacher teacher) {
		// establish connection
		connection=helperClass.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("UPDATE student set name = ? ,email = ? WHERE id  = ?");
			//passed the values to set holders
			preparedStatement.setString(1,teacher.getName());
			preparedStatement.setString(2,teacher.getEmail());
			preparedStatement.setInt(3,teacher.getId());
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
		return teacher;
	}
	// to delete teacher data
    public boolean teacherDeleteById(int id) {
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
	public Teacher saveTeacher(Teacher teacher) {
		
		Connection connection = helperClass.getConnection();
		String sql ="INSERT INTO teacher Values(?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			// passed the values to delimiters/placeholders ----> ?
			preparedStatement.setInt(1, teacher.getId());
			preparedStatement.setString(2,teacher.getName());
			preparedStatement.setString(3, teacher.getEmail());
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
		return teacher;
		
	}
	}

