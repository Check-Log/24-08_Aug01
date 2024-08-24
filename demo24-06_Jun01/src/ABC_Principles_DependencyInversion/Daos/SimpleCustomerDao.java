package ABC_Principles_DependencyInversion.Daos;

import ABC_Principles_DependencyInversion.Abstraction.CustomerDao;
import ABC_Principles_DependencyInversion.Entities.Customer;


import java.util.*;

public class SimpleCustomerDao implements CustomerDao {


    public SimpleCustomerDao(Map<Integer, Customer> customers) {
        this.customers = customers;
    }

    //ArrayList customers = new ArrayList();
    Map<Integer,Customer> customers = new HashMap<>();

    @Override
    public Optional<Customer> findById(int id) {
        return Optional.ofNullable(customers.get(id));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }
}
