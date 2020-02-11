package spring.annotation.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ritesh
 *
 */
public class MainApp
{
	public static void main(String args[])
	{	
		AbstractApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("AnnotationBeans.xml");
		Employee employee = (Employee)applicationContext.getBean("employee");
		System.out.println("Employee Name: "+employee.getName());
		System.out.println("Employee Details: "+employee.getEmployeeId());
		System.out.println("Address: "+employee.getAddress().getCity()+" | "+employee.getAddress().getCountry());
		applicationContext.registerShutdownHook();
	}
}