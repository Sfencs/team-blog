package com.thefifth.bean;

public class Comment {
    private int id;
    private int parent_id;
    private int reviewer_id;
    private String content;
    private boolean is_delete;
    private String createtime;
    private int article_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public int getReviewer_id() {
        return reviewer_id;
    }

    public void setReviewer_id(int reviewer_id) {
        this.reviewer_id = reviewer_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isIs_delete() {
        return is_delete;
    }

    public void setIs_delete(boolean is_delete) {
        this.is_delete = is_delete;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", parent_id=" + parent_id +
                ", reviewer_id=" + reviewer_id +
                ", content='" + content + '\'' +
                ", is_delete=" + is_delete +
                ", createtime='" + createtime + '\'' +
                ", article_id=" + article_id +
                '}';
    }
}
