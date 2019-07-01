package com.thefifth.bean;

public class ArticleType {
    private int id;
    private int article_id;
    private int type_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    @Override
    public String toString() {
        return "ArticleType{" +
                "id=" + id +
                ", article_id=" + article_id +
                ", type_id=" + type_id +
                '}';
    }
}
