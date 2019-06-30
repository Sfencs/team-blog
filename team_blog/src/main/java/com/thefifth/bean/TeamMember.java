package com.thefifth.bean;

public class TeamMember {
    private int id;
    private int member_id;
    private int team_id;
    private String jointime;
    private int inviter_id;
    private String tag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public String getJointime() {
        return jointime;
    }

    public void setJointime(String jointime) {
        this.jointime = jointime;
    }

    public int getInviter_id() {
        return inviter_id;
    }

    public void setInviter_id(int inviter_id) {
        this.inviter_id = inviter_id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "TeamMember{" +
                "id=" + id +
                ", member_id=" + member_id +
                ", team_id=" + team_id +
                ", jointime='" + jointime + '\'' +
                ", inviter_id=" + inviter_id +
                ", tag='" + tag + '\'' +
                '}';
    }
}
