public class main {
    public static void main(String[] args) {

        // задание 1
        int age = 16;
        if (age >= 18) {
            System.out.println("Поздравляем");
        }
        if (age < 18) {
            System.out.println("Возраст ещё не наступил");
        }

        // задание 2
        int ageChild = 16;
        if (ageChild >= 7 && ageChild < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (ageChild >= 18 && ageChild < 24) {
            System.out.println("Человек может отправлять в университет");
        }
        if (ageChild >= 24) {
            System.out.println("Пора искать работу");
        }

        // задание 3
        int capacity = 103;
        if (capacity <= 60) {
            System.out.println("Сидячие места есть");
        }
        if (capacity > 60 && capacity <= 102) {
            System.out.println("Остались стоячие места");
        }
        if (capacity > 102) {
            System.out.println("Мест в вагоне не осталось");
        }

        // задание 2.1
        int age2 = 17;
        if (age2 >= 18) {
            System.out.println("Поздравляем");
            } else {
            System.out.println("Не достигли возраста");
        }

        // задание 2.2
        int childAge = 82;
        if (childAge >= 7 && childAge < 18) {
            System.out.println("Ребенок ходит в школу");
        }
            if (childAge >= 18 && childAge < 24) {;
            System.out.println("Человек в университете");
        } else {
                System.out.println("Пора искать работу");
            }

            // задание 3.2
        int capacity2 = 103;
            if (capacity2 <= 60) {
                System.out.println("Есть сидячие места");
            }
            if (capacity2 > 60 && capacity2 <=102) {
                System.out.println("Остались стоячие места");
            } else {
                System.out.println("Мест нет");
            }

        }
    }

