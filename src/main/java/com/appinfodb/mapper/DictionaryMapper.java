package com.appinfodb.mapper;

import com.appinfodb.pojo.Dictionary;

import java.util.List;
import java.util.Map;

public interface DictionaryMapper {

    /**
     * add
     * @param dictionary
     * @return
     */
    int add(Dictionary dictionary);

    /**
     * delete by id
     * @param id
     * @return
     */
    int deleteDictionaryById(Integer id);

    /**
     * update
     * @param dictionary
     * @return
     */
    int update(Dictionary dictionary);

    /**
     * getCount
     * @param map
     * @return
     */
    int getDictionaryCount(Map<String, Object> map);

    /**
     * getObjById
     * @param id
     * @return
     */
    Dictionary getDictionaryById(Integer id);

    /**
     * getObjByMap
     * @param map
     * @return
     */
    Dictionary getDictionaryByMap(Map<String, Object> map);

    /**
     * getListByObj
     * @param dictionary
     * @return
     */
    List<Dictionary> getDictionaryListByObj(Dictionary dictionary);

    /**
     * getPageByMap
     * @param map
     * @return
     */
    List<Dictionary> getDictionaryPageByMap(Map<String, Object> map);

}
