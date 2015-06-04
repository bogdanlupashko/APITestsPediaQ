package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.payment.PaymentGet;
import org.bl.json.jersey.model.payment.Token;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by blupashko on 04.06.2015.
 */
@Path(JerseyClient.API_PREAMBLE + "payment/")

public interface Payment {
    @POST
    @Path("get")
    @Produces(MediaType.APPLICATION_JSON)
    Token token(@FormParam("token") String token) throws WebApplicationException;

    @POST
    @Path("get-list")
    @Produces(MediaType.APPLICATION_JSON)
    PaymentGet getList(@FormParam("token") String token) throws WebApplicationException;

}
