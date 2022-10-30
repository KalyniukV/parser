
package org.example.model.api.event;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "sport",
    "name",
    "nameDefault",
    "url",
    "weight",
    "prematch",
    "inplay",
    "outright",
    "top",
    "hasZeroMarginEvents",
    "topOrder",
    "region"
})
@Generated("jsonschema2pojo")
public class League {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("sport")
    private Sport sport;
    @JsonProperty("name")
    private String name;
    @JsonProperty("nameDefault")
    private String nameDefault;
    @JsonProperty("url")
    private String url;
    @JsonProperty("weight")
    private Integer weight;
    @JsonProperty("prematch")
    private Integer prematch;
    @JsonProperty("inplay")
    private Integer inplay;
    @JsonProperty("outright")
    private Integer outright;
    @JsonProperty("top")
    private Boolean top;
    @JsonProperty("hasZeroMarginEvents")
    private Boolean hasZeroMarginEvents;
    @JsonProperty("topOrder")
    private Integer topOrder;
    @JsonProperty("region")
    private Region region;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    public League withId(Long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("sport")
    public Sport getSport() {
        return sport;
    }

    @JsonProperty("sport")
    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public League withSport(Sport sport) {
        this.sport = sport;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public League withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("nameDefault")
    public String getNameDefault() {
        return nameDefault;
    }

    @JsonProperty("nameDefault")
    public void setNameDefault(String nameDefault) {
        this.nameDefault = nameDefault;
    }

    public League withNameDefault(String nameDefault) {
        this.nameDefault = nameDefault;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public League withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public League withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    @JsonProperty("prematch")
    public Integer getPrematch() {
        return prematch;
    }

    @JsonProperty("prematch")
    public void setPrematch(Integer prematch) {
        this.prematch = prematch;
    }

    public League withPrematch(Integer prematch) {
        this.prematch = prematch;
        return this;
    }

    @JsonProperty("inplay")
    public Integer getInplay() {
        return inplay;
    }

    @JsonProperty("inplay")
    public void setInplay(Integer inplay) {
        this.inplay = inplay;
    }

    public League withInplay(Integer inplay) {
        this.inplay = inplay;
        return this;
    }

    @JsonProperty("outright")
    public Integer getOutright() {
        return outright;
    }

    @JsonProperty("outright")
    public void setOutright(Integer outright) {
        this.outright = outright;
    }

    public League withOutright(Integer outright) {
        this.outright = outright;
        return this;
    }

    @JsonProperty("top")
    public Boolean getTop() {
        return top;
    }

    @JsonProperty("top")
    public void setTop(Boolean top) {
        this.top = top;
    }

    public League withTop(Boolean top) {
        this.top = top;
        return this;
    }

    @JsonProperty("hasZeroMarginEvents")
    public Boolean getHasZeroMarginEvents() {
        return hasZeroMarginEvents;
    }

    @JsonProperty("hasZeroMarginEvents")
    public void setHasZeroMarginEvents(Boolean hasZeroMarginEvents) {
        this.hasZeroMarginEvents = hasZeroMarginEvents;
    }

    public League withHasZeroMarginEvents(Boolean hasZeroMarginEvents) {
        this.hasZeroMarginEvents = hasZeroMarginEvents;
        return this;
    }

    @JsonProperty("topOrder")
    public Integer getTopOrder() {
        return topOrder;
    }

    @JsonProperty("topOrder")
    public void setTopOrder(Integer topOrder) {
        this.topOrder = topOrder;
    }

    public League withTopOrder(Integer topOrder) {
        this.topOrder = topOrder;
        return this;
    }

    @JsonProperty("region")
    public Region getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(Region region) {
        this.region = region;
    }

    public League withRegion(Region region) {
        this.region = region;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public League withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(League.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("sport");
        sb.append('=');
        sb.append(((this.sport == null)?"<null>":this.sport));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("nameDefault");
        sb.append('=');
        sb.append(((this.nameDefault == null)?"<null>":this.nameDefault));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("weight");
        sb.append('=');
        sb.append(((this.weight == null)?"<null>":this.weight));
        sb.append(',');
        sb.append("prematch");
        sb.append('=');
        sb.append(((this.prematch == null)?"<null>":this.prematch));
        sb.append(',');
        sb.append("inplay");
        sb.append('=');
        sb.append(((this.inplay == null)?"<null>":this.inplay));
        sb.append(',');
        sb.append("outright");
        sb.append('=');
        sb.append(((this.outright == null)?"<null>":this.outright));
        sb.append(',');
        sb.append("top");
        sb.append('=');
        sb.append(((this.top == null)?"<null>":this.top));
        sb.append(',');
        sb.append("hasZeroMarginEvents");
        sb.append('=');
        sb.append(((this.hasZeroMarginEvents == null)?"<null>":this.hasZeroMarginEvents));
        sb.append(',');
        sb.append("topOrder");
        sb.append('=');
        sb.append(((this.topOrder == null)?"<null>":this.topOrder));
        sb.append(',');
        sb.append("region");
        sb.append('=');
        sb.append(((this.region == null)?"<null>":this.region));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.nameDefault == null)? 0 :this.nameDefault.hashCode()));
        result = ((result* 31)+((this.weight == null)? 0 :this.weight.hashCode()));
        result = ((result* 31)+((this.outright == null)? 0 :this.outright.hashCode()));
        result = ((result* 31)+((this.hasZeroMarginEvents == null)? 0 :this.hasZeroMarginEvents.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.topOrder == null)? 0 :this.topOrder.hashCode()));
        result = ((result* 31)+((this.prematch == null)? 0 :this.prematch.hashCode()));
        result = ((result* 31)+((this.top == null)? 0 :this.top.hashCode()));
        result = ((result* 31)+((this.inplay == null)? 0 :this.inplay.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.region == null)? 0 :this.region.hashCode()));
        result = ((result* 31)+((this.sport == null)? 0 :this.sport.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof League) == false) {
            return false;
        }
        League rhs = ((League) other);
        return (((((((((((((((this.nameDefault == rhs.nameDefault)||((this.nameDefault!= null)&&this.nameDefault.equals(rhs.nameDefault)))&&((this.weight == rhs.weight)||((this.weight!= null)&&this.weight.equals(rhs.weight))))&&((this.outright == rhs.outright)||((this.outright!= null)&&this.outright.equals(rhs.outright))))&&((this.hasZeroMarginEvents == rhs.hasZeroMarginEvents)||((this.hasZeroMarginEvents!= null)&&this.hasZeroMarginEvents.equals(rhs.hasZeroMarginEvents))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.topOrder == rhs.topOrder)||((this.topOrder!= null)&&this.topOrder.equals(rhs.topOrder))))&&((this.prematch == rhs.prematch)||((this.prematch!= null)&&this.prematch.equals(rhs.prematch))))&&((this.top == rhs.top)||((this.top!= null)&&this.top.equals(rhs.top))))&&((this.inplay == rhs.inplay)||((this.inplay!= null)&&this.inplay.equals(rhs.inplay))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.region == rhs.region)||((this.region!= null)&&this.region.equals(rhs.region))))&&((this.sport == rhs.sport)||((this.sport!= null)&&this.sport.equals(rhs.sport))));
    }

}
