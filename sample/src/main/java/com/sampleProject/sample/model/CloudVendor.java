package com.sampleProject.sample.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="cloud_vendor_info")
public class CloudVendor{

    @Id
    private String VendorId;
    private String VendorName;
    private String VendorAddress;
    private String VendorPhoneNumber;

    
    public CloudVendor() {


    }
    


    public String getVendorId() {
        return VendorId;
    }



    public void setVendorId(String vendorId) {
        VendorId = vendorId;
    }



    public String getVendorName() {
        return VendorName;
    }



    public void setVendorName(String vendorName) {
        VendorName = vendorName;
    }



    public String getVendorAddress() {
        return VendorAddress;
    }



    public void setVendorAddress(String vendorAddress) {
        VendorAddress = vendorAddress;
    }



    public String getVendorPhoneNumber() {
        return VendorPhoneNumber;
    }



    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        VendorPhoneNumber = vendorPhoneNumber;
    }



    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
        VendorId = vendorId;
        VendorName = vendorName;
        VendorAddress = vendorAddress;
        VendorPhoneNumber = vendorPhoneNumber;
    }
    
}