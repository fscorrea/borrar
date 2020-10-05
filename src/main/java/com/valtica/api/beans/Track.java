
package com.valtica.api.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Sencillo de un cantante
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Title",
    "Singer"
})
public class Track {

    /**
     * Titulo del sencillo
     * (Required)
     * 
     */
    @JsonProperty("Title")
    @JsonPropertyDescription("Titulo del sencillo")
    private String title;
    /**
     * Cantante
     * (Required)
     * 
     */
    @JsonProperty("Singer")
    @JsonPropertyDescription("Cantante")
    private String singer;

    /**
     * Titulo del sencillo
     * (Required)
     * 
     */
    @JsonProperty("Title")
    public String getTitle() {
        return title;
    }

    /**
     * Titulo del sencillo
     * (Required)
     * 
     */
    @JsonProperty("Title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Cantante
     * (Required)
     * 
     */
    @JsonProperty("Singer")
    public String getSinger() {
        return singer;
    }

    /**
     * Cantante
     * (Required)
     * 
     */
    @JsonProperty("Singer")
    public void setSinger(String singer) {
        this.singer = singer;
    }

}
