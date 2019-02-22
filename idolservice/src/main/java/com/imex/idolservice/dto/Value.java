package com.imex.idolservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Value - This class is related to the value of the object, for example $:
 * "QUERY"
 */

public class Value {

    private String value;

    @JsonProperty("$")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}