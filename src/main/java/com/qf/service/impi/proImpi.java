package com.qf.service.impi;



import com.qf.dao.proDao;
import com.qf.pojo.Pro;
import com.qf.service.ProSerin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class proImpi implements ProSerin {
    @Autowired
    private proDao p;
    @Override
    public List<Pro> getAllpro() {
        return p.getAllpro();
    }

    @Override
    public Integer del(String pid) {
        return p.del(pid);
    }

    @Override
    public int update(Pro pro) {
        return p.update(pro);
    }

    @Override
    public Pro getBypid(String pid) {
        return p.getBypid(pid);
    }
}
