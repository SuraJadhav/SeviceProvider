package com.project.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.project.beans.ServiceProvider;

public class ServiceProviderDao {
	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}
	public List<ServiceProvider> checkService(ServiceProvider p)
	{
		String sql="select * from Provider where service='" + p.getService() + "'";
		List<ServiceProvider> provider = template.query(sql, new ProviderMapper());
	    return provider;
	}

}
class ProviderMapper implements RowMapper<ServiceProvider> {
	  public ServiceProvider mapRow(ResultSet rs, int arg1) throws SQLException {
	    ServiceProvider provider = new ServiceProvider();
	    provider.setName(rs.getString("name"));
	    provider.setArea(rs.getString("area"));
	    provider.setCharge(rs.getString("charge"));
	    provider.setService(rs.getString("service"));
	    
	    return provider;
	  }
}