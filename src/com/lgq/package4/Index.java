package com.lgq.package4;


public class Index {

    public static void main(String args[]) {
        Customer customer = new Customer();
        customer.addRental(new Rental(new Movie("西红柿首富", Movie.NEW_RELEASE), 3));
        customer.addRental(new Rental(new Movie("大圣归来", Movie.CHILEDRENS), 1));
        System.out.println(customer.statement());
    }


}
