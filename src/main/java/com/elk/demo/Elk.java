package com.elk.demo;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.jboss.logging.Logger;

@Path("/gelf-logging")
@ApplicationScoped
public class Elk {
    private static final Logger LOG = Logger.getLogger(Elk.class);

    @GET
    public void log() {
        LOG.info("Some useful log message");
        LOG.error("Error occured");
    }

}