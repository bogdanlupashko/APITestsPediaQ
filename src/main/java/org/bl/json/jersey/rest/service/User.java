package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.user.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by blupashko on 04.06.2015.
 */

@Path(JerseyClient.API_PREAMBLE + "user/")
public interface User {
    @POST
    @Path("getprofile")
    @Produces(MediaType.APPLICATION_JSON)
    Profile getProfile(@FormParam("token") String token) throws WebApplicationException;

    @POST
    @Path("self-status")
    @Produces(MediaType.APPLICATION_JSON)
    Status selfStatus(@FormParam("token") String token) throws WebApplicationException;

    @POST
    @Path("getraces")
    @Produces(MediaType.APPLICATION_JSON)
    Races getRaces(@FormParam("token") String token) throws WebApplicationException;

    @POST
    @Path("family")
    @Produces(MediaType.APPLICATION_JSON)
    Family family(@FormParam("token") String token) throws WebApplicationException;

    @POST
    @Path("getlanguages")
    @Produces(MediaType.APPLICATION_JSON)
    Languages languages(@FormParam("token") String token) throws WebApplicationException;



}
