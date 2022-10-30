
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
    "marketTypeId",
    "open",
    "hasZeroMargin",
    "primary",
    "cols",
    "runners",
    "selectionTypes",
    "handicap"
})
@Generated("jsonschema2pojo")
public class Market {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("marketTypeId")
    private Long marketTypeId;
    @JsonProperty("open")
    private Boolean open;
    @JsonProperty("hasZeroMargin")
    private Boolean hasZeroMargin;
    @JsonProperty("primary")
    private Boolean primary;
    @JsonProperty("cols")
    private Integer cols;
    @JsonProperty("runners")
    private List<Runner> runners = new ArrayList<Runner>();
    @JsonProperty("selectionTypes")
    private List<String> selectionTypes = new ArrayList<String>();
    @JsonProperty("handicap")
    private String handicap;
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

    public Market withId(Long id) {
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

    public Market withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("marketTypeId")
    public Long getMarketTypeId() {
        return marketTypeId;
    }

    @JsonProperty("marketTypeId")
    public void setMarketTypeId(Long marketTypeId) {
        this.marketTypeId = marketTypeId;
    }

    public Market withMarketTypeId(Long marketTypeId) {
        this.marketTypeId = marketTypeId;
        return this;
    }

    @JsonProperty("open")
    public Boolean getOpen() {
        return open;
    }

    @JsonProperty("open")
    public void setOpen(Boolean open) {
        this.open = open;
    }

    public Market withOpen(Boolean open) {
        this.open = open;
        return this;
    }

    @JsonProperty("hasZeroMargin")
    public Boolean getHasZeroMargin() {
        return hasZeroMargin;
    }

    @JsonProperty("hasZeroMargin")
    public void setHasZeroMargin(Boolean hasZeroMargin) {
        this.hasZeroMargin = hasZeroMargin;
    }

    public Market withHasZeroMargin(Boolean hasZeroMargin) {
        this.hasZeroMargin = hasZeroMargin;
        return this;
    }

    @JsonProperty("primary")
    public Boolean getPrimary() {
        return primary;
    }

    @JsonProperty("primary")
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    public Market withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    @JsonProperty("cols")
    public Integer getCols() {
        return cols;
    }

    @JsonProperty("cols")
    public void setCols(Integer cols) {
        this.cols = cols;
    }

    public Market withCols(Integer cols) {
        this.cols = cols;
        return this;
    }

    @JsonProperty("runners")
    public List<Runner> getRunners() {
        return runners;
    }

    @JsonProperty("runners")
    public void setRunners(List<Runner> runners) {
        this.runners = runners;
    }

    public Market withRunners(List<Runner> runners) {
        this.runners = runners;
        return this;
    }

    @JsonProperty("selectionTypes")
    public List<String> getSelectionTypes() {
        return selectionTypes;
    }

    @JsonProperty("selectionTypes")
    public void setSelectionTypes(List<String> selectionTypes) {
        this.selectionTypes = selectionTypes;
    }

    public Market withSelectionTypes(List<String> selectionTypes) {
        this.selectionTypes = selectionTypes;
        return this;
    }

    @JsonProperty("handicap")
    public String getHandicap() {
        return handicap;
    }

    @JsonProperty("handicap")
    public void setHandicap(String handicap) {
        this.handicap = handicap;
    }

    public Market withHandicap(String handicap) {
        this.handicap = handicap;
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

    public Market withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Market.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("marketTypeId");
        sb.append('=');
        sb.append(((this.marketTypeId == null)?"<null>":this.marketTypeId));
        sb.append(',');
        sb.append("open");
        sb.append('=');
        sb.append(((this.open == null)?"<null>":this.open));
        sb.append(',');
        sb.append("hasZeroMargin");
        sb.append('=');
        sb.append(((this.hasZeroMargin == null)?"<null>":this.hasZeroMargin));
        sb.append(',');
        sb.append("primary");
        sb.append('=');
        sb.append(((this.primary == null)?"<null>":this.primary));
        sb.append(',');
        sb.append("cols");
        sb.append('=');
        sb.append(((this.cols == null)?"<null>":this.cols));
        sb.append(',');
        sb.append("runners");
        sb.append('=');
        sb.append(((this.runners == null)?"<null>":this.runners));
        sb.append(',');
        sb.append("selectionTypes");
        sb.append('=');
        sb.append(((this.selectionTypes == null)?"<null>":this.selectionTypes));
        sb.append(',');
        sb.append("handicap");
        sb.append('=');
        sb.append(((this.handicap == null)?"<null>":this.handicap));
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
        result = ((result* 31)+((this.hasZeroMargin == null)? 0 :this.hasZeroMargin.hashCode()));
        result = ((result* 31)+((this.handicap == null)? 0 :this.handicap.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.selectionTypes == null)? 0 :this.selectionTypes.hashCode()));
        result = ((result* 31)+((this.marketTypeId == null)? 0 :this.marketTypeId.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.runners == null)? 0 :this.runners.hashCode()));
        result = ((result* 31)+((this.cols == null)? 0 :this.cols.hashCode()));
        result = ((result* 31)+((this.open == null)? 0 :this.open.hashCode()));
        result = ((result* 31)+((this.primary == null)? 0 :this.primary.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Market) == false) {
            return false;
        }
        Market rhs = ((Market) other);
        return ((((((((((((this.hasZeroMargin == rhs.hasZeroMargin)||((this.hasZeroMargin!= null)&&this.hasZeroMargin.equals(rhs.hasZeroMargin)))&&((this.handicap == rhs.handicap)||((this.handicap!= null)&&this.handicap.equals(rhs.handicap))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.selectionTypes == rhs.selectionTypes)||((this.selectionTypes!= null)&&this.selectionTypes.equals(rhs.selectionTypes))))&&((this.marketTypeId == rhs.marketTypeId)||((this.marketTypeId!= null)&&this.marketTypeId.equals(rhs.marketTypeId))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.runners == rhs.runners)||((this.runners!= null)&&this.runners.equals(rhs.runners))))&&((this.cols == rhs.cols)||((this.cols!= null)&&this.cols.equals(rhs.cols))))&&((this.open == rhs.open)||((this.open!= null)&&this.open.equals(rhs.open))))&&((this.primary == rhs.primary)||((this.primary!= null)&&this.primary.equals(rhs.primary))));
    }

}
