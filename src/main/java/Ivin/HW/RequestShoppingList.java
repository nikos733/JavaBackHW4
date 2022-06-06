package Ivin.HW;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "item",
        "aisle",
        "parse"
})

@Data
public class RequestShoppingList {

    @JsonProperty("item")
    private String item;
    @JsonProperty("aisle")
    private String aisle;
    @JsonProperty("parse")
    private Boolean parse;
}