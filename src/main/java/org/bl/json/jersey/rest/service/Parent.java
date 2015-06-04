package org.bl.json.jersey.rest.service;

import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.massage.Count;
import org.bl.json.jersey.model.parent.NearestNurses;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

/**
 * Created by blupashko on 04.06.2015.
 */

@Path(JerseyClient.API_PREAMBLE + "parent/")
public interface Parent {

    @POST
    @Path("get-nearest-nurses")
    @Produces(MediaType.APPLICATION_JSON)
    NearestNurses getNearestNurses(@FormParam("token") String token,
                                   @FormParam("longitude") String longitude,
                                   @FormParam("latitude") String latitude) throws WebApplicationException;

}
