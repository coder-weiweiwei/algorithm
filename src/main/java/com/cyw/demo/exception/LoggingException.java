package com.cyw.demo.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * @auther: chenyw
 * @time: 2020/8/12
 * @description:
 */
class MyLoggingException extends Exception{
    private static Logger logger = Logger.getLogger("MyLoggingException");
    static void  MyLoggingException(Exception e){
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        try{
            throw new NullPointerException();
        }catch (Exception e){
            MyLoggingException(e);
        }
    }


}

public class LoggingException {
}
