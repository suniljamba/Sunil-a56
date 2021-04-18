package com.sunil;

import javax.swing.*;

public class Assignment56 {
	public static void main(String[] args) {
		//Declaring the fields to be used
		JTextField userName = new JTextField(10);
		JTextField password = new JTextField(10);
		JTextField firstName = new JTextField(10);
		JTextField lastName = new JTextField(10);
		JTextField hours = new JTextField(10);
		JTextField days = new JTextField(10);
		JTextField boxes = new JTextField(10);
		JTextField packages = new JTextField(10);
		JTextField optionSize = new JTextField(10);
		JTextField boxSize = new JTextField(10);
		
		//Constant username and password
		final String USER = "Will";
		final String PASS = "Will";

		int attempts = 0;
		Object[] detail = { "Username: ", userName, "Password: ", password };

		while (attempts < 3) {
			JOptionPane.showMessageDialog(null, detail, "Login", JOptionPane.PLAIN_MESSAGE);

			if (userName.getText().equalsIgnoreCase(USER) && password.getText().equals(PASS)) {
				JOptionPane.showMessageDialog(null, "Wecome Will!", "Login", JOptionPane.PLAIN_MESSAGE);

				break;
			} else {
				userName.setText("");
				password.setText("");
				attempts++;
				if (attempts != 3) {
					JOptionPane.showMessageDialog(null, "You have only" + (3 - attempts) + " left", "Warning",
							JOptionPane.PLAIN_MESSAGE);
				}
			}
		}
		if (attempts == 3) {
			JOptionPane.showMessageDialog(null,
					"Your account is locked",
					"Access Denied",
					JOptionPane.PLAIN_MESSAGE);
		} else {

			Object[] userDetails = { "First Name: ", firstName, "Last Name: ", lastName, "Hours: ", hours, "Days: ",
					days, "No. of boxes: ", boxes, "Package- A or B: ", packages, "Option Size- S or L: ",
					optionSize, "Box Size- S or L: ", boxSize };
			do {
			JOptionPane.showMessageDialog(null, userDetails, "Login", JOptionPane.PLAIN_MESSAGE);
			}while(firstName.getText().isEmpty()
				|| lastName.getText().isEmpty()
				|| hours.getText().isEmpty()
				|| days.getText().isEmpty()
				|| boxes.getText().isEmpty()
				|| packages.getText().isEmpty()
				|| optionSize.getText().isEmpty()
				|| boxSize.getText().isEmpty()
				|| boxSize.getText().isEmpty()
					);
			String objfirstName = firstName.getText();
			String objlastName = lastName.getText();
			int objhours = Integer.parseInt(hours.getText());
			int objdays = Integer.parseInt(days.getText());
			int objboxes = Integer.parseInt(boxes.getText());
			String objpackages = packages.getText();
			String objoptionSize = optionSize.getText();
			String objboxSize = boxSize.getText();
			Calculation objsample = new Calculation(objfirstName, objlastName, objhours, objdays, objboxes,
					objpackages, objoptionSize, objboxSize);
			String message = "";
			message += "\n" + objsample.getServiceCost();
			message += "\n" + objsample.getOptionCost();
			message += "\n" + objsample.getItemCost();
			message += "\n" + objsample.getTotalCost();
			JOptionPane.showMessageDialog(null, "Hi "+objfirstName + ", Thank you for using our application!"+"\n"+message);
		}
	}
}
