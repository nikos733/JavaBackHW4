package Ivin.HW;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "cuisine",
        "cuisines",
        "confidence"
})

@Data
public class ResponseCuisine {

    @JsonProperty("cuisine")
    private String cuisine;
    @JsonProperty("cuisines")
    private List<String> cuisines = null;
    @JsonProperty("confidence")
    private Double confidence;
}
