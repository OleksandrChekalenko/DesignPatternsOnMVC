package com.example.disignpattern.controller;

import java.sql.SQLException;

import com.example.disignpattern.model.Model;
import com.example.disignpattern.model.Person;
import com.example.disignpattern.model.PersonDAO;
import com.example.disignpattern.view.CreateUserEvent;
import com.example.disignpattern.view.CreateUserListener;
import com.example.disignpattern.view.MainView;

public class Controller implements CreateUserListener {
	private MainView view;
	private Model model;
	
	private PersonDAO personDAO = new PersonDAO();
	
	public Controller(MainView view, Model model) {
		this.view = view;
		this.model = model;
	}

	@Override
	public void userCreated(CreateUserEvent event) {
		System.out.println("Login event received: " + event.getName() + "; " + event.getPassword());
		
		try {
			personDAO.addPerson(new Person(event.getName(), event.getPassword()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
