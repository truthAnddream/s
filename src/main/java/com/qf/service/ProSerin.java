package com.qf.service;

import com.qf.pojo.Pro;

import java.util.List;

public interface ProSerin {
    List<Pro> getAllpro();
    Integer del(String pid);
    int update(Pro pro);
    Pro getBypid(String pid);
}
