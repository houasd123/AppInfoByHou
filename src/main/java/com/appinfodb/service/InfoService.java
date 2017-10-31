package com.appinfodb.service;

import com.appinfodb.pojo.Info;

import java.util.List;
import java.util.Map;

public interface InfoService {

    /**
     * add
     * @param info
     * @return
     */
    int add(Info info);

    /**
     * delete by id
     * @param id
     * @return
     */
    int deleteInfoById(Integer id);

    /**
     * update
     * @param info
     * @return
     */
    int update(Info info);

    /**
     * getCount
     * @param map
     * @return
     */
    int getInfoCount(Map<String, Object> map);

    /**
     * getObjById
     * @param id
     * @return
     */
    Info getInfoById(Integer id);

    /**
     * getObjByMap
     * @param map
     * @return
     */
    Info getInfoByMap(Map<String, Object> map);

    /**
     * getListByObj
     * @return
     */
    List<Info> getInfoListByObj(Info info);

    /**
     * getPageByMap
     * @param map
     * @return
     */
    List<Info> getInfoPageByMap(Map<String, Object> map);

}
