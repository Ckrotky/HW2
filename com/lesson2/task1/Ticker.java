package com.lesson2.task1;

import static com.lesson2.task1.ArraySort.bubbleSort;

public class Ticker {
    // Задание2:
// создаем и инициализируем новый массив
    private static int[] srcArray = {0,11,14,21,26,44,77,101};

    // Метод определения текущего "Направления" - ставим влево от центра или вправо
    public static int direction(int i) {
        if ((i * 3) % 2 == 0) {       // Если парное
            return -1;
        } else
            return 1;
    }

    // Метод расстановки элементов в нужном порядке
    public static void ticker(int[] array) {
        // Определяем средину массива
        int centerPos;
        System.out.print("Исходный массив: ");
        for (int i = 0; i < srcArray.length; i++) {
            System.out.print(srcArray[i] + " ");
        }



        // В зависимости от размера массива определяем позицию средины массива
        if (array.length % 2 != 0) {
            centerPos = (array.length / 2);
        } else centerPos = (array.length / 2) - 1;

        // Сортируем исходный массив
        bubbleSort(array);

        // создаем новый массив, который будем инициализировать элементами старого
        int[] tickerArray = new int[srcArray.length];

        // Присваеваем в нужном порядке элементам нового массива - отсортироанные элементы старого
        for (int i = 0; i < srcArray.length; i++) {
            tickerArray[centerPos + ((i + 1) / 2) * direction(i)] = srcArray[i];
        }
        System.out.print("\n\nОтсортированный массив: ");
        for (int i = 0; i < tickerArray.length; i++) {
            System.out.print(tickerArray[i] + " ");

        }
    }


    public static void main(String[] args) {
        ticker(srcArray);


    }

}