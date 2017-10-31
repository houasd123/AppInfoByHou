package com.appinfodb.service.impl;

import com.appinfodb.mapper.VersionMapper;
import com.appinfodb.pojo.Version;
import com.appinfodb.service.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("versionService")
public class VersionServiceImpl implements VersionService {

    @Autowired(required = false)
    private VersionMapper versionMapper;

    public VersionMapper getVersionMapper() {
        return versionMapper;
    }

    public void setVersionMapper(VersionMapper versionMapper) {
        this.versionMapper = versionMapper;
    }

    @Override
    public int add(Version version) {
        return versionMapper.add(version);
    }

    @Override
    public int deleteVersionById(Integer id) {
        return versionMapper.deleteVersionById(id);
    }

    @Override
    public int update(Version version) {
        return versionMapper.update(version);
    }

    @Override
    public int getVersionCount(Map<String, Object> map) {
        return versionMapper.getVersionCount(map);
    }

    @Override
    public Version getVersionById(Integer id) {
        return versionMapper.getVersionById(id);
    }

    @Override
    public List<Version> getVersionListByObj(Version version) {
        return versionMapper.getVersionListByObj(version);
    }

    @Override
    public List<Version> getVersionPageByMap(Map<String, Object> map) {
        return versionMapper.getVersionPageByMap(map);
    }

    @Override
    public Version getVersionByMap(Map<String, Object> map) {
        return versionMapper.getVersionByMap(map);
    }}