package com.appinfodb.service.impl;

import com.appinfodb.mapper.DictionaryMapper;
import com.appinfodb.pojo.Dictionary;
import com.appinfodb.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("dictionaryService")
public class DictionaryServiceImpl implements DictionaryService{

    @Autowired(required = false)
    private DictionaryMapper dictionaryMapper;

    public DictionaryMapper getDictionaryMapper() {
        return dictionaryMapper;
    }

    public void setDictionaryMapper(DictionaryMapper dictionaryMapper) {
        this.dictionaryMapper = dictionaryMapper;
    }

    @Override
    public int add(Dictionary dictionary) {
        return dictionaryMapper.add(dictionary);
    }

    @Override
    public int deleteDictionaryById(Integer id) {
        return dictionaryMapper.deleteDictionaryById(id);
    }

    @Override
    public int update(Dictionary dictionary) {
        return dictionaryMapper.update(dictionary);
    }

    @Override
    public int getDictionaryCount(Map<String, Object> map) {
        return dictionaryMapper.getDictionaryCount(map);
    }

    @Override
    public Dictionary getDictionaryById(Integer id) {
        return dictionaryMapper.getDictionaryById(id);
    }

    @Override
    public List<Dictionary> getDictionaryListByObj(Dictionary dictionary) {
        return dictionaryMapper.getDictionaryListByObj(dictionary);
    }

    @Override
    public List<Dictionary> getDictionaryPageByMap(Map<String, Object> map) {
        return dictionaryMapper.getDictionaryPageByMap(map);
    }

    @Override
    public Dictionary getDictionaryByMap(Map<String, Object> map) {
        return dictionaryMapper.getDictionaryByMap(map);
    }
}
