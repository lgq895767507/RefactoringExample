package com.lgq.package7;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

    private String name;
    private Vector rentals = new Vector();

    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {

        Enumeration elements = rentals.elements();
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");
        while (elements.hasMoreElements()) {
            Rental each = (Rental) elements.nextElement();

            //show figures for this rental
            result.append("\t").append(each.getMovie().getTitle()).append("\t").append(String.valueOf(each.getCharge())).append("\n");
        }
        //add footer lines
        result.append("Amount owed is ").append(String.valueOf(getTotalCharge())).append("\n");
        result.append("You earned ").append(String.valueOf(getTotalFrequentRenterPoints())).append(" frequent renter points");
        return result.toString();
    }

    private double getTotalCharge(){
        double result = 0;
        Enumeration enumeration = rentals.elements();
        while (enumeration.hasMoreElements()){
            Rental each = (Rental) enumeration.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints(){
        int result = 0;
        Enumeration enumeration = rentals.elements();
        while (enumeration.hasMoreElements()){
            Rental each = (Rental) enumeration.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }


}
