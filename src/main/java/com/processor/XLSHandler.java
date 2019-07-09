package com.processor;

import com.collector.EnumCrawlers;
import org.apache.poi.ss.usermodel.Sheet;

import java.util.Vector;

public class XLSHandler extends ProcessorHandler {

    public XLSHandler() {
        super(EnumProcessors.XLSX);
    }


    @Override
    public Vector<Vector<String>> getContentFromSheet(Sheet sheet) {
       //TODO: get data from xls files
        return null;
    }
}
