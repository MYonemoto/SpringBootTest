package com.teste.store.service;

import org.springframework.http.HttpStatus;

public class HeroNotFoundException extends BusinessException {
    public HeroNotFoundException() {
        super("msg-9", HttpStatus.NOT_FOUND);
    }
}
