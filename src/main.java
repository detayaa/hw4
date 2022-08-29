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
    }
}
