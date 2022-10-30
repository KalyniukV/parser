
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
    "id",
    "name",
    "nameDefault",
    "competitors",
    "kickoff",
    "lastUpdated",
    "league",
    "betline",
    "open",
    "status",
    "native",
    "widgetType",
    "widgetVirtual",
    "url",
    "matchPhase",
    "hasMarketWithZeroMargin",
    "markets",
    "runnersCount"
})
@Generated("jsonschema2pojo")
public class Event {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("nameDefault")
    private String nameDefault;
    @JsonProperty("competitors")
    private List<Competitor> competitors = new ArrayList<Competitor>();
    @JsonProperty("kickoff")
    private Long kickoff;
    @JsonProperty("lastUpdated")
    private Long lastUpdated;
    @JsonProperty("league")
    private LeagueInfo league;
    @JsonProperty("betline")
    private String betline;
    @JsonProperty("open")
    private Boolean open;
    @JsonProperty("status")
    private String status;
    @JsonProperty("native")
    private Boolean _native;
    @JsonProperty("widgetType")
    private String widgetType;
    @JsonProperty("widgetVirtual")
    private Boolean widgetVirtual;
    @JsonProperty("url")
    private String url;
    @JsonProperty("matchPhase")
    private String matchPhase;
    @JsonProperty("hasMarketWithZeroMargin")
    private Boolean hasMarketWithZeroMargin;
    @JsonProperty("markets")
    private List<Market> markets = new ArrayList<Market>();
    @JsonProperty("runnersCount")
    private Integer runnersCount;
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

