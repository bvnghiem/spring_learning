package com.nghiem.messenger.message;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("messages")
public class MessageResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessages() {
        return "These are all messages";
    }
}
