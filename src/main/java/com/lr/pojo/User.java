package com.lr.pojo;

import java.io.Serializable;

public class User  implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 901517236976079422L;
        private Integer id;

        private String userName;

        private String userPassword;

        private Integer age;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName == null ? null : userName.trim();
        }


    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }


}
