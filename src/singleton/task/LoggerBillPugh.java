package singleton.task;

import singleton.BillPughSingleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

public class LoggerBillPugh {

    private static File loggingFileBP;

    private LoggerBillPugh(){

        loggingFileBP = new File("logBP.txt");
    }

    private static class BillPughSingletonHelper{
        private static final LoggerBillPugh INSTANCE = new LoggerBillPugh();
    }

    public static LoggerBillPugh getInstance(){
        return BillPughSingletonHelper.INSTANCE;
    }



    public void log(LEVEL level,String msg){

        LocalTime logTime = LocalTime.now();
        FileWriter fileWriterBP = null;


        try{
            fileWriterBP = new FileWriter(loggingFileBP,true);
        } catch (IOException e){
            e.printStackTrace();
        }
        PrintWriter printWriter = new PrintWriter(fileWriterBP);
        printWriter.println(logTime+" , "+ level + " , "+msg);
        printWriter.flush();
        printWriter.close();


    }






}
