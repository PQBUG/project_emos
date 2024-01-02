package com.example.emos.api.db.dao;

import com.example.emos.api.db.pojo.TbAmectType;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface TbAmectTypeDao {
    public ArrayList<TbAmectType> searchAllAmectType();

    public ArrayList<HashMap> searchAmectTypeByPage(HashMap param);

    public long searchAmectTypeCount(HashMap param);

    public int insert(TbAmectType amectType);

    public HashMap searchById(int id);

    public int update(HashMap param);

    public int deleteAmectTypeByIds(Integer[] ids);
}
