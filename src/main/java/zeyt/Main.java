package zeyt;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        String userInput = scr.nextLine();// считывать с консоли данные введенные пользователем
        String[] arrayRoman = userInput.split("[+-/*]");// разделяем строку строки по символу
        if (arrayRoman.length > 2) {
            throw new Exception("Формат математической операции не удовлетворяет заданию");
        }
        String numbers = " 0 1 2 3 4 5 6 7 8 9 10 ";
        String romNumbers = "  I II III IV V VI VII VIII IX X";
        // Определяем риские ли цифры
        if (romNumbers.contains(arrayRoman[0]) && romNumbers.contains(arrayRoman[1])) {

            String inputRoman1 = arrayRoman[0].trim();// Удаляем пробелы
            String inputRoman2 = arrayRoman[1].trim();// Удаляем пробелы

            int number1;
            int number2;
            int result = 0;
            //number1 = convert(inputRoman1);//Конвертируем римские в арабские
            //number2 = convert(inputRoman2);//Конвертируем римские в арабсикие

            char[] arrayRoman1 = new char[userInput.length()];
            for (int i = 0; i < userInput.length(); i++) {

                number1 = convert(inputRoman1);//Конвертируем римские в арабские
                number2 = convert(inputRoman2);//Конвертируем римские в арабские

                arrayRoman1[i] = userInput.charAt(i);
                if (arrayRoman1[i] == '+') {
                    result = number1 + number2;

                }
                if (arrayRoman1[i] == '-') {
                    result = number1 - number2;
                }
                if (arrayRoman1[i] == '*') {
                    result = number1 * number2;
                }
                if (arrayRoman1[i] == '/') {
                    result = number1 / number2;
                } else {
                    throw new IOException();
                }
            }
            System.out.println(convertNumToRoman(result));
        } else if (numbers.contains(arrayRoman[0]) && numbers.contains(arrayRoman[1])) {
            String[] array = userInput.split("[+-/*]");// разделяем строку строки по символу
            String input1 = array[0].trim();// Удаляем пробелы
            String input2 = array[1].trim();// Удаляем пробелы
            char[] array1 = new char[userInput.length()];// Создаем массив char
            int result = 0;
            for (int i = 0; i < userInput.length(); i++) {
                array1[i] = userInput.charAt(i);
                int a = Integer.parseInt(input1);// Конвертируем стринговую в intoвую переменную
                int b = Integer.parseInt(input2);// Конвертируем стринговую в intoвую переменную

                // Определяем символ +-*/ и проводим соответствующую операцию
                if (array1[i] == '+') {
                    result = a + b;
                }
                if (array1[i] == '-') {
                    result = a - b;
                }
                if (array1[i] == '*') {
                    result = a * b;
                }
                if (array1[i] == '/') {
                    result = a / b;
                }

            }

            System.out.println(result);
        } else {
            throw new Exception();
            //System.out.println("error");
        }
    }

    //Конвертер
    public static int convert(String a) {

        if (a.equals("I")) return 1;
        if (a.equals("II")) return 2;
        if (a.equals("III")) return 3;
        if (a.equals("IV")) return 4;
        if (a.equals("V")) return 5;
        if (a.equals("VI")) return 6;
        if (a.equals("VII")) return 7;
        if (a.equals("VIII")) return 8;
        if (a.equals("IX")) return 9;
        if (a.equals("X")) return 10;
        return 0;
    }

    private static String convertNumToRoman(int numArabian) {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        final String s = roman[numArabian];
        return s;
    }
}


