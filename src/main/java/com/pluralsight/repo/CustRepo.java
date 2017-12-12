package com.pluralsight.repo;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by jsst_ on 12/7/2017.
 */
public interface CustRepo {
     List<Customer> findAll();
}
