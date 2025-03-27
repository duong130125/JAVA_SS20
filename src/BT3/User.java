package BT3;

import java.util.Optional;

public class User {
    private final String name;
    private final Optional<String> phoneNumber;

    public User(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = Optional.ofNullable(phoneNumber);
    }

    public void printInfo() {
        System.out.println("Tên: " + name + ", SĐT: " + phoneNumber.orElse("Không có"));
    }
}
