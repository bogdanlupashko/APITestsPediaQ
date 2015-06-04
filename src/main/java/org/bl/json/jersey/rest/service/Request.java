package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

/**
 * Created by blupashko on 04.06.2015.
 */
@Path(JerseyClient.API_PREAMBLE + "request/")
public interface Request {

    @POST
    @Path("get-patient-history")
    @Produces(MediaType.APPLICATION_JSON)
    org.bl.json.jersey.model.request.Request getPatientHistory(@FormParam("token") String token,
                                                               @FormParam("limit") int limit,
                                                               @FormParam("offset") int offset) throws WebApplicationException;


}
