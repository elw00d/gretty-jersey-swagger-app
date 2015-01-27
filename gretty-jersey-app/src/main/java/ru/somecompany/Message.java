package ru.somecompany;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Optional;

/**
 * @author elwood
 */
@XmlRootElement
@ApiModel
public class Message {
    private String text;

    @ApiModelProperty
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
