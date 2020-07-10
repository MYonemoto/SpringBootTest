package com.teste.store.service;

import org.springframework.http.HttpStatus;

public class HeroAlreadyExistException extends BusinessException {
    public HeroAlreadyExistException() {
        super("msg-8", HttpStatus.BAD_REQUEST);
    }
}
