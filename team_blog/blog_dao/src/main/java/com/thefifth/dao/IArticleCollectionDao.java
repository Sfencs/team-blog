package com.thefifth.dao;

import com.thefifth.bean.ArticleCollection;

public interface IArticleCollectionDao {
    //实现对文章的收藏
    //1.收藏某一文章
    //参数：articleCollection
    public Boolean toCollecArticle(ArticleCollection articleCollection);

    //2.显示某人收藏的所有文章
    //参数:userinfo.id 返回值：ArticleCollection
    public ArticleCollection hasCollectArticles(int user_id);


}
