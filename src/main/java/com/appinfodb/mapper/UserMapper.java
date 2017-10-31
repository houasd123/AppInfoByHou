package com.appinfodb.mapper;

import com.appinfodb.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     * add
     * @param user
     * @return
     */
    int add(User user);

    /**
     * delete by id
     * @param id
     * @return
     */
    int deleteUserById(Integer id);

    /**
     * update
     * @param user
     * @return
     */
    int update(User user);

    /**
     * getCount
     * @param map
     * @return
     */
    int getUserCount(Map<String, Object> map);

    /**
     * getObjById
     * @param id
     * @return
     */
    User getUserById(Integer id);

    /**
     * getObjByMap
     * @param map
     * @return
     */
    User getUserByMap(Map<String, Object> map);

    /**
     * getListByObj
     * @param user
     * @return
     */
    List<User> getUserListByObj(User user);

    /**
     * getPageByMap
     * @param map
     * @return
     */
    List<User> getUserPageByMap(Map<String, Object> map);
}
