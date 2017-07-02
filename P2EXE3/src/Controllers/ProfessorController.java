package Controllers;

import Models.Professor;
import Views.ProfessorView;

public class ProfessorController extends Controller {
	private Professor model;
	private ProfessorView view;

	public ProfessorController(Professor model, ProfessorView view) {
		this.model = model;
		this.view = view;
	}

	public void setProfessorName(String name) {
		model.setName(name);
	}

	public String getProfessorName() {
		return model.getName();
	}

	public void updateView() {
		view.printProfessorDetails(model.getName());
	}

}