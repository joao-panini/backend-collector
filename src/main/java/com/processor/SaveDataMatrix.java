package com.processor;

import com.services.WVIServiceImpl;

import java.util.Vector;

public abstract class SaveDataMatrix {

    public final void save(Vector<Vector<String>> dataMatrix, WVIServiceImpl wviService){
        setAttributesAndSave(dataMatrix,wviService);
    }

    public abstract void setAttributesAndSave(Vector<Vector<String>> matrixx,WVIServiceImpl wviService);

}
