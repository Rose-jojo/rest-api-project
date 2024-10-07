package com.sampleProject.sample.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.cj.protocol.Message;
import com.sampleProject.sample.model.CloudVendor;
import com.sampleProject.sample.response.ResponseHandler;
import com.sampleProject.sample.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController{

    CloudVendorService cloudVendorService;

public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }


//Read specific cloud Vendor details from DB
@GetMapping ("{VendorId}")   
public ResponseEntity<Object> getCloudVendorApiDetails(@PathVariable("VendorId") String VendorId){

return ResponseHandler.responseBuider("Requested vendor details are given here", HttpStatus.OK ,cloudVendorService.getCloudVendor(VendorId));

}

//Read all cloud vendor details from DB
@GetMapping   
public List<CloudVendor> getAllCloudVendorApiDetails(){

 return cloudVendorService.getAllCloudVendors();
}

@PostMapping
public String createCloudVendorApiDetails(@RequestBody CloudVendor cloudvendor){

   cloudVendorService.createCloudVendor(cloudvendor);
    return "Cloud vendor created successully!";


}

@PutMapping
public String updateCloudVendorApiDetails(@RequestBody CloudVendor cloudvendor){

    cloudVendorService.updateCloudVendor(cloudvendor);
    return "Cloud vendor updated successully!";


}

@DeleteMapping("{vendorId}")
public String deleteCloudVendorApiDetails(@PathVariable("vendorId") String vendorId){

    cloudVendorService.deleteCloudVendor(vendorId);
    return "Cloud vendor deleted successully!";


}


}