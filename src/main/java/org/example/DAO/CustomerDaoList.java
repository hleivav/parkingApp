package org.example.DAO;

import org.example.Model.Customer;

import java.util.ArrayList;

public class CustomerDaoList implements CustomerDao {

    //instance
    private static CustomerDaoList instance;

    //Static ArrayList with customers
    ArrayList<Customer> customers = new ArrayList<>();

    //private constructor
    private CustomerDaoList(){};

    //public static methods that handle the instance
    public static CustomerDaoList getInstance() {
        if (instance == null) {
            instance = new CustomerDaoList();
        }
        return instance;
    }

    //Implemented methods
    @Override
    public Customer registerCustomer(Customer customer) {
        customers.add(customer);
        return customer;
    }

    @Override
    public Customer findById(String id) {
        for(Customer element : customers){
            if (element.getCustomerId().equals(id)){
                return element;
            }
        }
        return null;
    }
}
