package com.thefifth.dao;


import com.thefifth.bean.Comment;

import java.util.List;

public interface ICommentDao {
    //评论、查看评论 、显示收藏

    //1.添加评论
    // 参数：comment 返回值类型：Boolean:true==添加成功
    public Boolean addComment(Comment comment);

    //2.查看文章的所有评论
    public List<Comment> checkComment(int article_id);

    //3.查看对于某一条评论的回复
    //参数：文章的id,该评论的id
    public List<Comment> checkCommentReply(int article_id, int parent_id);

    //3.删除评论
    //参数：评论的id
    public Boolean deleteComment(int comment_id);

}
