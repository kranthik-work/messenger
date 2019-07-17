package org.kranthi.application.resources;

import org.kranthi.application.model.Comment;
import org.kranthi.application.service.CommentService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

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
 ** File Name: CommentResource
 **
 ** Purpose: 
 **
 *************************************************************************/
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CommentResource {

    CommentService commentService = new CommentService();

    @GET
    public List<Comment> getComment(@PathParam("messageID")long messageID){
        return commentService.getAllComments(messageID);
    }

    @GET
    @Path("/{commentID}")
    public Comment getComment(@PathParam("messageID")long messageID,
                              @PathParam("commentID") long commentID){
        return commentService.getComment(messageID,commentID);
    }

    @POST
    public Comment addComment(@PathParam("messageID")long messageID, Comment comment){
        return commentService.addComment(messageID,comment);
    }

    @PUT
    @Path("/{commentID}")
    public Comment updateComment(@PathParam("messageID")long messageID,
                                 @PathParam("commentID") long commentID,
                                 Comment  comment){
        return commentService.updateComment(messageID,commentID,comment);
    }

    @DELETE
    @Path("/{commentID}")
    public void deleteComment(@PathParam("messageID")long messageID,
                              @PathParam("commentID") long commentID){
        commentService.deleteComment(messageID,commentID);
    }
}
