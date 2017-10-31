package com.appinfodb.service.impl;

import com.appinfodb.mapper.InfoMapper;
import com.appinfodb.pojo.Info;
import com.appinfodb.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service("infoService")
public class InfoServiceImpl implements InfoService{
    @Autowired(required = false)
    private InfoMapper infoMapper;

    public InfoMapper getInfoMapper() {
        return infoMapper;
    }

    public void setInfoMapper(InfoMapper infoMapper) {
        this.infoMapper = infoMapper;
    }

    @Override
    public int add(Info info) {
        return infoMapper.add(info);
    }

    @Override
    public int deleteInfoById(Integer id) {
        return infoMapper.deleteInfoById(id);
    }

    @Override
    public int update(Info info) {
        return infoMapper.update(info);
    }

    @Override
    public int getInfoCount(Map<String, Object> map) {
        return infoMapper.getInfoCount(map);
    }

    @Override
    public Info getInfoById(Integer id) {
        return infoMapper.getInfoById(id);
    }

    @Override
    public List<Info> getInfoListByObj(Info info) {
        return infoMapper.getInfoListByObj(info);
    }

    @Override
    public List<Info> getInfoPageByMap(Map<String, Object> map) {
        return infoMapper.getInfoPageByMap(map);
    }

    @Override
    public Info getInfoByMap(Map<String, Object> map) {
        return infoMapper.getInfoByMap(map);
    }
}
