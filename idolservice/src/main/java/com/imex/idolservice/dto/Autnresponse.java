package com.imex.idolservice.dto;

import lombok.Data;

/**
 * Auntresponse
 */

@Data
public class Autnresponse {

    private Value action;
    private Value response;
    private Responsedata responsedata;

}