
package org.example.model.api.league;

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
    "name",
    "homeAway",
    "logoSource",
    "logo"
})
@Generated("jsonschema2pojo")
public class Competitor {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("homeAway")
    private String homeAway;
    @JsonProperty("logoSource")
    private String logoSource;
    @JsonProperty("logo")
    private String logo;
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

    public Competitor withId(Long id) {
        this.id = id;
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

    public Competitor withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("homeAway")
    public String getHomeAway() {
        return homeAway;
    }

    @JsonProperty("homeAway")
    public void setHomeAway(String homeAway) {
        this.homeAway = homeAway;
    }

    public Competitor withHomeAway(String homeAway) {
        this.homeAway = homeAway;
        return this;
    }

    @JsonProperty("logoSource")
    public String getLogoSource() {
        return logoSource;
    }

    @JsonProperty("logoSource")
    public void setLogoSource(String logoSource) {
        this.logoSource = logoSource;
    }

    public Competitor withLogoSource(String logoSource) {
        this.logoSource = logoSource;
        return this;
    }

    @JsonProperty("logo")
    public String getLogo() {
        return logo;
    }

    @JsonProperty("logo")
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Competitor withLogo(String logo) {
        this.logo = logo;
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

    public Competitor withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Competitor.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("homeAway");
        sb.append('=');
        sb.append(((this.homeAway == null)?"<null>":this.homeAway));
        sb.append(',');
        sb.append("logoSource");
        sb.append('=');
        sb.append(((this.logoSource == null)?"<null>":this.logoSource));
        sb.append(',');
        sb.append("logo");
        sb.append('=');
        sb.append(((this.logo == null)?"<null>":this.logo));
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
        result = ((result* 31)+((this.homeAway == null)? 0 :this.homeAway.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.logo == null)? 0 :this.logo.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.logoSource == null)? 0 :this.logoSource.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Competitor) == false) {
            return false;
        }
        Competitor rhs = ((Competitor) other);
        return (((((((this.homeAway == rhs.homeAway)||((this.homeAway!= null)&&this.homeAway.equals(rhs.homeAway)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.logo == rhs.logo)||((this.logo!= null)&&this.logo.equals(rhs.logo))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.logoSource == rhs.logoSource)||((this.logoSource!= null)&&this.logoSource.equals(rhs.logoSource))));
    }

}
