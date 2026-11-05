package org.example;
public class User {
    private final String username;
    private String email;
    private final String password;
    private final int age;
    public User(String username, String email, String password, int age)
            throws InvalidUserDataException {
        if (username == null || username.isEmpty()) {
            throw new InvalidUserDataException("Имя пользователя не может быть пустым");
        }
        if (email == null || !email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            throw new InvalidUserDataException("Неверный формат email");
        }
        if (password == null || password.length() < 6) {
            throw new InvalidUserDataException("Пароль должен содержать минимум 6 символов");
        }
        if (age <= 0) {
            throw new InvalidUserDataException("Возраст должен быть положительным");
        }
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
    }
    public void authenticate(String password) throws AuthenticationException {
        if (!this.password.equals(password)) {
            throw new AuthenticationException("Неверный пароль");
        }
        System.out.println("Авторизация успешна!");
    }
    public void updateEmail(String newEmail) throws InvalidUserDataException {
        if (newEmail == null || !newEmail.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            throw new InvalidUserDataException("Неверный формат нового email");
        }
        this.email = newEmail;
        System.out.println("Email успешно обновлен!");
    }
    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public int getAge() {
        return age;
    }
}