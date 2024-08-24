package ABC_Principles_DependencyInversion.Abstraction;



import ABC_Principles_DependencyInversion.Entities.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {

    Optional<Customer> findById(int id);

    List<Customer> findAll();
}
