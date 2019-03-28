package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[20];
        new FibonacciInitializer().initialize(array);
        print(array);
        
        int summ = 0;
        
        for(int array1: array){
            summ += array1;
        }
        
        System.err.println("Сумма: "+summ);
        
        
        System.err.println("Пузырьковая сортировка:");    
        new RandomInitializer().initialize(array);
        print(array);
        new BubbleSort().sort(array);
        print(array); 
        
        System.err.println("Сортировка выбором:");   
        new RandomInitializer().initialize(array);
        print(array);
        new SelectionSort().sort(array);
        print(array);
        
        System.err.println("Сортировка Шелла:");   
        new RandomInitializer().initialize(array);
        print(array);
        new ShellSort().sort(array);
        print(array);

	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Создать массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
    }
    public static void print(int[] array){
        for(int array1: array){
            System.err.print(array1+" ");
        };
        System.err.println("");
    }
}
