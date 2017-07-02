package Controllers;

import Models.Model;
import Models.Student;
import Views.StudentView;
import Views.View;

public class StudentController extends Controller {
	private Student model;
	private StudentView view;

	public StudentController(Model model, View view) {
		super(model,view);
		this.model = (Student) model;
		this.view = (StudentView) view;
	}

	public void setStudentName(String name) {
		model.setName(name);
	}

	public String getStudentName() {
		return model.getName();
	}

	public void setStudentRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}

	public String getStudentRollNo() {
		return model.getRollNo();
	}

	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollNo());
	}

}
