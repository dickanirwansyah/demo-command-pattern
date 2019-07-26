package com.dicka.shoppingcart.model;

import com.dicka.shoppingcart.dummy.constant.ConstantVariable;
import com.dicka.shoppingcart.util.ServiceRequest;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class AccountRequestInsert implements ServiceRequest{

    @NotBlank(message = ConstantVariable.ACCOUNT_FIRSTNAME_NULL)
    private String firstname;

    @NotBlank(message = ConstantVariable.ACCOUNT_LASTNAME_NULL)
    private String lastname;

    @NotBlank(message = ConstantVariable.ACCOUNT_EMAILS_NULL)
    @Email(message = ConstantVariable.ACCOUNT_EMAILS_NOT_VALID)
    private String email;

    @NotBlank(message = ConstantVariable.ACCOUNT_GENDER_NULL)
    private String gender;

    @NotNull(message = ConstantVariable.ACCOUNT_DOB_NULL)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dob;

    private int age;

    @NotBlank(message = ConstantVariable.ACCOUNT_PROVINCE)
    private String province;

    @NotBlank(message = ConstantVariable.ACCOUNT_CITY)
    private String city;

    @NotBlank(message = ConstantVariable.ACCOUNT_VILLAGE)
    private String village;

    @NotBlank(message = ConstantVariable.ACCOUNT_ZIPCODE)
    private String zipCode;

    @NotBlank(message = ConstantVariable.ACCOUNT_STREET)
    private String street;

    @NotBlank(message = ConstantVariable.ACCOUNT_NUMBER)
    private String number;

    public AccountRequestInsert() {
    }

    public AccountRequestInsert(@NotBlank(message = ConstantVariable.ACCOUNT_FIRSTNAME_NULL) String firstname, @NotBlank(message = ConstantVariable.ACCOUNT_LASTNAME_NULL) String lastname, @NotBlank(message = ConstantVariable.ACCOUNT_EMAILS_NULL) @Email(message = ConstantVariable.ACCOUNT_EMAILS_NOT_VALID) String email, @NotBlank(message = ConstantVariable.ACCOUNT_GENDER_NULL) String gender, @NotNull(message = ConstantVariable.ACCOUNT_DOB_NULL) Date dob, int age, @NotBlank(message = ConstantVariable.ACCOUNT_PROVINCE) String province, @NotBlank(message = ConstantVariable.ACCOUNT_CITY) String city, @NotBlank(message = ConstantVariable.ACCOUNT_VILLAGE) String village, @NotBlank(message = ConstantVariable.ACCOUNT_ZIPCODE) String zipCode, @NotBlank(message = ConstantVariable.ACCOUNT_STREET) String street, @NotBlank(message = ConstantVariable.ACCOUNT_NUMBER) String number) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
        this.dob = dob;
        this.age = age;
        this.province = province;
        this.city = city;
        this.village = village;
        this.zipCode = zipCode;
        this.street = street;
        this.number = number;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
