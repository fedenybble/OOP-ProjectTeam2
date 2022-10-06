package model;

public class Owner {
    private String name;
    private String lastName;
    private String role;

    public Owner(String name, String lastName, String role) {
        this.name = name;
        this.lastName = lastName;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
