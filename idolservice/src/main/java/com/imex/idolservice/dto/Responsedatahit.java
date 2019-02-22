package com.imex.idolservice.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Responsedatahit
 */

public class Responsedatahit {

    private Value id;
    private Value reference;
    private Value title;
    private Value summary;

    @JsonSetter("autn:id")
    public void setId(Value id) {
        this.id = id;
    }
    @JsonGetter("id")
    public Value getId() {
        return id;
    }

    @JsonSetter("autn:reference")
    public void setReference(Value reference) {
        this.reference = reference;
    }
    @JsonGetter("reference")
    public Value getReference() {
        return reference;
    }   

    @JsonSetter("autn:title")
    public void setTitle(Value title) {
        this.title = title;
    }
    @JsonGetter("title")
    public Value getTitle() {
        return title;
    }

    @JsonSetter("autn:summary")
    public void setSummary(Value summary) {
        this.summary = summary;
    }
    @JsonGetter("summary")
    public Value getSummary() {
        return summary;
    }

}