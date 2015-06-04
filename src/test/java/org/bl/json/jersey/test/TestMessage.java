package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.errors.ErrorString;
import org.bl.json.jersey.model.massage.Count;
import org.bl.json.jersey.rest.service.Message;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;

/**
 * Created by blupashko on 04.06.2015.
 */
public class TestMessage {
    private static final String docLink = "http://qapediaq.webprv.com/admin/apidoc";
    private static final String MessageCountDescription = "Message count get test ";

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + MessageCountDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void getCount() {
        try {
            Message service = TestVariables.getClient().proxy(Message.class);
            Count count = service.count(TestVariables.getToken());
            TestVariables.reportFiller(docLink, MessageCountDescription, count);
            JerseyClient.LOG.error(count.toString());
            Assert.assertNotNull(count);
            JerseyClient.LOG.error(count.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, MessageCountDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, MessageCountDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, MessageCountDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, MessageCountDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }
    }

}
