package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.tariff.TariffGet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by blupashko on 04.06.2015.
 */

@Path(JerseyClient.API_PREAMBLE + "tariff/")
public interface Tariff {

    @POST
    @Path("get")
    @Produces(MediaType.APPLICATION_JSON)
    TariffGet get(@FormParam("token") String token) throws WebApplicationException;

}
