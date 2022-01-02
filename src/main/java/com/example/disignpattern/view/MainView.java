package com.example.disignpattern.view;

import com.example.disignpattern.model.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JFrame implements ActionListener {

    private Model model;
    private JButton helloBtn;
    private JButton byeBtn;

    public MainView(Model model) {
        super("MVC model");
        this.model = model;

        helloBtn = new JButton("Click Me!");
        byeBtn = new JButton("Bye!");

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.CENTER;
        gc.gridx = 1;
        gc.gridy = 1;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;
        
        add(helloBtn, gc);

        gc.gridy = 2;
        add(byeBtn, gc);

        helloBtn.addActionListener(this);
        byeBtn.addActionListener(this);
        byeBtn.addActionListener(e -> System.out.println("Anonymous action listener"));

        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        if (source == helloBtn) {
            System.out.println("Hello there!");
        } else {
            System.out.println("Some other button.");
        }
    }
}
