package com.processor;

import org.apache.poi.ss.usermodel.Sheet;

import java.util.List;
import java.util.Vector;

public abstract class ProcessorHandler {
    protected ProcessorHandler next;
    protected EnumProcessors crawler;


    public void setNext(ProcessorHandler processor) {
        if (next == null) {
            next = processor;
        } else {
            next.setNext(processor);
        }
    }

    public ProcessorHandler(EnumProcessors processor) {
        next = null;
        crawler = processor;
    }

    public abstract Vector<Vector<String>> getContentFromSheet(Sheet sheet);

}
