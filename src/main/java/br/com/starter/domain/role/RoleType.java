package br.com.starter.domain.role;

public enum RoleType {
    ROLE_USER("USER"),
    ROLE_MANAGER("MANAGER"),
    ROLE_ADMIN("ADMIN");

    private final String name;

    RoleType(String simpleName) {
        this.name = simpleName;
    }

    public String getName() {
        return name;
    }
}
