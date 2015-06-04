package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.errors.ErrorString;
import org.bl.json.jersey.model.tariff.TariffGet;
import org.bl.json.jersey.model.user.Profile;
import org.bl.json.jersey.rest.service.Tariff;
import org.bl.json.jersey.rest.service.User;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;

/**
 * Created by blupashko on 04.06.2015.
 */
public class TestTariff {

    private static final String docLink = "http://qapediaq.webprv.com/admin/apidoc";

    private static final String tariffDescription = "Users races test ";


    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + tariffDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void getTariff() {
        try {
            Tariff service = TestVariables.getClient().proxy(Tariff.class);
            TariffGet tariffGet = service.get(TestVariables.getToken());
            TestVariables.reportFiller(docLink, tariffDescription, tariffGet);
            JerseyClient.LOG.error(tariffGet.toString());
            Assert.assertNotNull(tariffGet);
            JerseyClient.LOG.error(tariffGet.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, tariffDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, tariffDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, tariffDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, tariffDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }
    }


}
