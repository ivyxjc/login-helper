package org.clevercastle.helper.login;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.OffsetDateTime;

@javax.persistence.Entity
@javax.persistence.Table(name = "users")
@Entity
@Table(name = "users")
public class User {
    @javax.persistence.Id
    @Id
    private String userId;
    private UserState userState;
    private String hashedPassword;

    // used for user verification (loginType == raw)
    private String verificationCode;
    private OffsetDateTime verificationCodeExpiredAt;

    // used for user hashed password (loginType == raw)
    private String resetPasswordCode;
    private OffsetDateTime resetPasswordCodeExpiredAt;

//    private Set<RefreshToken> refreshTokens;

    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserState getUserState() {
        return userState;
    }

    public void setUserState(UserState userState) {
        this.userState = userState;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public OffsetDateTime getVerificationCodeExpiredAt() {
        return verificationCodeExpiredAt;
    }

    public void setVerificationCodeExpiredAt(OffsetDateTime verificationCodeExpiredAt) {
        this.verificationCodeExpiredAt = verificationCodeExpiredAt;
    }

    public String getResetPasswordCode() {
        return resetPasswordCode;
    }

    public void setResetPasswordCode(String resetPasswordCode) {
        this.resetPasswordCode = resetPasswordCode;
    }

    public OffsetDateTime getResetPasswordCodeExpiredAt() {
        return resetPasswordCodeExpiredAt;
    }

    public void setResetPasswordCodeExpiredAt(OffsetDateTime resetPasswordCodeExpiredAt) {
        this.resetPasswordCodeExpiredAt = resetPasswordCodeExpiredAt;
    }

//    public Set<RefreshToken> getRefreshTokens() {
//        return refreshTokens;
//    }
//
//    public void setRefreshTokens(Set<RefreshToken> refreshTokens) {
//        this.refreshTokens = refreshTokens;
//    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
