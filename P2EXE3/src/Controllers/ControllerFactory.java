package Controllers;

import Models.Model;
import Views.View;

public class ControllerFactory {
	
	public Controller buildController (Model model, View view) {
		Controller controller = null;
		String aux = model.getClass().getName().toString();
		String modelName = aux.substring(aux.indexOf('.')+1);
		Class<?> realFact;
		try {
			realFact = Class.forName("Controllers."+modelName+"Controller");
			controller = (Controller) realFact.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//String viewName = view.getName();
		
		return controller;
	}

}
