package org.example.chapter2;

public class Builder {

    private String name;
    private  int agr;

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder() {
    }

    public Builder setAgr(int agr) {
        this.agr = agr;
        return this;
    }

    private Builder(String name, int agr) {
        this.name = name;
        this.agr = agr;
    }

    public Builder build(){
        return new Builder(this.name,this.agr);
    }

    @Override
    public String toString() {
        return "Builder{" +
                "name='" + name + '\'' +
                ", agr=" + agr +
                '}';
    }

    public static void main(String[] args) {
        Builder builder =new Builder().setAgr(10)
                .setName("sda").build();

        System.out.println(builder);
    }
}
