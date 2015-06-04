package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.errors.ErrorString;
import org.bl.json.jersey.model.payment.PaymentGet;
import org.bl.json.jersey.model.payment.Token;
import org.bl.json.jersey.rest.service.Payment;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;

/**
 * Created by blupashko on 04.06.2015.
 */
public class TestPayment {

    private static final String docLink = "http://qapediaq.webprv.com/admin/apidoc";
    private static final String paymentTokenDescription = "Payment token test ";
    private static final String paymentGetListDescription = "Payment get list test ";

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + paymentGetListDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void getPaymentList() {
        try {
            Payment service = TestVariables.getClient().proxy(Payment.class);
            PaymentGet paymentGet = service.getList(TestVariables.getToken());
            TestVariables.reportFiller(docLink, paymentGetListDescription, paymentGet);
            JerseyClient.LOG.error(paymentGet.toString());
            Assert.assertNotNull(paymentGet);
            JerseyClient.LOG.error(paymentGet.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, paymentGetListDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, paymentGetListDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, paymentGetListDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, paymentGetListDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + paymentTokenDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void getPaymentToken() {
        try {
            Payment service = TestVariables.getClient().proxy(Payment.class);
            Token token = service.token(TestVariables.getToken());
            TestVariables.reportFiller(docLink, paymentTokenDescription, token);
            JerseyClient.LOG.error(token.toString());
            Assert.assertNotNull(token);
            JerseyClient.LOG.error(token.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, paymentTokenDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, paymentTokenDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, paymentTokenDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, paymentTokenDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }
    }

}
