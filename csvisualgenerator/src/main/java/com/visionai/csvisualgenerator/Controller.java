package com.visionai.csvisualgenerator;


import com.visionai.csvisualgenerator.model.Customer;
import com.visionai.csvisualgenerator.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
public class Controller {

    @Autowired
    private CustomerService cs;
    @RequestMapping(path="feedCustomerData")
    public void setDataInDB() throws FileNotFoundException {
        cs.saveustomerData();

    }

}
