public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        int[] array = new int[]{10, 56, 43, 0, -5, 5, 30, 15, 48, 65};

        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        int a;
        for (int i = 0; i < array.length/2; i++) {
            a = array[array.length - 1 - i];
            array[array.length-1-i]=array[i];
            array[i]=a;

        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
