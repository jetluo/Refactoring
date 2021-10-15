package org.jetluo.movieRental;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @ClassName Customer
 * @Description TODO
 * @Author jet
 * @Date 2021/10/15 09:18
 * @Version 1.0
 **/
public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }


    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

}













