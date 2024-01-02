package com.example.emos.api.service.impl;

import com.example.emos.api.common.util.PageUtils;
import com.example.emos.api.db.dao.TbAmectTypeDao;
import com.example.emos.api.db.pojo.TbAmectType;
import com.example.emos.api.service.AmectTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class AmectTypeServiceImpl implements AmectTypeService {
    @Autowired
    private TbAmectTypeDao amectTypeDao;

    @Override
    public ArrayList<TbAmectType> searchAllAmectType() {
        ArrayList<TbAmectType> list = amectTypeDao.searchAllAmectType();
        return list;
    }

    @Override
    public PageUtils searchAmectTypeByPage(HashMap param) {
        ArrayList<HashMap> list = amectTypeDao.searchAmectTypeByPage(param);

        long count = amectTypeDao.searchAmectTypeCount(param);
        int start = (Integer) param.get("start");
        int length = (Integer) param.get("length");
        PageUtils pageUtils = new PageUtils(list, count, start, length);
        return pageUtils;
    }

    @Override
    public int insert(TbAmectType amectType) {
        int rows = amectTypeDao.insert(amectType);
        return rows;
    }

    @Override
    public HashMap searchById(int id) {
        HashMap map = amectTypeDao.searchById(id);
        return map;
    }

    @Override
    public int update(HashMap param) {
        int rows = amectTypeDao.update(param);
        return rows;
    }

    @Override
    public int deleteAmectTypeByIds(Integer[] ids) {
        int rows = amectTypeDao.deleteAmectTypeByIds(ids);
        return rows;
    }
}
