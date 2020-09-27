package com.lesson2.task1;

public class ArraySort {
    // создаем и инициализируем новый массив
    private static int[] srcArray = {-1, 12, -3, -4, 125, 0, -1, -25, 3, -45, 5, 5, 10, 10};


    // метод сортировки массива. На вход принимает исходный массив
    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    // Задание1: сортировка массива
    public static void doSort(int[] array) {
        // Выводим значение исходного массива
        System.out.println("Исходный массив:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println("\n\nОтсортированный массив: ");
        // Сортируем мыссив
        bubbleSort(array);
        // выводим отсортированный массив
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public static void main(String[] args) {
        doSort(srcArray);
    }

}