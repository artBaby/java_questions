import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

////        Что будет выведено на экран при выполнении следующего кода?
//        String str = "Java";
//        System.out.println(str.indexOf("a"));
////        a) 0
////        b) 1
////        c) 2
////        d) -1
////        Ответ: b) 1


////      Какой результат будет возвращен при выполнении следующего кода?
//        int x = 10;
//        int y = x--;
//        System.out.println(y);
////        a) 10
////        b) 11
////        c) 9
////        d) Ошибка компиляции
////
////        Ответ: a) 10


////      Что будет выведено на экран при выполнении следующего кода?
//        String str = "Java";
//        System.out.println(str.replace("a", "o"));
////        a) "Jovo"
////        b) "Jova"
////        c) "Jovo"
////        d) "Java"
////        Ответ: a) "Jovo"


////        Какой результат будет возвращен при выполнении следующего кода?
//        int x = 5;
//        int y = 2;
//        System.out.println(Math.pow(x, y));
////        a) 32
////        b) 32.0
////        c) 25
////        d) 25.0
////        Ответ: d) 25.0


////        Что будет выведено на экран при выполнении следующего кода?
//        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println(arr[5]);
////        a) 5
////        b) Ошибка компиляции
////        c) 0
////        d) ArrayIndexOutOfBoundsException
////        Ответ: d) ArrayIndexOutOfBoundsException


////        Какой результат будет после выполнения следующего кода?
//        String str = "Hello World";
//        System.out.println(str.substring(6, 11));
////        a) "World"
////        b) "Hello"
////        c) "Hello "
////        d) Ошибка компиляции
////        Ответ: a) "World"


////        Что будет выведено на экран после выполнения следующего кода?
//        int[] numbers = {1, 2, 3, 4, 5};
//        int sum = 0;
//        for (int i : numbers) {
//            sum += i;
//        }
//        System.out.println(sum);
//        a) 15
//        b) 10
//        c) 5
//        d) Ошибка компиляции
//        Ответ: a) 15


////        Что будет выведено на экран после выполнения следующего кода?
//        int[] numbers = {1, 2, 3, 4, 5};
//        int sum = 0;
//        for (int i : numbers) {
//            sum += ++i;
//        }
//        System.out.println(sum);
////        a) 15
////        b) 10
////        c) 5
////        d) 20
////        Ответ: d) 20


////        Какой результат будет после выполнения следующего кода?
//        String str1 = "Java";
//        String str2 = new String("Java");
//        System.out.println(str1 == str2);
////        a) true
////        b) false
////        c) Ошибка компиляции
////        d) Ничего не будет выведено
////        Ответ: b) false


////      Какой результат будет после выполнения следующего кода?
//        int x = 5;
//        int y = 3;
//        int z = x++ + ++y;
//        System.out.println(z);
////        a) 9
////        b) 10
////        c) 11
////        d) 12
////        Ответ: a) 9


////      Какой результат будет после выполнения следующего кода?
//        int[] numbers = {1, 2, 3, 4, 5};
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.print(numbers[i] + " ");
//        }
////        a) 5 4 3 2 1
////        b) 1 2 3 4 5
////        c) 5 4 3 2
////        d) Error: ArrayIndexOutOfBoundsException
////        Ответ: a) 5 4 3 2 1


////      Какой результат будет возвращен при выполнении следующего кода?
//        String str = "Hello World";
//        System.out.println(str.substring(6));
////        a) World
////        b) Hello
////        c) Hello W
////        d) Error: Invalid syntax
////        Ответ: a) World


//        Что из перечисленного НЕ является допустимым способом объявления и инициализации массива в Java?
//        a) int[] numbers = new int[5];
//        b) int numbers[] = {1, 2, 3, 4, 5};
//        c) int[] numbers = {1, 2, 3, 4, 5};
//        d) int numbers = new int[5];
//
//        Ответ: d) int numbers = new int[5];


////        Какой результат будет возвращен при выполнении следующего кода?
//        int participants = 4, animals = 2, performers = -1;
//        while ((participants = participants + 1) < 10) {};
//        do {} while (animals++ <= 1);
//        for(; performers < 2; performers += 2) {};
//        System.out.print(participants);
//        System.out.print(animals);
//        System.out.print(performers);
////        a) 1022
////        b) 1023
////        c) 1033
////        d) 1034
////        Ответ: c) 1033


////        Какой результат будет возвращен при выполнении следующего кода?
//        List<Integer> numbers = Arrays.asList (2, 3, 4, 5, 6, 7, 8, 9, 10);
//        int sum = numbers.stream ()
//            .filter(n -> n % 2 == 0)
//            .mapToInt (Integer::intValue)
//            .sum();
//        System.out.println(sum);
////        a) 54
////        b) 24
////        c) 0
////        d) 30
////        Ответ: d) 30


////        Какой результат будет возвращен при выполнении следующего кода?
//        final char a = 'A', e = 'E';
//        char grade = 'B';
//        switch (grade) {
//            default:
//            case a:
//            case 'B': 'C' : System.out.print("great ");
//            case 'D': System.out.print("good "); break;
//            case e:
//            case 'F':
//                System.out.print("not good ");
//        }
////        A) great
////        B) great good
////        C) good
////        D) not good
////        E) Код не компилируется, поскольку тип данных одного или нескольких операторов case не соответствует типу данных переменной переключения.
////        F) Ничего из вышеперечисленного
////
////        Объяснение:
////        Код не компилируется, хотя и не по причине, указанной в варианте E.
////            Второй оператор case содержит неверный синтаксис.
////            Каждый оператор case должен иметь ключевое слово case.
////        другими словами, вы не можете объединить их двоеточием (:),
////        как показано в случае 'B' : 'C' :.
////        По этой причине правильным ответом является вариант F.
////        Если бы в этой строке было исправлено добавление ключевого слова «case» перед «C»,
////        тогда остальная часть кода была бы отлично скомпилирована и напечатана во время выполнения.

    }
}
