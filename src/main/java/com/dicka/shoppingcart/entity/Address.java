package com.dicka.shoppingcart.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tabel_address")
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String province;
    private String city;
    private String village;
    private String zipCode;
    private String street;
    private String number;

    public Address(){}

    public Address(int id, String province, String city, String village, String zipCode, String street, String number) {
        this.id = id;
        this.province = province;
        this.city = city;
        this.village = village;
        this.zipCode = zipCode;
        this.street = street;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
