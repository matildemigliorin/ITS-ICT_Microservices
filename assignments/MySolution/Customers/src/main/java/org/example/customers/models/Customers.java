package org.example.customers.models;

public class Customers {

    String customerId;
    String customerName;
    String customerSurname;
    String customerNumber;
    String customerAddress;


    public String getCustomerId(){
        return customerId;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getCustomerSurname(){
        return customerSurname;
    }
    public String getCustomerNumber(){
        return customerNumber;
    }
    public String getCustomerAddress(){
        return customerAddress;
    }

    public void setCustomerId(String customerId){
        this.customerId=customerId;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setCustomerSurname(String customerSurname){
        this.customerSurname=customerSurname;
    }
    public void setCustomerNumber(String customerNumber){
        this.customerNumber=customerNumber;
    }
    public void setCustomerAddress(String customerAddress){
        this.customerAddress=customerAddress;
    }

    @Override
    public String toString(){
        return this.customerId + " " + this.customerName + " " + this.customerSurname;
    }

}
