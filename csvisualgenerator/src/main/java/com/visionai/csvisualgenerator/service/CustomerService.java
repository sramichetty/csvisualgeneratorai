package com.visionai.csvisualgenerator.service;

import com.visionai.csvisualgenerator.repository.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import com.visionai.csvisualgenerator.model.Customer;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Service
public class CustomerService {
    @Autowired
    private CustomerDTO cdto;

    String line = "";

    public Void saveustomerData() throws FileNotFoundException {

        try{
            BufferedReader br = new BufferedReader(new FileReader("/Users/apple/Downloads/csvisualgenerator/src/main/resources/Data.csv"));
            while((line=br.readLine())!=null){
                String [] data = line.split(" ,");
                Customer c = new Customer();
                c.setId(data[0]);
                c.setUser_id(data[1]);
                c.setVehicle_model_id(data[2]);
                c.setPackage_id(data[3]);
                c.setTravel_type_id(data[4]);
                c.setFrom_area_id(data[5]);
                c.setTo_area_id(data[6]);
                c.setFrom_area_id(data[7]);
                c.setTo_area_id(data[8]);
                c.setFrom_city_id(data[9]);
                c.setFrom_date(data[10]);
                c.setTo_date(data[11]);
                c.setOnline_booking(data[12]);
                c.setMobile_site_booking(data[13]);
                c.setBooking_created(data[14]);
                c.setFrom_lat(data[15]);
                c.setFrom_long(data[16]);
                c.setTo_lat(data[17]);
                c.setTo_long(data[18]);
                c.setCar_Cancellation(data[19]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;

    }


}
