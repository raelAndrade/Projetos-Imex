package com.imex.idolservice.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Responsedata
 */
public class Responsedata {

    private Value numhits;
    private List<Responsedatahit> hits;

    @JsonGetter("numhits")
    public Value getNumhits() {
        return numhits;
    }

    @JsonSetter("autn:numhits")
    public void setNumhits(Value numhits) {
        this.numhits = numhits;
    }


    @JsonSetter("autn:hit")
    public void setHits(List<Responsedatahit> hits) {
        this.hits = hits;
    }

    @JsonGetter("hits")
    public List<Responsedatahit> getHits() {
        return hits;
    }

}