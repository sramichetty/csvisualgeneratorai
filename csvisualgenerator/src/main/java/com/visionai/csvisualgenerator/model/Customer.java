package com.visionai.csvisualgenerator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private String id ;
    private String user_id;
    private String vehicle_model_id;
    private String package_id;
    private String travel_type_id;
    private String from_area_id;
    private String to_area_id;
    private String from_city_id;
    private String to_city_id;
    private String  from_date;
    private String to_date;
    private String online_booking;
    private String mobile_site_booking;
    private String booking_created;
    private String from_lat;
    private String from_long;
    private String to_lat;
    private String to_long;
    private String Car_Cancellation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getVehicle_model_id() {
        return vehicle_model_id;
    }

    public void setVehicle_model_id(String vehicle_model_id) {
        this.vehicle_model_id = vehicle_model_id;
    }

    public String getPackage_id() {
        return package_id;
    }

    public void setPackage_id(String package_id) {
        this.package_id = package_id;
    }

    public String getTravel_type_id() {
        return travel_type_id;
    }

    public void setTravel_type_id(String travel_type_id) {
        this.travel_type_id = travel_type_id;
    }

    public String getFrom_area_id() {
        return from_area_id;
    }

    public void setFrom_area_id(String from_area_id) {
        this.from_area_id = from_area_id;
    }

    public String getTo_area_id() {
        return to_area_id;
    }

    public void setTo_area_id(String to_area_id) {
        this.to_area_id = to_area_id;
    }

    public String getFrom_city_id() {
        return from_city_id;
    }

    public void setFrom_city_id(String from_city_id) {
        this.from_city_id = from_city_id;
    }

    public String getTo_city_id() {
        return to_city_id;
    }

    public void setTo_city_id(String to_city_id) {
        this.to_city_id = to_city_id;
    }

    public String getFrom_date() {
        return from_date;
    }

    public void setFrom_date(String from_date) {
        this.from_date = from_date;
    }

    public String getTo_date() {
        return to_date;
    }

    public void setTo_date(String to_date) {
        this.to_date = to_date;
    }

    public String getOnline_booking() {
        return online_booking;
    }

    public void setOnline_booking(String online_booking) {
        this.online_booking = online_booking;
    }

    public String getMobile_site_booking() {
        return mobile_site_booking;
    }

    public void setMobile_site_booking(String mobile_site_booking) {
        this.mobile_site_booking = mobile_site_booking;
    }

    public String getBooking_created() {
        return booking_created;
    }

    public void setBooking_created(String booking_created) {
        this.booking_created = booking_created;
    }

    public String getFrom_lat() {
        return from_lat;
    }

    public void setFrom_lat(String from_lat) {
        this.from_lat = from_lat;
    }

    public String getFrom_long() {
        return from_long;
    }

    public void setFrom_long(String from_long) {
        this.from_long = from_long;
    }

    public String getTo_lat() {
        return to_lat;
    }

    public void setTo_lat(String to_lat) {
        this.to_lat = to_lat;
    }

    public String getTo_long() {
        return to_long;
    }

    public void setTo_long(String to_long) {
        this.to_long = to_long;
    }

    public String getCar_Cancellation() {
        return Car_Cancellation;
    }

    public void setCar_Cancellation(String car_Cancellation) {
        Car_Cancellation = car_Cancellation;
    }
}
