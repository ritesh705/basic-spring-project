package spring.main;

public class Employee {

	private String name;
	private String city;
	private Address address01;
	private String employeeId;
	private String emailId;
	
	public Employee(Address address01, String employeeId, String emailId)
	{
		this.address01 = address01;
		this.employeeId = employeeId;
		this.emailId = emailId;
	}
	
	public String getEmployeeId()
	{
		return employeeId;
	}

	public void setEmployeeId(String employeeId)
	{
		this.employeeId = employeeId;
	}

	public String getEmailId()
	{
		return emailId;
	}

	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}

	public Address getAddress()
	{
		return address01;
	}
	
	public void setAddress(Address address)
	{
		this.address01 = address;
	}
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public void init()
	{
		System.out.println("init method......");
	}
	
	public void destroy()
	{
		System.out.println("destroy method......");
	}
}
