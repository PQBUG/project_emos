package com.example.emos.api.service;

import com.example.emos.api.common.util.PageUtils;
import com.example.emos.api.db.pojo.TbAmectType;

import java.util.ArrayList;
import java.util.HashMap;

public interface AmectTypeService {
    public ArrayList<TbAmectType> searchAllAmectType();

    public PageUtils searchAmectTypeByPage(HashMap param);

    public int insert(TbAmectType amectType);

    public HashMap searchById(int id);

    public int update(HashMap param);

    public int deleteAmectTypeByIds(Integer[] ids);
}
