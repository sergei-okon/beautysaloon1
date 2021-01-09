package com.beautysaloon.domain;


import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    STAFF, ADMIN, MANAGER;

    @Override
    public String getAuthority() {
        return name();
    }
}
