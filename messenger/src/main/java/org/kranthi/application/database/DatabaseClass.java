package org.kranthi.application.database;

import org.kranthi.application.model.Message;
import org.kranthi.application.model.Profile;

import java.util.HashMap;
import java.util.Map;

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
 ** File Name: DatabaseClass
 **
 ** Purpose: 
 **
 *************************************************************************/
public class DatabaseClass {

    private static Map<Long,Message> messages = new HashMap<>();
    private static Map<String, Profile> profiles = new HashMap<>();

    public static Map<Long,Message> getMessages(){
        return messages;
    }

    public static Map<String,Profile> getProfiles(){
        return profiles;
    }

    public static void convertString(){
        for(Message msg: messages.values()){
            System.out.println("Message: "+msg.getId()+" Comment Count: "+msg.getComments().size());
        }
    }
}
