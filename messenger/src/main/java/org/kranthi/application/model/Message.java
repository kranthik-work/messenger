package org.kranthi.application.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;
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
 ** Created by Kranthi Kiran Kalletla on 4/22/2017.
 ** File Name: Message
 **
 ** Purpose: 
 **
 *************************************************************************/

@XmlRootElement
public class Message {

    private long id;
    private String message;
    private String author;
    private Date date;
    private Map<Long,Comment> comments;

    public Message(){

    }

    public Message(long id, String message, String author, Map<Long, Comment> comments) {
        this.id = id;
        this.message = message;
        this.author = author;
        this.comments = comments;
        this.date = new Date();
    }

    public Message(long id, String message, String author){
        this.id = id;
        this.message = message;
        this.author = author;
        this.date = new Date();
        comments = new HashMap<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @XmlTransient
    public Map<Long, Comment> getComments() {
        return comments;
    }

    public void setComments(Map<Long, Comment> comments) {
        this.comments = comments;
    }
}
