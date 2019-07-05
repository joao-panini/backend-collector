package com.controller;

import com.entity.WVIEntity;
import com.services.WVIServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.services.WVIService;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
public class WVIController {

    @Autowired
    private WVIServiceImpl wviServiceImpl;

    @Autowired
    private WVIEntity wviEntity;

    public void addIndicator(WVIEntity WVIEntity){
        wviEntity.setAno(WVIEntity.getAno());
        wviEntity.setMes(WVIEntity.getMes());
        wviEntity.setNumAmeacas(WVIEntity.getNumAmeacas());
        wviEntity.setNumEstupros(WVIEntity.getNumEstupros());
        wviEntity.setNumFeminicidioConsumado(WVIEntity.getNumFeminicidioConsumado());
        wviEntity.setNumFeminicidioTentado(WVIEntity.getNumFeminicidioTentado());
        wviEntity.setNumLesoesCorporais(WVIEntity.getNumLesoesCorporais());
        wviServiceImpl.saveIndicator(wviEntity);
    }

    @RequestMapping("/api/findAll")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<WVIEntity> findAll(){
        List<WVIEntity> list = wviServiceImpl.listAll();
        return list;
    }


}
