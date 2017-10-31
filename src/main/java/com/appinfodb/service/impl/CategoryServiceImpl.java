package com.appinfodb.service.impl;

import com.appinfodb.mapper.CategoryMapper;
import com.appinfodb.pojo.Category;
import com.appinfodb.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService{

    @Autowired(required = false)
    private CategoryMapper categoryMapper;

    public CategoryMapper getCategoryMapper() {
        return categoryMapper;
    }

    public void setCategoryMapper(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    @Override
    public int add(Category category) {
        return categoryMapper.add(category);
    }

    @Override
    public int deleteCategoryById(Integer id) {
        return categoryMapper.deleteCategoryById(id);
    }

    @Override
    public int update(Category category) {
        return categoryMapper.update(category);
    }

    @Override
    public int getCategoryCount(Map<String, Object> map) {
        return categoryMapper.getCategoryCount(map);
    }

    @Override
    public Category getCategoryById(Integer id) {
        return categoryMapper.getCategoryById(id);
    }

    @Override
    public List<Category> getCategoryListByObj(Category category) {
        return categoryMapper.getCategoryListByObj(category);
    }

    @Override
    public List<Category> getCategoryPageByMap(Map<String, Object> map) {
        return categoryMapper.getCategoryPageByMap(map);
    }

    @Override
    public Category getCategoryByMap(Map<String, Object> map) {
        return categoryMapper.getCategoryByMap(map);
    }
}
