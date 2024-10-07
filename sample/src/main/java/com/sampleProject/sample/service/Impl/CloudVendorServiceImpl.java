package com.sampleProject.sample.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sampleProject.sample.exception.CloudVendorNotFoundException;
import com.sampleProject.sample.model.CloudVendor;
import com.sampleProject.sample.repository.CloudVendorRepository;
import com.sampleProject.sample.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService{

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        
        cloudVendorRepository.save(cloudVendor);
        return "Created Successfully";
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
 
    return  cloudVendorRepository.findAll();
    }

    @Override
    public CloudVendor getCloudVendor(String CloudVendorId) {

        if(cloudVendorRepository.findById(CloudVendorId).isEmpty()){

            throw new CloudVendorNotFoundException("Requested cloud vendor doesnot exist");

        }
      
        return cloudVendorRepository.findById(CloudVendorId).get();
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
       
        cloudVendorRepository.save(cloudVendor);
        return "Updated Successfully";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
       
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Deleted Successfully";
    }

}