package com.example.disignpattern;

import javax.swing.SwingUtilities;

import com.example.disignpattern.controller.Controller;
import com.example.disignpattern.model.Model;
import com.example.disignpattern.view.MainView;

public class Application {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(Application::runApp);
	}
	
	public static void runApp() {
		Model model = new Model();
		MainView view = new MainView(model);

		Controller controller = new Controller(view, model);
		
		view.setLoginListener(controller);
	}

}
