package exe03;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import Controllers.Controller;
import Controllers.ControllerFactory;
import Models.Professor;
import Models.Student;
import Views.ProfessorView;
import Views.StudentView;

public class MVCPatternDemo {
	public static void main(String[] args) {

		// fetch student record based on his roll no from the database
		Student sModel = retriveStudentFromDatabase();
		// Create a view : to write student details on console
		StudentView sView = new StudentView();
		ControllerFactory cF = new ControllerFactory();
		Controller controller = cF.buildController(sModel, sView);
		
		Method[] methods = controller.getClass().getDeclaredMethods();
		
		for(Method m : methods){
			if(m.getName().equals("updateView")){
				try {
					m.invoke(controller, null);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		for(Method m : methods){
			if(m.getName().equals("setStudentName")){
				try {
					m.invoke(controller, "John");
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		for(Method m : methods){
			if(m.getName().equals("updateView")){
				try {
					m.invoke(controller, null);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		// fetch student record based on his roll no from the database
		Professor pModel = retriveProfessorFromDatabase();
		// Create a view : to write student details on console
		ProfessorView pView = new ProfessorView();
		controller = cF.buildController(pModel, pView);
		
		methods = controller.getClass().getDeclaredMethods();
		
		for(Method m : methods){
			if(m.getName().equals("updateView")){
				try {
					m.invoke(controller, null);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		for(Method m : methods){
			if(m.getName().equals("setProfessorName")){
				try {
					m.invoke(controller, "Stewart");
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		for(Method m : methods){
			if(m.getName().equals("updateView")){
				try {
					m.invoke(controller, null);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
	
	private static Professor retriveProfessorFromDatabase() {
		Professor prof = new Professor();
		prof.setName("Rupert");
		return prof;
	}

}
