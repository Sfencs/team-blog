package com.thefifth.dao;

import com.thefifth.bean.Article;
import com.thefifth.bean.BackendManager;
import com.thefifth.bean.Team;
import com.thefifth.bean.UserInfo;

import java.util.List;

public interface IBackendManagerDao {

    /**
     *
     * @return
     */
    public List<BackendManager> findAllByBm();

    /**
     *
     * @param backendManager
     * @return
     */
    public BackendManager login(BackendManager backendManager);

    /**
     *
     * @param id
     * @return
     */
    public  boolean deleteBackendManager(int id);

    /**
     *
     * @return
     */
    public  List<UserInfo> findAllByUi();

    /**
     *
     * @return
     */
    public  List<Team> findAllByTeam();

    /**
     *
     * @return
     */
    public  List<Article> findAllByArticle();




}
