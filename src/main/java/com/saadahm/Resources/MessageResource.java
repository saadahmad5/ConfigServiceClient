package com.saadahm.Resources;

import com.saadahm.Models.Message;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/")
public class MessageResource {

    @ConfigProperty(name = "message", defaultValue = "Value is NOT coming from Config Service")
    String message;

    @GET
    @Path("/getMessage")
    @Produces(MediaType.APPLICATION_JSON)
    public Message getMessage() {
        return new Message(message);
    }
}
