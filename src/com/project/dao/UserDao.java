package com.project.dao;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;


import com.project.beans.User;  
public class UserDao {
	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}
	public int save(User p){ 
	
		System.out.println("here in dao method");
		System.out.println(p.getAddress()+p.getContactNo()+p.getName()+p.getPassword());
	    String sql="insert into Emp99(name,address,contactNo,password)values('"+p.getName()+"','"+p.getAddress()+"','"+p.getContactNo()+"','"+p.getPassword()+"')";  
	    return template.update(sql);  
	}
	public User checkUser(User p)
	{
		String sql="select * from Emp99 where contactNo='" + p.getContactNo() + "' and password='" + p.getPassword()
	    + "'";
		List<User> users = template.query(sql, new UserMapper());

	    return users.size() > 0 ? users.get(0) : null;
	}

}
class UserMapper implements RowMapper<User> {

	
	
	  public User mapRow(ResultSet rs, int arg1) throws SQLException {
	    User user = new User();
	    user.setName(rs.getString("name"));
	    user.setPassword(rs.getString("password"));
	    user.setContactNo(rs.getString("contactNo"));
	    user.setAddress(rs.getString("address"));
	    
	    return user;
	  }
}
