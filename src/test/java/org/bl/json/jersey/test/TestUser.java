package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.errors.ErrorString;
import org.bl.json.jersey.model.user.*;
import org.bl.json.jersey.rest.service.User;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;

/**
 * Created by blupashko on 04.06.2015.
 */
public class TestUser {

    private static final String docLink = "http://qapediaq.webprv.com/admin/apidoc";
    private static final String userProfileDescription = "User profile test ";
    private static final String userStatusDescription = "User status test ";
    private static final String userRacesDescription = "Users races test ";
    private static final String userFamilyDescription = "Users family test ";
    private static final String userLanguagesDescription = "Users languages test ";

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + userProfileDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void getProfile() {
        try {
            User service = TestVariables.getClient().proxy(User.class);
            Profile profile = service.getProfile(TestVariables.getToken());
            TestVariables.reportFiller(docLink, userProfileDescription, profile);
            JerseyClient.LOG.error(profile.toString());
            Assert.assertNotNull(profile);
            JerseyClient.LOG.error(profile.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, userProfileDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, userProfileDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, userProfileDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, userProfileDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + userStatusDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void selfStatus() {
        try {
            User service = TestVariables.getClient().proxy(User.class);
            Status status = service.selfStatus(TestVariables.getToken());
            TestVariables.reportFiller(docLink, userStatusDescription, status);
            JerseyClient.LOG.error(status.toString());
            Assert.assertNotNull(status);
            JerseyClient.LOG.error(status.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, userStatusDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, userStatusDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, userStatusDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, userStatusDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }
    }
    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + userRacesDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void getRaces() {
        try {
            User service = TestVariables.getClient().proxy(User.class);
            Races races = service.getRaces(TestVariables.getToken());
            TestVariables.reportFiller(docLink, userRacesDescription, races);
            JerseyClient.LOG.error(races.toString());
            Assert.assertNotNull(races);
            JerseyClient.LOG.error(races.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, userRacesDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, userRacesDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, userRacesDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, userRacesDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + userFamilyDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void family() {
        try {
            User service = TestVariables.getClient().proxy(User.class);
            Family family = service.family(TestVariables.getToken());
            TestVariables.reportFiller(docLink, userFamilyDescription, family);
            JerseyClient.LOG.error(family.toString());
            Assert.assertNotNull(family);
            JerseyClient.LOG.error(family.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, userFamilyDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, userFamilyDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, userFamilyDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, userFamilyDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }
    }
    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + userLanguagesDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void languages() {
        try {
            User service = TestVariables.getClient().proxy(User.class);
            Languages languages = service.languages(TestVariables.getToken());
            TestVariables.reportFiller(docLink, userLanguagesDescription, languages);
            JerseyClient.LOG.error(languages.toString());
            Assert.assertNotNull(languages);
            JerseyClient.LOG.error(languages.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, userLanguagesDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, userLanguagesDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, userLanguagesDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, userLanguagesDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }
    }

}
