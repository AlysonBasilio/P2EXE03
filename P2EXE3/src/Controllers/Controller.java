package Controllers;

import Models.Model;
import Views.View;

public class Controller {
	Model model;
	View view;
	public Controller(Model m, View v){
		this.model = m;
		this.view = v;
	}
}
