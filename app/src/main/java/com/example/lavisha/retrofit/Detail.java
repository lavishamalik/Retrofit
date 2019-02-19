package com.example.lavisha.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Detail {

    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("platform")
    @Expose
    private String platform;
    @SerializedName("tournament_date")
    @Expose
    private String tournamentDate;
    @SerializedName("prize_money")
    @Expose
    private String prizeMoney;
    @SerializedName("prize_coins")
    @Expose
    private Integer prizeCoins;
    @SerializedName("fee")
    @Expose
    private String fee;
    @SerializedName("coin_registration")
    @Expose
    private Boolean coinRegistration;
    @SerializedName("coins_needed")
    @Expose
    private String coinsNeeded;
    @SerializedName("game_type")
    @Expose
    private String gameType;
    @SerializedName("bracket_or_pool")
    @Expose
    private String bracketOrPool;
    @SerializedName("tournament_type")
    @Expose
    private String tournamentType;
    @SerializedName("no_of_participants")
    @Expose
    private String noOfParticipants;
    @SerializedName("max_participants")
    @Expose
    private Integer maxParticipants;
    @SerializedName("bracket_size")
    @Expose
    private String bracketSize;
    @SerializedName("team_size")
    @Expose
    private String teamSize;
    @SerializedName("half_length")
    @Expose
    private String halfLength;
    @SerializedName("tournament_venue")
    @Expose
    private String tournamentVenue;
    @SerializedName("match_type")
    @Expose
    private String matchType;
    @SerializedName("tournament_start_time")
    @Expose
    private String tournamentStartTime;
    @SerializedName("check_in_time")
    @Expose
    private String checkInTime;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getTournamentDate() {
        return tournamentDate;
    }

    public void setTournamentDate(String tournamentDate) {
        this.tournamentDate = tournamentDate;
    }

    public String getPrizeMoney() {
        return prizeMoney;
    }

    public void setPrizeMoney(String prizeMoney) {
        this.prizeMoney = prizeMoney;
    }

    public Integer getPrizeCoins() {
        return prizeCoins;
    }

    public void setPrizeCoins(Integer prizeCoins) {
        this.prizeCoins = prizeCoins;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public Boolean getCoinRegistration() {
        return coinRegistration;
    }

    public void setCoinRegistration(Boolean coinRegistration) {
        this.coinRegistration = coinRegistration;
    }

    public String getCoinsNeeded() {
        return coinsNeeded;
    }

    public void setCoinsNeeded(String coinsNeeded) {
        this.coinsNeeded = coinsNeeded;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getBracketOrPool() {
        return bracketOrPool;
    }

    public void setBracketOrPool(String bracketOrPool) {
        this.bracketOrPool = bracketOrPool;
    }

    public String getTournamentType() {
        return tournamentType;
    }

    public void setTournamentType(String tournamentType) {
        this.tournamentType = tournamentType;
    }

    public String getNoOfParticipants() {
        return noOfParticipants;
    }

    public void setNoOfParticipants(String noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }

    public Integer getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(Integer maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    public String getBracketSize() {
        return bracketSize;
    }

    public void setBracketSize(String bracketSize) {
        this.bracketSize = bracketSize;
    }

    public String getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(String teamSize) {
        this.teamSize = teamSize;
    }

    public String getHalfLength() {
        return halfLength;
    }

    public void setHalfLength(String halfLength) {
        this.halfLength = halfLength;
    }

    public String getTournamentVenue() {
        return tournamentVenue;
    }

    public void setTournamentVenue(String tournamentVenue) {
        this.tournamentVenue = tournamentVenue;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public String getTournamentStartTime() {
        return tournamentStartTime;
    }

    public void setTournamentStartTime(String tournamentStartTime) {
        this.tournamentStartTime = tournamentStartTime;
    }

    public String getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
    }


}
