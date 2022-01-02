package com.example.disignpattern.view;

import com.example.disignpattern.model.Model;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {

    private Model model;

    public MainView(Model model) {
        super("MVC model");
        this.model = model;

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.CENTER;
        gc.gridheight = 0;
        gc.gridwidth = 0;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;

        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
