package per.huashao.work3;

import java.util.List;

public class Student{
        int id;
        String name;
        int age;
        List<String> courses;
        Collage collage;

        public Student() {
        }

        public Student(int id, String name, int age, List<String> courses, Collage collage) {
                this.id = id;
                this.name = name;
                this.age = age;
                this.courses = courses;
                this.collage = collage;
        }

        public void setId(int id) {
                this.id = id;
        }

        public void setName(String name) {
                this.name = name;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public void setCourses(List<String> courses) {
                this.courses = courses;
        }

        public void setCollage(Collage collage) {
                this.collage = collage;
        }

        @Override
        public String toString() {
                return "Student{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", age=" + age +
                        ", courses=" + courses +
                        ", collage=" + collage +
                        '}';
        }
}