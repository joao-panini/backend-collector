package com.services;

import com.collector.SSPIntegration;
import com.entity.WVIEntity;
import com.repository.WVIRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WVIServiceImpl implements WVIService {

    private static final Logger log = LoggerFactory.getLogger(WVIServiceImpl.class);

    @Autowired
    private WVIRepository wviRepository;

    public WVIServiceImpl(WVIRepository repo){
        wviRepository = repo;
    }

    public WVIEntity saveIndicator(WVIEntity WVIEntity){
        return wviRepository.save(WVIEntity);
    }

    public List<WVIEntity> listAll(){
        return wviRepository.findAll();
    }

    public void deleteAll(){
        log.info("deleting all indicators for update");
        wviRepository.deleteAll();
    }
}
