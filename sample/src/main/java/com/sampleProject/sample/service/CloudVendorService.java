package com.sampleProject.sample.service;

import java.util.List;

import com.sampleProject.sample.model.CloudVendor;

public interface CloudVendorService  {

    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String CloudVendorId);
    public CloudVendor getCloudVendor(String CloudVendorId);
    public List<CloudVendor> getAllCloudVendors();
    
}
