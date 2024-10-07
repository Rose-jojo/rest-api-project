package com.sampleProject.sample.exception;

public class CloudVendorNotFoundException extends RuntimeException {

    public CloudVendorNotFoundException(String arg0) {
        super(arg0);
    }

    public CloudVendorNotFoundException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }
    
}
