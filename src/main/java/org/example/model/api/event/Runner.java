
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
    "open",
    "r",
    "c",
    "tags",
    "price",
    "priceStr",
    "handicap"
})
@Generated("jsonschema2pojo")
public class Runner {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("open")
    private Boolean open;
    @JsonProperty("r")
    private Integer r;
    @JsonProperty("c")
    private Integer c;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonProperty("price")
    private Double price;
    @JsonProperty("priceStr")
    private String priceStr;
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

    public Runner withId(Long id) {
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

    public Runner withName(String name) {
        this.name = name;
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

    public Runner withOpen(Boolean open) {
        this.open = open;
        return this;
    }

    @JsonProperty("r")
    public Integer getR() {
        return r;
    }

    @JsonProperty("r")
    public void setR(Integer r) {
        this.r = r;
    }

    public Runner withR(Integer r) {
        this.r = r;
        return this;
    }

    @JsonProperty("c")
    public Integer getC() {
        return c;
    }

    @JsonProperty("c")
    public void setC(Integer c) {
        this.c = c;
    }

    public Runner withC(Integer c) {
        this.c = c;
        return this;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Runner withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    public Runner withPrice(Double price) {
        this.price = price;
        return this;
    }

    @JsonProperty("priceStr")
    public String getPriceStr() {
        return priceStr;
    }

    @JsonProperty("priceStr")
    public void setPriceStr(String priceStr) {
        this.priceStr = priceStr;
    }

    public Runner withPriceStr(String priceStr) {
        this.priceStr = priceStr;
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

    public Runner withHandicap(String handicap) {
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

    public Runner withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Runner.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("open");
        sb.append('=');
        sb.append(((this.open == null)?"<null>":this.open));
        sb.append(',');
        sb.append("r");
        sb.append('=');
        sb.append(((this.r == null)?"<null>":this.r));
        sb.append(',');
        sb.append("c");
        sb.append('=');
        sb.append(((this.c == null)?"<null>":this.c));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("priceStr");
        sb.append('=');
        sb.append(((this.priceStr == null)?"<null>":this.priceStr));
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
        result = ((result* 31)+((this.priceStr == null)? 0 :this.priceStr.hashCode()));
        result = ((result* 31)+((this.r == null)? 0 :this.r.hashCode()));
        result = ((result* 31)+((this.c == null)? 0 :this.c.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.handicap == null)? 0 :this.handicap.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.open == null)? 0 :this.open.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Runner) == false) {
            return false;
        }
        Runner rhs = ((Runner) other);
        return (((((((((((this.priceStr == rhs.priceStr)||((this.priceStr!= null)&&this.priceStr.equals(rhs.priceStr)))&&((this.r == rhs.r)||((this.r!= null)&&this.r.equals(rhs.r))))&&((this.c == rhs.c)||((this.c!= null)&&this.c.equals(rhs.c))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.handicap == rhs.handicap)||((this.handicap!= null)&&this.handicap.equals(rhs.handicap))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.open == rhs.open)||((this.open!= null)&&this.open.equals(rhs.open))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }

}
