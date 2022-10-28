package Lesson5;

public class MainForLessonFive {

        private String  name;
        private String  post;
        private String  email;
        private String  phone;
        private int     salary;
        private int     age;

    MainForLessonFive(String name,
                 String post,
                 String email,
                 String phone,
                 int    salary,
                 int    age) {
            this.name = name;
            this.post = post;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        public String toString() {
            return("Имя: " +                this.name +
                    ", Должность: " +       this.post +
                    ", E-Mail: " +          this.email +
                    ", Номер телефона: " +  this.phone +
                    ", Зарплата: " +        this.salary +
                    ", Возраст: " +         this.age);
        }

        public String getname() {
            return name;
        }

        public void setname(String name) {
            this.name = name;
        }

        public String getpost() {
            return post;
        }

        public void setpost(String post) {
            this.post = post;
        }

        public String getEmail() {
            return email;
        }

        public void setEMail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone (String phone) {
            this.phone = phone;
        }

        public int getAge() {
            return age;
        }


}
