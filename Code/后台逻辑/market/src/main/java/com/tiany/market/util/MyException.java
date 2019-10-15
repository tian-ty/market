package com.tiany.market.util;

public class MyException extends RuntimeException {


    public MyException()
    {
        super("未知异常");
    }

    public MyException(String message)
    {
        super(message);
    }

}
