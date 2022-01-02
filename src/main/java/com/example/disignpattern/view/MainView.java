package com.example.disignpattern.view;

import com.example.disignpattern.model.Model;

import javax.swing.*;

public class MainView extends JFrame {

    private Model model;

    public MainView(Model model) {
        super("MVC model");
        this.model = model;
    }
}
