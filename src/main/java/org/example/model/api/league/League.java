
package org.example.model.api.league;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
    "enabled",
    "betline",
    "totalCount",
    "vtag",
    "events"
})
@Generated("jsonschema2pojo")
public class League {

    @JsonProperty("enabled")
    private Boolean enabled;
    @JsonProperty("betline")
    private Object betline;
    @JsonProperty("totalCount")
    private Integer totalCount;
    @JsonProperty("vtag")
    private String vtag;
    @JsonProperty("events")
    private List<Event> events = new ArrayList<Event>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public League withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @JsonProperty("betline")
    public Object getBetline() {
        return betline;
    }

    @JsonProperty("betline")
    public void setBetline(Object betline) {
        this.betline = betline;
    }

    public League withBetline(Object betline) {
        this.betline = betline;
        return this;
    }

    @JsonProperty("totalCount")
    public Integer getTotalCount() {
        return totalCount;
    }

    @JsonProperty("totalCount")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public League withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    @JsonProperty("vtag")
    public String getVtag() {
        return vtag;
    }

    @JsonProperty("vtag")
    public void setVtag(String vtag) {
        this.vtag = vtag;
    }

    public League withVtag(String vtag) {
        this.vtag = vtag;
        return this;
    }

    @JsonProperty("events")
    public List<Event> getEvents() {
        return events;
    }

    @JsonProperty("events")
    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public League withEvents(List<Event> events) {
        this.events = events;
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
        sb.append("enabled");
        sb.append('=');
        sb.append(((this.enabled == null)?"<null>":this.enabled));
        sb.append(',');
        sb.append("betline");
        sb.append('=');
        sb.append(((this.betline == null)?"<null>":this.betline));
        sb.append(',');
        sb.append("totalCount");
        sb.append('=');
        sb.append(((this.totalCount == null)?"<null>":this.totalCount));
        sb.append(',');
        sb.append("vtag");
        sb.append('=');
        sb.append(((this.vtag == null)?"<null>":this.vtag));
        sb.append(',');
        sb.append("events");
        sb.append('=');
        sb.append(((this.events == null)?"<null>":this.events));
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
        result = ((result* 31)+((this.vtag == null)? 0 :this.vtag.hashCode()));
        result = ((result* 31)+((this.betline == null)? 0 :this.betline.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.totalCount == null)? 0 :this.totalCount.hashCode()));
        result = ((result* 31)+((this.enabled == null)? 0 :this.enabled.hashCode()));
        result = ((result* 31)+((this.events == null)? 0 :this.events.hashCode()));
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
        return (((((((this.vtag == rhs.vtag)||((this.vtag!= null)&&this.vtag.equals(rhs.vtag)))&&((this.betline == rhs.betline)||((this.betline!= null)&&this.betline.equals(rhs.betline))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.totalCount == rhs.totalCount)||((this.totalCount!= null)&&this.totalCount.equals(rhs.totalCount))))&&((this.enabled == rhs.enabled)||((this.enabled!= null)&&this.enabled.equals(rhs.enabled))))&&((this.events == rhs.events)||((this.events!= null)&&this.events.equals(rhs.events))));
    }

}
