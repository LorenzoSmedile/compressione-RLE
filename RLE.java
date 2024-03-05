package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class RLE extends Application{
	
	TextField tPeso= new TextField();
	Button bComprimi=new Button("COMPRIMI");
	Label lPesoImmagineCompresso= new Label("PESO IMMAGINE COMPRESSO");
	Label lCompressionRate= new Label("COMPRESSION RATE");
	
	
	public void start(Stage finestra) {
	
	
		GridPane griglia = new GridPane();
	
	
	griglia.add(tPeso, 0, 0);
	griglia.add(bComprimi, 0, 1);
	griglia.add(lPesoImmagineCompresso, 0, 2);
	griglia.add(lCompressionRate, 0, 3);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		Scene scena = new Scene(griglia);

		finestra.setTitle("Convertitore");
		finestra.setScene(scena);
		finestra.show();
	
	
	
	
	
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}