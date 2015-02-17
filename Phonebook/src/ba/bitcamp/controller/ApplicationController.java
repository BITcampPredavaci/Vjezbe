package ba.bitcamp.controller;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import ba.bitcamp.model.*;
import ba.bitcamp.view.*;

public class ApplicationController {

	/**
	 * calls the method to show the home
	 * view
	 */
	public static void home(){
		//prikaz home GUI-a
		ApplicationView.home();
	}
	
	/**
	 * calls the method to show the add form
	 */
	public static void addContact(){
		ApplicationView.addContact();
	}
	
	public static void create(String name, String surname, String number){
		Contact newContact = new Contact(name, surname, number);
		if( newContact.save() == true){
			//TODO redirect to contact info
			home();
			JOptionPane.showMessageDialog(null, "Successfuly saved "+newContact.getName(), "Contact added", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "There has been a mistake", "Error saving Contact", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public static void main(String[] args) {	
		//try to initialize the database connection
		try {
			Application.init();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
		//initialize the main view
		Main.init();
		home();
	}

}
