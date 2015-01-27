package ru.somecompany;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * @author elwood
 */
@Path("base")
@Api("base")
@Consumes({MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_XML})
public class BaseResource {
    @GET
    @ApiOperation("This resource shouldn't be available neither from real API nor from swagger docs")
    public String text() {
        return "OK";
    }
}