    public Event withId(Long id) {
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

    public Event withName(String name) {
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

    public Event withNameDefault(String nameDefault) {
        this.nameDefault = nameDefault;
        return this;
    }

    @JsonProperty("competitors")
    public List<Competitor> getCompetitors() {
        return competitors;
    }

    @JsonProperty("competitors")
    public void setCompetitors(List<Competitor> competitors) {
        this.competitors = competitors;
    }

    public Event withCompetitors(List<Competitor> competitors) {
        this.competitors = competitors;
        return this;
    }

    @JsonProperty("kickoff")
    public Long getKickoff() {
        return kickoff;
    }

    @JsonProperty("kickoff")
    public void setKickoff(Long kickoff) {
        this.kickoff = kickoff;
    }

    public Event withKickoff(Long kickoff) {
        this.kickoff = kickoff;
        return this;
    }

    @JsonProperty("lastUpdated")
    public Long getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("lastUpdated")
    public void setLastUpdated(Long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Event withLastUpdated(Long lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    @JsonProperty("league")
    public LeagueInfo getLeague() {
        return league;
    }

    @JsonProperty("league")
    public void setLeague(LeagueInfo league) {
        this.league = league;
    }

    public Event withLeague(LeagueInfo league) {
        this.league = league;
        return this;
    }

    @JsonProperty("betline")
    public String getBetline() {
        return betline;
    }

    @JsonProperty("betline")
    public void setBetline(String betline) {
        this.betline = betline;
    }

    public Event withBetline(String betline) {
        this.betline = betline;
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

    public Event withOpen(Boolean open) {
        this.open = open;
        return this;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Event withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("native")
    public Boolean getNative() {
        return _native;
    }

    @JsonProperty("native")
    public void setNative(Boolean _native) {
        this._native = _native;
    }

    public Event withNative(Boolean _native) {
        this._native = _native;
        return this;
    }

    @JsonProperty("widgetType")
    public String getWidgetType() {
        return widgetType;
    }

    @JsonProperty("widgetType")
    public void setWidgetType(String widgetType) {
        this.widgetType = widgetType;
    }

    public Event withWidgetType(String widgetType) {
        this.widgetType = widgetType;
        return this;
    }

    @JsonProperty("widgetVirtual")
    public Boolean getWidgetVirtual() {
        return widgetVirtual;
    }

    @JsonProperty("widgetVirtual")
    public void setWidgetVirtual(Boolean widgetVirtual) {
        this.widgetVirtual = widgetVirtual;
    }

    public Event withWidgetVirtual(Boolean widgetVirtual) {
        this.widgetVirtual = widgetVirtual;
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

    public Event withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("matchPhase")
    public String getMatchPhase() {
        return matchPhase;
    }

    @JsonProperty("matchPhase")
    public void setMatchPhase(String matchPhase) {
        this.matchPhase = matchPhase;
    }

    public Event withMatchPhase(String matchPhase) {
        this.matchPhase = matchPhase;
        return this;
    }

    @JsonProperty("hasMarketWithZeroMargin")
    public Boolean getHasMarketWithZeroMargin() {
        return hasMarketWithZeroMargin;
    }

    @JsonProperty("hasMarketWithZeroMargin")
    public void setHasMarketWithZeroMargin(Boolean hasMarketWithZeroMargin) {
        this.hasMarketWithZeroMargin = hasMarketWithZeroMargin;
    }

    public Event withHasMarketWithZeroMargin(Boolean hasMarketWithZeroMargin) {
        this.hasMarketWithZeroMargin = hasMarketWithZeroMargin;
        return this;
    }

    @JsonProperty("markets")
    public List<Market> getMarkets() {
        return markets;
    }

    @JsonProperty("markets")
    public void setMarkets(List<Market> markets) {
        this.markets = markets;
    }

    public Event withMarkets(List<Market> markets) {
        this.markets = markets;
        return this;
    }

    @JsonProperty("runnersCount")
    public Integer getRunnersCount() {
        return runnersCount;
    }

    @JsonProperty("runnersCount")
    public void setRunnersCount(Integer runnersCount) {
        this.runnersCount = runnersCount;
    }

    public Event withRunnersCount(Integer runnersCount) {
        this.runnersCount = runnersCount;
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

    public Event withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Event.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("nameDefault");
        sb.append('=');
        sb.append(((this.nameDefault == null)?"<null>":this.nameDefault));
        sb.append(',');
        sb.append("competitors");
        sb.append('=');
        sb.append(((this.competitors == null)?"<null>":this.competitors));
        sb.append(',');
        sb.append("kickoff");
        sb.append('=');
        sb.append(((this.kickoff == null)?"<null>":this.kickoff));
        sb.append(',');
        sb.append("lastUpdated");
        sb.append('=');
        sb.append(((this.lastUpdated == null)?"<null>":this.lastUpdated));
        sb.append(',');
        sb.append("league");
        sb.append('=');
        sb.append(((this.league == null)?"<null>":this.league));
        sb.append(',');
        sb.append("betline");
        sb.append('=');
        sb.append(((this.betline == null)?"<null>":this.betline));
        sb.append(',');
        sb.append("open");
        sb.append('=');
        sb.append(((this.open == null)?"<null>":this.open));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("_native");
        sb.append('=');
        sb.append(((this._native == null)?"<null>":this._native));
        sb.append(',');
        sb.append("widgetType");
        sb.append('=');
        sb.append(((this.widgetType == null)?"<null>":this.widgetType));
        sb.append(',');
        sb.append("widgetVirtual");
        sb.append('=');
        sb.append(((this.widgetVirtual == null)?"<null>":this.widgetVirtual));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("matchPhase");
        sb.append('=');
        sb.append(((this.matchPhase == null)?"<null>":this.matchPhase));
        sb.append(',');
        sb.append("hasMarketWithZeroMargin");
        sb.append('=');
        sb.append(((this.hasMarketWithZeroMargin == null)?"<null>":this.hasMarketWithZeroMargin));
        sb.append(',');
        sb.append("markets");
        sb.append('=');
        sb.append(((this.markets == null)?"<null>":this.markets));
        sb.append(',');
        sb.append("runnersCount");
        sb.append('=');
        sb.append(((this.runnersCount == null)?"<null>":this.runnersCount));
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
        result = ((result* 31)+((this.matchPhase == null)? 0 :this.matchPhase.hashCode()));
        result = ((result* 31)+((this.kickoff == null)? 0 :this.kickoff.hashCode()));
        result = ((result* 31)+((this._native == null)? 0 :this._native.hashCode()));
        result = ((result* 31)+((this.league == null)? 0 :this.league.hashCode()));
        result = ((result* 31)+((this.hasMarketWithZeroMargin == null)? 0 :this.hasMarketWithZeroMargin.hashCode()));
        result = ((result* 31)+((this.nameDefault == null)? 0 :this.nameDefault.hashCode()));
        result = ((result* 31)+((this.widgetType == null)? 0 :this.widgetType.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.lastUpdated == null)? 0 :this.lastUpdated.hashCode()));
        result = ((result* 31)+((this.competitors == null)? 0 :this.competitors.hashCode()));
        result = ((result* 31)+((this.markets == null)? 0 :this.markets.hashCode()));
        result = ((result* 31)+((this.betline == null)? 0 :this.betline.hashCode()));
        result = ((result* 31)+((this.widgetVirtual == null)? 0 :this.widgetVirtual.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.runnersCount == null)? 0 :this.runnersCount.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.open == null)? 0 :this.open.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Event) == false) {
            return false;
        }
        Event rhs = ((Event) other);
        return ((((((((((((((((((((this.matchPhase == rhs.matchPhase)||((this.matchPhase!= null)&&this.matchPhase.equals(rhs.matchPhase)))&&((this.kickoff == rhs.kickoff)||((this.kickoff!= null)&&this.kickoff.equals(rhs.kickoff))))&&((this._native == rhs._native)||((this._native!= null)&&this._native.equals(rhs._native))))&&((this.league == rhs.league)||((this.league!= null)&&this.league.equals(rhs.league))))&&((this.hasMarketWithZeroMargin == rhs.hasMarketWithZeroMargin)||((this.hasMarketWithZeroMargin!= null)&&this.hasMarketWithZeroMargin.equals(rhs.hasMarketWithZeroMargin))))&&((this.nameDefault == rhs.nameDefault)||((this.nameDefault!= null)&&this.nameDefault.equals(rhs.nameDefault))))&&((this.widgetType == rhs.widgetType)||((this.widgetType!= null)&&this.widgetType.equals(rhs.widgetType))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.lastUpdated == rhs.lastUpdated)||((this.lastUpdated!= null)&&this.lastUpdated.equals(rhs.lastUpdated))))&&((this.competitors == rhs.competitors)||((this.competitors!= null)&&this.competitors.equals(rhs.competitors))))&&((this.markets == rhs.markets)||((this.markets!= null)&&this.markets.equals(rhs.markets))))&&((this.betline == rhs.betline)||((this.betline!= null)&&this.betline.equals(rhs.betline))))&&((this.widgetVirtual == rhs.widgetVirtual)||((this.widgetVirtual!= null)&&this.widgetVirtual.equals(rhs.widgetVirtual))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.runnersCount == rhs.runnersCount)||((this.runnersCount!= null)&&this.runnersCount.equals(rhs.runnersCount))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.open == rhs.open)||((this.open!= null)&&this.open.equals(rhs.open))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
