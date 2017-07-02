package Controllers;

import Models.Model;
import Models.Professor;
import Views.ProfessorView;
import Views.View;

public class ProfessorController extends Controller {
	private Professor model;
	private ProfessorView view;

	public ProfessorController(Model model, View view) {
		super(model, view);
		this.model = (Professor) model;
		this.view = (ProfessorView) view;
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