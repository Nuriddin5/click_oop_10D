package org.nuriddin.model;

import org.nuriddin.enums.Role;

/**
 * User:t.me/supermatematikuz
 * Date:20.02.2024 11:25
 */
public class User {
    private Long id;
    private Long phoneNumber;
    private Integer pinCode;
    private Integer smsCode;
    private Role role;

    public User() {
    }

    public User(Long id, Long phoneNumber, Integer pinCode, Integer smsCode, Role role) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.pinCode = pinCode;
        this.smsCode = smsCode;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    public Integer getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(Integer smsCode) {
        this.smsCode = smsCode;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", phoneNumber=" + phoneNumber +
                ", pinCode=" + pinCode +
                ", smsCode=" + smsCode +
                ", role=" + role +
                '}';
    }
}
