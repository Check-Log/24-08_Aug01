package ABC_Principles_DependencyInversion.Services;


import ABC_Principles_DependencyInversion.Abstraction.CustomerDao;
import ABC_Principles_DependencyInversion.Entities.Customer;

import java.util.List;
import java.util.Optional;

public class CustomerService { //high level component

    private final CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    // standard constructor / getter

    public Optional<Customer> findById(int id) {
        return customerDao.findById(id);
    }

    public List<Customer> findAll() {
        return customerDao.findAll();
    }
}
