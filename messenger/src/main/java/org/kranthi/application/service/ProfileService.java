package org.kranthi.application.service;

import org.kranthi.application.database.DatabaseClass;
import org.kranthi.application.model.Profile;

import java.util.ArrayList;
import java.util.List;
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
 ** File Name: ProfileService
 **
 ** Purpose: 
 **
 *************************************************************************/
public class ProfileService {

    private Map<String,Profile> profiles = DatabaseClass.getProfiles();

    public ProfileService(){
        profiles.put("Kranthi",new Profile(1L, "Kranthi", "Kranthi Kiran", "Kalletla"));
        profiles.put("Me", new Profile(2L, "AgainMe","Me","Again"));
    }
    public List<Profile> getProfiles(){
        return new ArrayList<Profile>(profiles.values());
    }

    public Profile getProfile(String profileName){
        System.out.println("In getProfile with "+profileName);
        return profiles.get(profileName);
    }

    public Profile addProfile(Profile profile){
        profile.setId(profiles.size() + 1);
        profiles.put(profile.getProfileName(),profile);
        return profile;
    }

    public Profile updateProfile(Profile profile){
        if(profile.getProfileName().isEmpty())
            return null;
        profiles.put(profile.getProfileName(),profile);
        return profile;
    }

    public Profile removeProfile(String profileName){
        return profiles.remove(profileName);
    }
}
