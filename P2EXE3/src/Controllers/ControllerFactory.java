package Controllers;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import Models.Model;
import Views.View;

public class ControllerFactory {
	
	public Controller buildController (Model model, View view) {
		Controller controller = null;
		String aux = model.getClass().getName().toString();
		String modelName = aux.substring(aux.indexOf('.')+1);
		Class<?> realFact;
		try {
			Class<?>[] cArg = new Class[2];
			cArg[0] = Models.Model.class;
			cArg[1] = Views.View.class;
			realFact = Class.forName("Controllers."+modelName+"Controller");
			Constructor constructor = realFact.getDeclaredConstructor(cArg);
			controller = (Controller) constructor.newInstance(new Object[]{model, view});
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return controller;
	}

}
