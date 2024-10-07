package com.sampleProject.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sampleProject.sample.model.CloudVendor;


public interface CloudVendorRepository extends JpaRepository<CloudVendor, String>{


}