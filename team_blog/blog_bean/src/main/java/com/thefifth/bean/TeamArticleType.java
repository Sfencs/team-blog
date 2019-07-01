package com.thefifth.bean;

public class TeamArticleType {
    private int id;
    private String type;
    private int team_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    @Override
    public String toString() {
        return "TeamArticleType{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", team_id=" + team_id +
                '}';
    }
}
