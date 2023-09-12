package com.example.expensemgmt.model;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private double expenseLimit;

    public User(String firstName, String lastName, double expenseLimit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expenseLimit = expenseLimit;
    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getExpenseLimit() {
        return expenseLimit;
    }

    public void setExpenseLimit(double expenseLimit) {
        this.expenseLimit = expenseLimit;
    }
}
