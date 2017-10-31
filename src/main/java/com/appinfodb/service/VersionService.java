package com.appinfodb.service;

import com.appinfodb.pojo.Version;

import java.util.List;
import java.util.Map;

public interface VersionService {


    /**
     * add
     * @param version
     * @return
     */
    int add(Version version);

    /**
     * delete by id
     * @param id
     * @return
     */
    int deleteVersionById(Integer id);

    /**
     * update
     * @param version
     * @return
     */
    int update(Version version);

    /**
     * getCount
     * @param map
     * @return
     */
    int getVersionCount(Map<String, Object> map);

    /**
     * getObjById
     * @param id
     * @return
     */
    Version getVersionById(Integer id);

    /**
     * getObjByMap
     * @param map
     * @return
     */
    Version getVersionByMap(Map<String, Object> map);

    /**
     * getListByObj
     * @return
     */
    List<Version> getVersionListByObj(Version version);

    /**
     * getPageByMap
     * @param map
     * @return
     */
    List<Version> getVersionPageByMap(Map<String, Object> map);
}
