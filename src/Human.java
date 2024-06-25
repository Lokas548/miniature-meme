
public class Human {

    String fullName;
    String dateOfBirth;
    String sex;
    DataProperty valid = new DataProperty();

    public Human(){

    }

    public Human(String name, String dateOfBirth, String sex) {
        this.fullName = name;
        if(valid.checkDateOfBirth(dateOfBirth)){
            this.dateOfBirth = dateOfBirth;
        }
        else {
            throw new IllegalArgumentException("Дурак, че за дата");
        }

        if(valid.checkSex(sex)){
            this.sex = sex;
        }
        else {
            throw new IllegalArgumentException("Дурак, ты кто ваще?");
        }
    }

    public void setDateOfBirth(String age) {
        if(valid.checkDateOfBirth(dateOfBirth)){
            this.dateOfBirth = age;
        }
        else {
            throw new IllegalArgumentException("Дурак, че за дата");
        }
    }

    public void setName(String name) {
        this.fullName = name;
    }

    public void setSex(String sex){
        if(valid.checkSex(sex)){
            this.sex = sex;
        }
        else {
            throw new IllegalArgumentException("Дурак, ты кто ваще?");
        }
    }

    public void getName() {
        System.out.println(this.fullName);
    }

    public void getDateOfBirth() {
        System.out.println(this.dateOfBirth);
    }

    public void getSex() {
        System.out.println(this.sex);
    }


}
