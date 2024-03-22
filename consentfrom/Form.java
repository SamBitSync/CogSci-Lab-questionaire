package org.example.consentfrom;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Form extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(5);
        grid.setVgap(5);

        // Title
        Label titleLabel = new Label("Questionnaire");
        titleLabel.setFont(Font.font("Arial", FontWeight.BOLD, 18));
        grid.add(titleLabel, 0, 0, 2, 1);

        // Subject ID
        Label subjectIdLabel = new Label("Subject ID:");
        grid.add(subjectIdLabel, 0, 1);

        TextField subjectIdField = new TextField();
        grid.add(subjectIdField, 1, 1);

        // Contact Information
        Label contactLabel = new Label("Contact Information");
        contactLabel.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        grid.add(contactLabel, 0, 2, 2, 1);

        // Name
        Label nameLabel = new Label("Name:");
        grid.add(nameLabel, 0, 3);

        TextField nameField = new TextField();
        grid.add(nameField, 1, 3);

        // Email
        Label emailLabel = new Label("Email:");
        grid.add(emailLabel, 0, 4);

        TextField emailField = new TextField();
        grid.add(emailField, 1, 4);

        // Mobile
        Label mobileLabel = new Label("Mobile:");
        grid.add(mobileLabel, 0, 5);

        TextField mobileField = new TextField();
        grid.add(mobileField, 1, 5);

        // Date
        Label dateLabel = new Label("Date:");
        grid.add(dateLabel, 0, 6);

        DatePicker datePicker = new DatePicker();
        grid.add(datePicker, 1, 6);

        // Instructions
        Label instructionsLabel = new Label("Please answer the following questions to the best of your knowledge.");
        grid.add(instructionsLabel, 0, 7, 2, 1);

        // Question 1
        Label q1Label = new Label("1. Age (in years): ");
        grid.add(q1Label, 0, 8);

        TextField q1Field = new TextField();
        grid.add(q1Field, 1, 8);

        // Question 2
        Label q2Label = new Label("2. Sex:");
        grid.add(q2Label, 0, 9);

        ToggleGroup sexGroup = new ToggleGroup();

        RadioButton maleRadio = new RadioButton("Male");
        maleRadio.setToggleGroup(sexGroup);
        grid.add(maleRadio, 1, 9);

        RadioButton femaleRadio = new RadioButton("Female");
        femaleRadio.setToggleGroup(sexGroup);
        grid.add(femaleRadio, 2, 9);

        // Question 3


        ScrollPane scrollPane = new ScrollPane(grid);

        Scene scene = new Scene(scrollPane, 600, 400);
        stage.setScene(scene);
        stage.setTitle("Questionnaire");
        stage.show();
    }
}
