package com.appinfodb.mapper;

import com.appinfodb.pojo.Promotion;

import java.util.List;
import java.util.Map;

public interface PromotionMapper {

    /**
     * add
     * @param promotion
     * @return
     */
    int add(Promotion promotion);

    /**
     * delete by id
     * @param id
     * @return
     */
    int deletePromotionById(Integer id);

    /**
     * update
     * @param promotion
     * @return
     */
    int update(Promotion promotion);

    /**
     * getCount
     * @param map
     * @return
     */
    int getPromotionCount(Map<String, Object> map);

    /**
     * getObjById
     * @param id
     * @return
     */
    Promotion getPromotionById(Integer id);

    /**
     * getObjByMap
     * @param map
     * @return
     */
    Promotion getPromotionByMap(Map<String, Object> map);

    /**
     * getListByObj
     * @param promotion
     * @return
     */
    List<Promotion> getPromotionListByObj(Promotion promotion);

    /**
     * getPageByMap
     * @param map
     * @return
     */
    List<Promotion> getPromotionPageByMap(Map<String, Object> map);

}
