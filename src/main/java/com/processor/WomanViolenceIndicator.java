package com.processor;

import com.entity.WVIEntity;
import com.repository.WVIRepository;
import com.services.WVIService;
import com.services.WVIServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Vector;

@Component
public class WomanViolenceIndicator extends SaveDataMatrix {

    @Override
    public void setAttributesAndSave(Vector<Vector<String>> matrixx, WVIServiceImpl wviService) {
//        for (int i = 1; i < matrixx.size(); i++) {
//            WVIEntity wviEntity = new WVIEntity();
//            wviEntity.setAno(Integer.parseInt(matrixx.get(i).get(0)));
//            wviEntity.setMes(matrixx.get(i).get(1));
//            wviEntity.setNumAmeacas(Integer.parseInt(matrixx.get(i).get(2)));
//            wviEntity.setNumLesoesCorporais(Integer.parseInt(matrixx.get(i).get(3)));
//            wviEntity.setNumEstupros(Integer.parseInt(matrixx.get(i).get(4)));
//            wviEntity.setNumFeminicidioConsumado(Integer.parseInt(matrixx.get(i).get(5)));
//            wviEntity.setNumFeminicidioTentado(Integer.parseInt(matrixx.get(i).get(6)));
//            wviService.saveIndicator(wviEntity);
//        }

    }


}
