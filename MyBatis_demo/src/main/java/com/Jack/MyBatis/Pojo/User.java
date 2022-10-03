package com.Jack.MyBatis.Pojo;

public class User {
    private Integer id;
    private String userName;
    private  String password;
    private Integer age;
    private Integer sex;
    private String email;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private Address address;

    public User(Integer id, String name, String password, Integer age, Integer sex, String email,Address address) {
        this.id = id;
        this.userName = name;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.address=address;
    }
    public User(){

    }
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
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        User user=new User();
        user.setId(this.id);
        user.setUserName(this.userName);
        user.setPassword(this.getPassword());
        user.setAge(this.age);
        user.setSex(this.sex);
        user.setEmail(this.email);
        user.setAddress(this.address);
        return user;
    }
}
