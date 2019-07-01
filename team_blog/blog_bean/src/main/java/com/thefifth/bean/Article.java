package com.thefifth.bean;

public class Article {
    private int id;
    private int author_id;
    private int team_id;
    private String title;
    private String content_html;
    private String createtime;
    private String is_delete;
    private String latest_modifytime;
    private boolean is_common;
    private boolean can_modify;
    private boolean is_draft;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent_html() {
        return content_html;
    }

    public void setContent_html(String content_html) {
        this.content_html = content_html;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(String is_delete) {
        this.is_delete = is_delete;
    }

    public String getLatest_modifytime() {
        return latest_modifytime;
    }

    public void setLatest_modifytime(String latest_modifytime) {
        this.latest_modifytime = latest_modifytime;
    }

    public boolean getIs_common() {
        return is_common;
    }

    public void setIs_common(boolean is_common) {
        this.is_common = is_common;
    }

    public boolean getCan_modify() {
        return can_modify;
    }

    public void setCan_modify(boolean can_modify) {
        this.can_modify = can_modify;
    }

    public boolean getIs_draft() {
        return is_draft;
    }

    public void setIs_draft(boolean is_draft) {
        this.is_draft = is_draft;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", author_id=" + author_id +
                ", team_id=" + team_id +
                ", title='" + title + '\'' +
                ", content_html='" + content_html + '\'' +
                ", createtime='" + createtime + '\'' +
                ", is_delete='" + is_delete + '\'' +
                ", latest_modifytime='" + latest_modifytime + '\'' +
                ", is_common=" + is_common +
                ", can_modify=" + can_modify +
                ", is_draft=" + is_draft +
                '}';
    }
}
