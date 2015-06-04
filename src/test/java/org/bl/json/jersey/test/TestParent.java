package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.errors.ErrorString;
import org.bl.json.jersey.model.parent.NearestNurses;
import org.bl.json.jersey.report.ReportGenerator;
import org.bl.json.jersey.rest.service.Parent;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;

/**
 * Created by blupashko on 04.06.2015.
 */
public class TestParent {
    private static final String docLink = "http://qapediaq.webprv.com/admin/apidoc";
    private static final String nearestNursesDescription = "Nearest nurses get list test ";

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + nearestNursesDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void getNearestNurses() {
        try {
            Parent service = TestVariables.getClient().proxy(Parent.class);
            NearestNurses paymentGet = service.getNearestNurses(TestVariables.getToken(),
                    TestVariables.longitude, TestVariables.latitude);
            TestVariables.reportFiller(docLink, nearestNursesDescription, paymentGet);
            JerseyClient.LOG.error(paymentGet.toString());
            Assert.assertNotNull(paymentGet);
            JerseyClient.LOG.error(paymentGet.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, nearestNursesDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, nearestNursesDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, nearestNursesDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, nearestNursesDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        } finally {
            new ReportGenerator().createHtmlReport(TestVariables.requestsToReport);
        }
    }


}
