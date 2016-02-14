package com.topjavatutorial.app;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) throws SQLException {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringJDBCConfiguration.class);

		EmployeeDAO empDAO = applicationContext.getBean(EmployeeDAO.class);

		String empName = empDAO.getEmployeeName(1);

		System.out.println("Employee name is " + empName);

		applicationContext.close();
	}
}
