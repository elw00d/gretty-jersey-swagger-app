package ru.somecompany.rest1;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import ru.somecompany.Message;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * @author elwood
 */
@Path("message1")
@Api("message1")
@Consumes({MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_XML})
public class MessageResource {
    @GET
    @ApiOperation("Messages from /rest1")
    public List<Message> getAllMessages() {
        List<Message> messages = new ArrayList<Message>();
        Message msg = new Message();
        msg.setText("Some msg");
        messages.add(msg);
        return messages;
    }
}
