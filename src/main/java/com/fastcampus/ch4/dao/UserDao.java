package com.fastcampus.ch4.dao;

import com.fastcampus.ch4.domain.*;

import java.util.List;

public interface UserDao {
    User selectUser(String id) throws Exception;
    int deleteUser(String id) throws Exception;
    int insertUser(User user) throws Exception;
    int updateUser(User user) throws Exception;
    int count() throws Exception;
    void deleteAll() throws Exception;

    List<BoardDto> searchSelectPage(SearchCondition sc) throws Exception;
    int searchResultCnt(SearchCondition sc) throws Exception;

    int searchResultCnt() throws Exception;
}