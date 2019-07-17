package org.kranthi.application.exception;

/*************************************************************************
 **
 ** Kranthi Kiran Kalletla
 **
 ** NOTICE:  All information contained herein is, and remains the property of
 ** Kranthi Kiran Kalletla. Dissemination of this information or reproduction 
 ** of this material is strictly forbidden unless prior written permission is 
 ** obtained from Kranthi Kiran Kalletla.
 **
 **
 ** © 2017 Kranthi Kiran Kalletla
 ** All Rights Reserved. 
 **
 ** Created by Kranthi Kiran Kalletla on 4/24/2017.
 ** File Name: DataNotFoundException
 **
 ** Purpose: 
 **
 *************************************************************************/
public class DataNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -75627288373843774L;
    
    public DataNotFoundException(String message) {
        super(message);
    }
}
