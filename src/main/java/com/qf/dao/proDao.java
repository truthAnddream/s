package com.qf.dao;

import com.qf.pojo.Pro;
import lombok.Data;

import java.util.List;
public interface proDao {
    List<Pro> getAllpro();
    int del(String pid);
    int update(Pro pro);
    Pro getBypid(String pid);
}
