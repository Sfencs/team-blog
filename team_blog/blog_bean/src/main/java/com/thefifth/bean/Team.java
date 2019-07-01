package com.thefifth.bean;

public class Team {
    private int id;
    private String teamname;
    private String createtime;
    private String profile;
    private int captain_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public int getCaptain_id() {
        return captain_id;
    }

    public void setCaptain_id(int captain_id) {
        this.captain_id = captain_id;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", teamname='" + teamname + '\'' +
                ", createtime='" + createtime + '\'' +
                ", profile='" + profile + '\'' +
                ", captain_id=" + captain_id +
                '}';
    }
}
