package com.enigma.dev.repository;

import com.enigma.dev.controller.TenderContoller;
import com.enigma.dev.response.TenderEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface TenderRepository extends CrudRepository<TenderEntity, Integer> {
 static Logger logger = LoggerFactory.getLogger(TenderContoller.class);

public List<TenderEntity> findById(String id);
public List<TenderEntity> findDistinctByTenderRef(String tenderRef);
public List<TenderEntity>findByTenderName(String tenderName);
public boolean  deleteDistinctByTenderRef(String tenderRef);

}
