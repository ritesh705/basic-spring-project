package spring.main;

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
				new ClassPathXmlApplicationContext("Beans.xml");
		Employee employee = (Employee)applicationContext.getBean("employee");
		JavaCollection jc = (JavaCollection)applicationContext.getBean("javaCollection");
		System.out.println("Employee Name: "+employee.getName());
		System.out.println("Address: "+employee.getAddress().getCity()+" | "+employee.getAddress().getCountry());
		System.out.println("Employee Details: "+employee.getEmployeeId()+" | "+employee.getEmailId());
		System.out.println(jc.getList()+"\n"+jc.getSet()+"\n"+jc.getMap()+"\n"+jc.getProps());
		applicationContext.registerShutdownHook();
	}
}