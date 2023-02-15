public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Задача 1");
        Book captain = new Book("Пятнадцатилетний капитан", new Author("Жуль", "Верн"), 1978);
        System.out.println(captain);
        captain.setPublicationDate(1999);
        System.out.println("Обновленный год публикации - " + captain.getPublicationDate());
        Book airport = new Book("Аэропорт", new Author("Артур", "Хейли"), 1968);
        System.out.println(airport);
        // Я немного не понял зачем реализовывать методы equals и hashCode в данной программе, т.к. информация была только
        // в шпаргалке. Нужно ли выводить в результат программы одинаковы книги или нет(true, false). Просто вставил методы через генерацию шаблонных методов.
    }
}