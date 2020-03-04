package com.tourism.dao;

import com.tourism.entity.Conment;
import com.tourism.entity.Scenery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface ConmentDao extends PagingAndSortingRepository<Conment, Long>, JpaSpecificationExecutor<Conment>, JpaRepository<Conment,Long> {
    @Query("from Conment s where s.id = ?1")
    Conment findById(String id);
    @Query("from Conment s where s.sceneryId=?1")
    List<Conment> findBySceneryId(String sceneryId);

}
