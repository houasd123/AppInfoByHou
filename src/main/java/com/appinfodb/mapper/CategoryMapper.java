package com.appinfodb.mapper;

import com.appinfodb.pojo.Category;

import java.util.List;
import java.util.Map;

public interface CategoryMapper {

    /**
     * add
     * @param category
     * @return
     */
    int add(Category category);

    /**
     * delete by id
     * @param id
     * @return
     */
    int deleteCategoryById(Integer id);

    /**
     * update
     * @param category
     * @return
     */
    int update(Category category);

    /**
     * getCount
     * @param map
     * @return
     */
    int getCategoryCount(Map<String, Object> map);

    /**
     * getObjById
     * @param id
     * @return
     */
    Category getCategoryById(Integer id);

    /**
     * getObjByMap
     * @param map
     * @return
     */
    Category getCategoryByMap(Map<String, Object> map);

    /**
     * getListByObj
     * @param category
     * @return
     */
    List<Category> getCategoryListByObj(Category category);

    /**
     * getPageByMap
     * @param map
     * @return
     */
    List<Category> getCategoryPageByMap(Map<String, Object> map);

}
