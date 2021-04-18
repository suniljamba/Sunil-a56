package com.sunil;

import javax.swing.*;

public class Calculation {
	String firstName;
	String lastName;
	int hours;
	int days;
	int boxes;
	String packagee;
	String optionSize;
	String box_Size;
	int serviceCost;
	double optionCost;
	double itemsCost;
	double totalCost;

	// default constructor
	public Calculation() {

	}

	// overloading the constructor
	public Calculation(String firstName, String lastName, int hours, int days, int boxes, String packages,
			String optionSize, String box_Size) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.hours = hours;
		this.days = days;
		this.boxes = boxes;
		this.packagee = packages;
		this.optionSize = optionSize;
		this.box_Size = box_Size;
	}

	public String getServiceCost() {
		if (packagee.equalsIgnoreCase("A")) {
			this.serviceCost = this.hours * 100;
		} else if (packagee.equalsIgnoreCase("B")) {
			this.serviceCost = this.hours * 150;
		}
		return "your service cost is $" + this.serviceCost;
	}

	public String getOptionCost() {
		if (optionSize.equalsIgnoreCase("S")) {
			this.optionCost = this.days * 8;
		} else if (optionSize.equalsIgnoreCase("L")) {
			this.optionCost = this.days * 20.11;
		}
		return "your option cost is $" + this.optionCost;
	}

	public String getItemCost() {
		if (box_Size.equalsIgnoreCase("S")) {
			this.itemsCost = this.boxes * 2.50;
		} else if (box_Size.equalsIgnoreCase("L")) {
			this.itemsCost = this.boxes * 4.50;
		}
		return "your item cost is $" + this.itemsCost;
	}

	public String getTotalCost() {
		this.totalCost = this.serviceCost + this.optionCost + this.itemsCost;
		return "your total cost is $" + this.totalCost;
	}
}
