package com.example.disignpattern;

import com.example.disignpattern.model.Model;
import com.example.disignpattern.view.MainView;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class Application {



    public static void main(String[] args) {
        SwingUtilities.invokeLater(Application::runApp);
    }

    private static void runApp() {
        Model model = new Model();

        MainView view = new MainView(model);
    }
}