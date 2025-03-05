package good.stuff.webstore.model.user;

public enum UserRole {
    ADMIN,
    USER,
    ANONYMOUS;

    public UserRole getValue(String value) {return UserRole.valueOf(value.toUpperCase());}
}
