package JavaBasics.LLD.Creational.Builder;



public class ProfileBuilder {

    private String name;
    private Integer age;
    private String gender;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }


    public ProfileBuilder(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
    }

    public static class Builder{
        private String name;
        private Integer age;
        private String gender;

        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setAge(Integer age){
            this.age = age;
            return this;
        }
        public  Builder setGender(String gender){
            this.gender = gender;
            return  this;
        }

        public ProfileBuilder build(){
            return new ProfileBuilder(this);
        }
    }
}
