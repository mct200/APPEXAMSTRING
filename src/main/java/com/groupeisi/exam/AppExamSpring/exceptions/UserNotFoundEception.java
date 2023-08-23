package com.groupeisi.exam.AppExamSpring.exceptions;

public class UserNotFoundEception  extends RuntimeException{
    private static final long serialVersionUID = -988032962899355409L;

    public UserNotFoundEception(String message) {
        super(message);

    }

}
