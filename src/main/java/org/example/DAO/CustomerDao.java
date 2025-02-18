package org.example.DAO;

import org.example.Model.Customer;

public interface CustomerDao {
    Customer registerCustomer(Customer customer);
    Customer findById(String id);
}
