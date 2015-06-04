package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.errors.ErrorString;
import org.bl.json.jersey.rest.service.Request;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;

/**
 * Created by blupashko on 04.06.2015.
 */
public class TestRequest {

    private static final String docLink = "http://qapediaq.webprv.com/admin/apidoc";

    private static final String patientHistoryDescription = "Patient history test ";


    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + patientHistoryDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void getPatientHistory() {
        try {
            Request service = TestVariables.getClient().proxy(Request.class);
            org.bl.json.jersey.model.request.Request request = service.getPatientHistory(TestVariables.getToken(), TestVariables.limit, TestVariables.offset);
            TestVariables.reportFiller(docLink, patientHistoryDescription, request);
            JerseyClient.LOG.error(request.toString());
            Assert.assertNotNull(request);
            JerseyClient.LOG.error(request.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, patientHistoryDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, patientHistoryDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, patientHistoryDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, patientHistoryDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }
    }
}
