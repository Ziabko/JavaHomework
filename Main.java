public class Main {
    public static void main(String[] args) {

        //Создайте строку через new - I study Basic Java!
        //Распечатать пред-последний символ строки. Используем метод String.charAt().
        String str1 = new String("I study Basic Java!");
        System.out.println(str1.charAt(17));


        //Проверить, содержит ли ваша строка подстроку “Java”.
        //Используем метод String.contains().
        boolean containsJava = str1.contains("Java");
        System.out.println();
        if (containsJava) {
            System.out.println("Строка содержит 'Java'.");
        } else {
            System.out.println("Строка не содержит 'Java'.");
        }


        //Вырезать строку Java c помощью метода String.substring().
        System.out.println(str1.substring(14, 18));

        // Заменить все символы “а” на “о”.
        String replacedString = str1.replace('a', 'o');
        System.out.println(replacedString);

        //Преобразуйте строку к верхнему регистру.
        String upperCaseStr1 = str1.toUpperCase();
        System.out.println(upperCaseStr1);

        //Преобразуйте строку к нижнему регистру.
        String lowerCaseStr1 = str1.toLowerCase();
        System.out.println(lowerCaseStr1);







    }
}