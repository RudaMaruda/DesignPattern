package singleton.task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

public enum LoggerEnum {
    INSTANCE_LOG;
private File loggingFileEnum;


    LoggerEnum() {
        loggingFileEnum = new File("logEnum.txt");
    }



    public void log(LEVEL level,String msg){

        LocalTime logTime = LocalTime.now();
        FileWriter fileWriterEnum = null;


        try{
            fileWriterEnum = new FileWriter(loggingFileEnum,true);
        } catch (IOException e){
            e.printStackTrace();
        }
        PrintWriter printWriterE = new PrintWriter(fileWriterEnum);
        printWriterE.println(logTime+" , "+ level + " , "+msg);
        printWriterE.flush();
        printWriterE.close();


    }

}
