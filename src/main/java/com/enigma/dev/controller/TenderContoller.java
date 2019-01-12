package com.enigma.dev.controller;

import com.enigma.dev.request.TenderEditRequest;
import com.enigma.dev.request.TenderRequest;
import com.enigma.dev.response.TenderEntity;
import com.enigma.dev.service.TenderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class TenderContoller {
    private static Logger logger = LoggerFactory.getLogger(TenderContoller.class);
    @Autowired
    private TenderService tenderService;

    @PostMapping("/saveTenderInfo")
    public ResponseEntity<?> saveTender(@RequestBody TenderRequest request) {
        logger.info("TenderController:: saveTender :: TenderRequest ::  " + request);
        tenderService.saveTender(request);
        return new ResponseEntity("", HttpStatus.OK);

    }

    @PostMapping("/getAllTender")
    public ResponseEntity<?> getTender() {
        logger.info("TenderController:: getAllTender ::  getTender :: TenderRequest ::  ");
        List<TenderEntity> tenderList = tenderService.getTender();
        return new ResponseEntity(tenderList, HttpStatus.OK);
    }

    @PostMapping("/getTenderByName")
    public ResponseEntity<?> getTenderByName(@RequestBody String tenderName1) {
        logger.info("TenderController:: getTenderByName :: getTender :: TenderRequest ::  " + tenderName1);
        List<TenderEntity> tenderList = tenderService.getTenderName(tenderName1);
        return new ResponseEntity(tenderList, HttpStatus.OK);

    }

    @PostMapping("/deleteTenderByRef")
    public ResponseEntity<?> deleteTender(@RequestBody String tenderRef1) {
        logger.info("TenderController:: deleteTenderByRef ::deleteTender:: TenderRequest ::  " + tenderRef1);
        tenderService.deleteTender(tenderRef1);
        return new ResponseEntity("deleted", HttpStatus.OK);
    }

    @PostMapping("/editTenderByRef")
    public ResponseEntity<?> editTender(@RequestBody TenderEditRequest tenderEditRequest) {
        logger.info("TenderController:: editTenderByRef :: editTender::  TenderEditRequest ::  " + tenderEditRequest);
         tenderService.editTender(tenderEditRequest);
        return new ResponseEntity("edited", HttpStatus.OK);
    }

}
