package com.thefifth.dao;

import com.thefifth.bean.ArticleType;
import com.thefifth.bean.TeamArticleType;

public interface IArticleTypeDao {

    //队长设置文章分类标签
    public boolean addArticleType(TeamArticleType teamArticleType);

    //队长删除文章标签
    public boolean deleteArticleType(int id);

    //定义文章类型
    public boolean setArticleType(ArticleType articleType);

}
