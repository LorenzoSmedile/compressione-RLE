package it.edu.iisgubbio.geometria;

import java.util.Hashtable;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import java.util.*;

public class RLE extends Application {

	TextField tPeso = new TextField();
	Button bComprimi = new Button("COMPRIMI");
	Label lPesoImmagineCompresso = new Label("PESO IMMAGINE COMPRESSO");
	Label lCompressionRate = new Label("COMPRESSION RATE");
	
	String matrice[][];

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

		bComprimi.setOnAction(e -> sopprimi());

	}

	public void sopprimi() {
		

		int riga=3;
		int colonna=3;
		matrice=new String [riga][colonna];
		
		for (int i=0;i<riga;i++) {
			Hashtable<String, Integer> my_dict= new Hashtable<String,Integer>();
			for (int i2=0;i2<colonna;i2++) {
				if (my_dict.containsKey(matrice[i][i2])) {
					
					int val = my_dict.get(matrice[i][i2]);
					my_dict.get(val+1);
				} else {
					my_dict.put(matrice[i][i2],1);

					
				}
			}
		}

	}

	public static void main(String[] args) {
		launch(args);
	}

}