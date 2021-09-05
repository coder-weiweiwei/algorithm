package com.cyw.demo.exception;

/**
 * @auther: chenyw
 * @time: 2020/8/13
 * @description:
 */
public class MyException2 {
    OtherConstructorException otherConstructorException = new OtherConstructorException("sad");
}

class OtherConstructorException extends Exception {
    public OtherConstructorException(String msg) {
        super(msg);
    }

    @Override
    public String getMessage() {
        return "asds";
    }
}
