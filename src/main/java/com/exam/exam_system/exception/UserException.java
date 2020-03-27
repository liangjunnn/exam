package com.exam.exam_system.exception;


import com.exam.exam_system.common.enums.ErrorMsgEnum;

/**
 * @author :
 * @ClassName : UserException
 * @Description :
 * @Date : 2020/3/22 13:20
 */
public class UserException extends CustomException {


    private static final long serialVersionUID = 9129706178369907846L;

    public UserException(ErrorMsgEnum code) {
        super(code);
    }

    public UserException(ErrorMsgEnum code, Object... args) {
        super(code, args);
    }

    public UserException(ErrorMsgEnum code, Throwable t) {
        super(code, t);
    }
}
