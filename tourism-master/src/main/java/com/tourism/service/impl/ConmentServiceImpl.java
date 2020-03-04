package com.tourism.service.impl;

import com.tourism.dao.ConmentDao;
import com.tourism.entity.Conment;
import com.tourism.service.ConmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service("conmentService")
public class ConmentServiceImpl implements ConmentService {
    @Autowired
    ConmentDao conmentDao;
    @Override
    public Conment findById(String id) {
        return conmentDao.findById(id);
    }

    @Override
    public Page<Conment> findAll(String star, Pageable pageable) {
        return null;
    }

    @Override
    public Conment save(Conment s) {
        s.setId(UUID.randomUUID().toString()); //获取UUID并转化为String对象
        s.setUpdateDate(new Date());
        return conmentDao.save(s);
    }

    @Override
    public void delete(Conment s) {

    }

    @Override
    public List<Conment> findBySceneryId(String sceneryId) {
        return conmentDao.findBySceneryId(sceneryId);
    }
}
