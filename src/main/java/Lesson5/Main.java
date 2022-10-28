package Lesson5;

public class Main {

        public static void main(String[] args) {
            MainForLessonFive[] employees = {
                    new MainForLessonFive("Александр Александров", "Директор", "director@main.com", "+375293226630", 500, 41),
                    new MainForLessonFive("Иван Иванов", "Заместитель директора", "zamdirector@main.com", "+375293226631", 400, 39),
                    new MainForLessonFive("Петр Петров", "Менеджер", "manager@main.com", "+375293226632", 300, 35),
                    new MainForLessonFive("Сергей Сергеев", "Секретарь", "secretar@main.com", "+375293226633", 200, 29),
                    new MainForLessonFive("Вася Васечкин", "Стажер", "trainee@main.com", "+375293226634", 100, 21),
            };

            for (MainForLessonFive s : employees) {
                if (s.getAge() > 40) {
                    System.out.println(s);
                }
            }
        }
}
