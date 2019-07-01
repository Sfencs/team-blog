package com.thefifth.dao;

import com.thefifth.bean.Article;

import java.util.List;

public interface IArticleDao {

    //发布博客
    public boolean addArticle(Article article);

    //查询博客相关信息
    public List<Article> findArticleInfo(Article article);

    //更改博客
    public boolean updateArticle(Article article);

    //删除博客
    public boolean deleteArticle(int id);

    public Article findOne(int id);
}
