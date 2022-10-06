package model;

    public class Owner {

        private String name;
        private String lastname;

        private String role;
        private String email;
        private String address;
        private String dni;
        private int phoneNumber;

        public Owner(String name, String lastname, String role, String email, String address, String dni, int phoneNumber) {
            this.name = name;
            this.lastname = lastname;
            this.role = role;
            this.email = email;
            this.address = address;
            this.dni = dni;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getDni() {
            return dni;
        }

        public void setDni(String dni) {
            this.dni = dni;
        }

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
        }


    }


