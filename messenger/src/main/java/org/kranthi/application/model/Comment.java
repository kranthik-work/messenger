package org.kranthi.application.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

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
 ** File Name: Comment
 **
 ** Purpose: 
 **
 *************************************************************************/
@XmlRootElement
public class Comment {

    private long id;
    private String comment;
    private Date created;
    private String author;

    public Comment() {

    }

    public Comment(long id, String comment, String author) {
        this.id = id;
        this.comment = comment;
        this.created = new Date();
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
