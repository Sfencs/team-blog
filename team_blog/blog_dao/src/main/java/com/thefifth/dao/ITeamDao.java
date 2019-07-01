package com.thefifth.dao;

import com.thefifth.bean.Team;
import com.thefifth.bean.TeamApplication;
import com.thefifth.bean.TeamMember;

import java.util.List;

public interface ITeamDao {
    public List<Team> addTeam(Team team);  //创建团队
    public List<TeamApplication> applyTeam(TeamApplication teamApplication);  //申请入队
    public List<Team> findAllTeam(int captain_id);   //根据创建者查询所有团队  传入创建者ID，返回teams列表
    public List<TeamApplication> inviteTeam(TeamApplication teamApplication); //邀请入队
    public List<TeamMember> addTeammember(TeamMember teamMember);  //添加团队成员（标签为空）
    public List<TeamApplication> findAllApply(int team_id);  //传入团队ID，返回该团队的所有申请列表
    public List<TeamMember> findAllTeammember(int team_id);  //传入团队ID，返回该团队的所有成员列表
    public List<TeamMember> updateUserTag(TeamMember teamMember); //通过团队ID和用户ID确认用户，修改用户团队标签
    public boolean deleteAllTeammember(int team_id);  //传入团队ID，
    public boolean deleteAllTeamapplication(int team_id);  //传入团队ID，
    public boolean deleteTeam(int team_id);    //传入团队ID，
}
