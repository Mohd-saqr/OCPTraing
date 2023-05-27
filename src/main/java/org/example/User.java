package org.example;

public class User {

    private String name;
    private int age ;
    protected String country;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String toString (){
        return name;
    }

    public boolean equals(Object o){
        if (o instanceof User){
            User user =(User) o;
            return age== user.getAge();
        }
        return false;

    }

    public int hashCode (){
        return name.hashCode();
    }
}
