package com.enigma.dev.service;

import com.enigma.dev.repository.TenderRepository;
import com.enigma.dev.request.TenderEditRequest;
import com.enigma.dev.request.TenderRequest;
import com.enigma.dev.response.TenderEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TenderService {
    private static Logger logger = LoggerFactory.getLogger(TenderService.class);
    @Autowired
    private TenderRepository tenderRepository;

    public boolean saveTender(TenderRequest request) {
        logger.info("TenderService::saveTender::" + request);
        TenderEntity tenderEntity = new TenderEntity();
        tenderEntity.setTenderRef(request.getTenderRef1());
        tenderEntity.setTenderPerson(request.getTenderPerson1());
        tenderEntity.setTenderName(request.getTenderName1());
        tenderRepository.save(tenderEntity);
        return true;
    }

    public List<TenderEntity> getTender() {
        logger.info("TenderService::getTender::");
        List<TenderEntity> getAllTenderInfo = (List<TenderEntity>) tenderRepository.findAll();
        logger.info("TenderService::getTender::" + getAllTenderInfo);
        return getAllTenderInfo;
    }

    public List<TenderEntity> getTenderName(String tenderName1) {
        logger.info("TenderService::getTenderName::");
        List<TenderEntity> getAllTenderNameInfo = (List<TenderEntity>) tenderRepository.findByTenderName(tenderName1);
        logger.info("TenderService::getTenderName::" + getAllTenderNameInfo);
        return getAllTenderNameInfo;
    }

    public boolean deleteTender(String tenderRef1) {
        tenderRepository.deleteDistinctByTenderRef(tenderRef1);
        return true;

    }

    public boolean editTender(TenderEditRequest tenderEditRequest) {
        String tenderRef = tenderEditRequest.getEditTenderRef();
        List<TenderEntity> tenderList = tenderRepository.findDistinctByTenderRef(tenderRef);
        TenderEntity originalTenderEntity = tenderList.get(0);
        originalTenderEntity.setTenderName(tenderEditRequest.getEditTenderName());
        originalTenderEntity.setTenderPerson(tenderEditRequest.getEditTenderPerson());
        tenderRepository.save(originalTenderEntity);
        return true;
    }

}
