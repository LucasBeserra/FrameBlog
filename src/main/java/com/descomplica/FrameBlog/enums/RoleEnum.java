package com.descomplica.FrameBlog.enums;

public enum RoleEnum {
    USER("user"),
    ADMIN("admin");
    private final String role;

    RoleEnum(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
