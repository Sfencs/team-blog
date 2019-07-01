package com.thefifth.bean;

public class TeamApplication {
    private int id;
    private int team_id;
    private int user_id;
    private int inviter_id;
    private String applicationtime;
    private String reason;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getInviter_id() {
        return inviter_id;
    }

    public void setInviter_id(int inviter_id) {
        this.inviter_id = inviter_id;
    }

    public String getApplicationtime() {
        return applicationtime;
    }

    public void setApplicationtime(String applicationtime) {
        this.applicationtime = applicationtime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "TeamApplication{" +
                "id=" + id +
                ", team_id=" + team_id +
                ", user_id=" + user_id +
                ", inviter_id=" + inviter_id +
                ", applicationtime='" + applicationtime + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
