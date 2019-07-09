package com.processor;

import com.collector.SeleniumHandler;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Vector;

public class XLSXHandler extends ProcessorHandler {
    private static final Logger log = LoggerFactory.getLogger(XLSXHandler.class);
    private static DataFormatter formatter = new DataFormatter();
    //target changes depending on file
    private static final String START_COLLECTING_TARGET = "ANO";

    public XLSXHandler() {
        super(EnumProcessors.XLS);
    }

    @Override
    public Vector<Vector<String>> getContentFromSheet(Sheet sheet) {
        try {
            Vector<Vector<String>> contentMatrix = new Vector<>();
            boolean startCollecting = false;
            for (Row sheetRow : sheet) {
                Vector<String> contentRow = new Vector<>();
                for (Cell cell : sheetRow) {
                    String cellValue = formatter.formatCellValue(cell).trim();
                    if (!startCollecting && START_COLLECTING_TARGET.equals(cellValue))
                        startCollecting = true;

                    if (startCollecting && !"".equals(cellValue))
                        contentRow.add(cellValue.replace("*", "").trim());
                }
                if (contentRow.size() > 1)
                    contentMatrix.add(contentRow);
            }

            return contentMatrix;

        } catch (Exception e) {
            log.error(e.toString());
            return next.getContentFromSheet(sheet);
        }

    }
}
