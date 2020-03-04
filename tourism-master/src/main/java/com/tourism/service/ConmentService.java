package com.tourism.service;

import com.tourism.entity.Conment;
import com.tourism.entity.Scenery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


public interface ConmentService {
    Conment findById(String id);

    Page<Conment> findAll( String star, Pageable pageable);

    Conment save(Conment s);

    void delete(Conment s);

    List<Conment> findBySceneryId (String sceneryId);


}
