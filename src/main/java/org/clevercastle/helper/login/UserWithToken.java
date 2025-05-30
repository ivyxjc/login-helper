package org.clevercastle.helper.login;

public class UserWithToken {
    private final User user;
    private final TokenHolder tokenHolder;

    public UserWithToken(User user, TokenHolder tokenHolder) {
        this.user = user;
        this.tokenHolder = tokenHolder;
    }

    public User getUser() {
        return user;
    }

    public TokenHolder getTokenHolder() {
        return tokenHolder;
    }
}
