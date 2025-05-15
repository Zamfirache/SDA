package creational.builder;


public class User {

    private String name;

    private String email;

    private int age;

    private double salary;


    public User(Builder builder)
    {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.salary = builder.salary;
    }

    public static class Builder{
        private String name;

        private String email;

        private int age;

        private double salary;

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setSalary(double salary){
            this.salary = salary;
            return this;
        }

        public User build()
        {
            return new User(this);
        }
    }
}
