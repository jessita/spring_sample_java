package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repo.CustRepo;
import com.pluralsight.repo.HibernateCustRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jsst_ on 12/7/2017.
 */
@Service("custService")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustServiceImpl implements CustService {

    private CustRepo custRepo;

    public CustServiceImpl(){}

    public CustServiceImpl(CustRepo custRepo) {
        System.out.println("using constructor injection");
        this.custRepo = custRepo;
    }
    @Autowired
    public void setCustRepo(CustRepo custRepo) {
        System.out.println("using setter injection");
        this.custRepo = custRepo;
    }

    public List<Customer> findAll(){
        return custRepo.findAll();
    }
}
