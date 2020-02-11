package spring.annotation.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee
{
	private String name;
	private String employeeId;
	
	@Autowired
	@Qualifier("address02")
	private Address address;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getEmployeeId()
	{
		return employeeId;
	}
	public void setEmployeeId(String employeeId)
	{
		this.employeeId = employeeId;
	}
	public Address getAddress() {
		return address;
	}
	/*
	 public void setAddress(Address address)
	 {
		this.address = address;
	 }
	*/
	
	public void init()
	{
		System.out.println("init method......");
	}
	
	public void destroy()
	{
		System.out.println("destroy method......");
	}
}
