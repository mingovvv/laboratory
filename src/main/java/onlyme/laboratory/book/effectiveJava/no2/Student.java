package onlyme.laboratory.book.effectiveJava.no2;

public class Student {

    private Long studentId;
    private String name;
    private int age;
    private int height;
    private int weight;
    private String phoneNo;

    public Student(Builder builder) {
        studentId = builder.studentId;
        name = builder.name;
        age = builder.age;
        height = builder.height;
        weight = builder.weight;
        phoneNo = builder.phoneNo;
    }

    public static class Builder {

        private Long studentId;
        private String name;
        private int age = 0;
        private int height = 0;
        private int weight = 0;
        private String phoneNo = null;

        public Builder studentId(Long studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder height(int height) {
            this.height = height;
            return this;
        }

        public Builder weight(int weight) {
            this.weight = weight;
            return this;
        }

        public Builder phoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public Student builder() {
            return new Student(this);
        }

    }

//    public Student(Long studentId, String name, int age) {
//        this.studentId = studentId;
//        this.name = name;
//        this.age = age;
//    }
//
//    public Student(Long studentId, String name, int age, int height) {
//        this.studentId = studentId;
//        this.name = name;
//        this.age = age;
//        this.height = height;
//    }
//
//    public Student(Long studentId, String name, int age, int height, int weight) {
//        this.studentId = studentId;
//        this.name = name;
//        this.age = age;
//        this.height = height;
//        this.weight = weight;
//    }
//
//    public Student(Long studentId, String name, int age, int height, int weight, String phoneNo) {
//        this.studentId = studentId;
//        this.name = name;
//        this.age = age;
//        this.height = height;
//        this.weight = weight;
//        this.phoneNo = phoneNo;
//    }
//
//    public Long getStudentId() {
//        return studentId;
//    }
//
//    public void setStudentId(Long studentId) {
//        this.studentId = studentId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    public int getWeight() {
//        return weight;
//    }
//
//    public void setWeight(int weight) {
//        this.weight = weight;
//    }
//
//    public String getPhoneNo() {
//        return phoneNo;
//    }
//
//    public void setPhoneNo(String phoneNo) {
//        this.phoneNo = phoneNo;
//    }
//
//    public Student() {
//    }
}
