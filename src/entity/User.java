package entity;

import java.util.Arrays;
import java.util.Objects;

/**
 * Пользователь
 *
 * @author Alexey Zhukov
 */
public class User {

    private Long id;
    private String name;
    private String surname;
    private String password;
    private Role[] role;

    public User(Long id, String name, String surname, String password, Role[] role) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(password, user.password) && Arrays.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, surname, password);
        result = 31 * result + Arrays.hashCode(role);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", role=" + Arrays.toString(role) +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }

    public Role[] getRole() {
        return role;
    }

}
