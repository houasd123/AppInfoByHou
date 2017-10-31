package com.appinfodb.service.impl;

import com.appinfodb.mapper.PromotionMapper;
import com.appinfodb.pojo.Promotion;
import com.appinfodb.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("promotionService")
public class PromotionServiceImpl implements PromotionService{

    @Autowired(required = false)
    private PromotionMapper promotionMapper;

    public PromotionMapper getPromotionMapper() {
        return promotionMapper;
    }

    public void setPromotionMapper(PromotionMapper promotionMapper) {
        this.promotionMapper = promotionMapper;
    }

    @Override
    public int add(Promotion promotion) {
        return promotionMapper.add(promotion);
    }

    @Override
    public int deletePromotionById(Integer id) {
        return promotionMapper.deletePromotionById(id);
    }

    @Override
    public int update(Promotion promotion) {
        return promotionMapper.update(promotion);
    }

    @Override
    public int getPromotionCount(Map<String, Object> map) {
        return promotionMapper.getPromotionCount(map);
    }

    @Override
    public Promotion getPromotionById(Integer id) {
        return promotionMapper.getPromotionById(id);
    }

    @Override
    public List<Promotion> getPromotionListByObj(Promotion promotion) {
        return promotionMapper.getPromotionListByObj(promotion);
    }

    @Override
    public List<Promotion> getPromotionPageByMap(Map<String, Object> map) {
        return promotionMapper.getPromotionPageByMap(map);
    }

    @Override
    public Promotion getPromotionByMap(Map<String, Object> map) {
        return promotionMapper.getPromotionByMap(map);
    }
}
