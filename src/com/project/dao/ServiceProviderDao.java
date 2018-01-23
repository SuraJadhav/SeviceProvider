package com.project.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.project.beans.ServiceProvider;
import com.project.beans.User;

public class ServiceProviderDao {
	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}
	public int send(String p,int cont)
	{
		System.out.println("to update providers table");
		System.out.println(p+cont);
		String sql="UPDATE provider SET requestContact='"+p+"' WHERE contact='"+cont+"'";  
	    return template.update(sql);  
	}
	public int save(ServiceProvider p){ 
		
		System.out.println("here in dao method");
		//System.out.println(p.getName()+p.getArea()+p.getName()+p.getPassword());
	    String sql="insert into provider(name,service,area,charge,contact,password)values('"+p.getName()+"','"+p.getService()+"','"+p.getArea()+"','"+p.getCharge()+"','"+p.getContact()+"','"+p.getPassword()+"')";  
	    return template.update(sql);  
	}
	
	
	public List<ServiceProvider> checkServiceRequest(ServiceProvider p)
	{
		String sql="select * from Provider where contact='" + p.getContact() + "'";
		List<ServiceProvider> provider = template.query(sql, new ProviderMapper());
	    return provider;
	}
	
	
	public List<ServiceProvider> checkService(ServiceProvider p)
	{
		String sql="select * from Provider where service='" + p.getService() + "'";
		List<ServiceProvider> provider = template.query(sql, new ProviderMapper());
	    return provider;
	}
	public ServiceProvider checkProvider(ServiceProvider p)
	{
		String sql="select * from provider where contact='" + p.getContact() + "' and password='" + p.getPassword()
	    + "'";
		List<ServiceProvider> provider = template.query(sql, new ProviderMapper());
		return provider.size() > 0 ? provider.get(0) : null;
	}


}
class ProviderMapper implements RowMapper<ServiceProvider> {
	  public ServiceProvider mapRow(ResultSet rs, int arg1) throws SQLException {
	    ServiceProvider provider = new ServiceProvider();
	    provider.setName(rs.getString("name"));
	    provider.setArea(rs.getString("area"));
	    provider.setCharge(rs.getString("charge"));
	    provider.setService(rs.getString("service"));
	    provider.setContact(rs.getString("contact"));
	    provider.setRequestContact(rs.getString("requestContact"));
	    
	    return provider;
	  }
}