package ru.somecompany.rest2;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import ru.somecompany.Message;

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
@Path("message2")
@Api("message2")
@Consumes({MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_XML})
public class MessageResource {
    @GET
    @ApiOperation("Messages from /rest2")
    public List<Message> getAllMessages() {
        List<Message> messages = new ArrayList<Message>();
        Message msg = new Message();
        msg.setText("Some msg");
        messages.add(msg);
        return messages;
    }
}
