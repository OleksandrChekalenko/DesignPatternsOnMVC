package com.example.disignpattern.controller;

import com.example.disignpattern.model.Model;
import com.example.disignpattern.view.MainView;

public class Controller {

    private Model model;
    private MainView view;

    public Controller(Model model, MainView view) {
        this.model = model;
        this.view = view;
    }
}
