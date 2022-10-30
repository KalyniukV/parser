
package org.example.model.api.event;

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
    "id",
    "name",
    "marketTypeIds",
    "virtual"
})
@Generated("jsonschema2pojo")
public class MarketGroup {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("marketTypeIds")
    private List<Long> marketTypeIds = new ArrayList<Long>();
    @JsonProperty("virtual")
    private Boolean virtual;
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

    public MarketGroup withId(Long id) {
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

    public MarketGroup withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("marketTypeIds")
    public List<Long> getMarketTypeIds() {
        return marketTypeIds;
    }

    @JsonProperty("marketTypeIds")
    public void setMarketTypeIds(List<Long> marketTypeIds) {
        this.marketTypeIds = marketTypeIds;
    }

    public MarketGroup withMarketTypeIds(List<Long> marketTypeIds) {
        this.marketTypeIds = marketTypeIds;
        return this;
    }

    @JsonProperty("virtual")
    public Boolean getVirtual() {
        return virtual;
    }

    @JsonProperty("virtual")
    public void setVirtual(Boolean virtual) {
        this.virtual = virtual;
    }

    public MarketGroup withVirtual(Boolean virtual) {
        this.virtual = virtual;
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

    public MarketGroup withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MarketGroup.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("marketTypeIds");
        sb.append('=');
        sb.append(((this.marketTypeIds == null)?"<null>":this.marketTypeIds));
        sb.append(',');
        sb.append("virtual");
        sb.append('=');
        sb.append(((this.virtual == null)?"<null>":this.virtual));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.marketTypeIds == null)? 0 :this.marketTypeIds.hashCode()));
        result = ((result* 31)+((this.virtual == null)? 0 :this.virtual.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MarketGroup) == false) {
            return false;
        }
        MarketGroup rhs = ((MarketGroup) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.marketTypeIds == rhs.marketTypeIds)||((this.marketTypeIds!= null)&&this.marketTypeIds.equals(rhs.marketTypeIds))))&&((this.virtual == rhs.virtual)||((this.virtual!= null)&&this.virtual.equals(rhs.virtual))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
