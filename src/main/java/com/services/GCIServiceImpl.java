package com.services;

import com.entity.GCIEntity;
import com.entity.WVIEntity;
import com.repository.GCIRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GCIServiceImpl implements WVIService {

    private static final Logger log = LoggerFactory.getLogger(WVIServiceImpl.class);

    @Autowired
    private GCIRepository gciRepository;

    public GCIServiceImpl(GCIRepository repo) {
        gciRepository = repo;
    }

    public GCIEntity saveIndicator(GCIEntity gciEntity) {
        return gciRepository.save(gciEntity);
    }


    public List<GCIEntity> listAll() {
        return gciRepository.findAll();
    }

    public void deleteAll() {
        log.info("deleting all indicators for update");
        gciRepository.deleteAll();
    }
}
