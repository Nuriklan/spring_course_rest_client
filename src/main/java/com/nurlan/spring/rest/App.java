package com.nurlan.spring.rest;

import com.nurlan.spring.rest.configuration.MyConfig;
import com.nurlan.spring.rest.entity.Employee;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication",
                Communication.class);
        
        //List<Employee> allEmployees = communication.getAllEmployees();
        //System.out.println(allEmployees);
        //Employee employee = communication.getEmployee(1);
        //System.out.println(employee);
        
        Employee emp = new Employee("Sveta", "Sokolova", "HR", 900);
    }
}
