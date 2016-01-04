package Sorting;

public class Sorting {

    public static void main(String[] args) {

        Integer[] array = {1, 23, 9, 89, 23, 34, 25, 12};

        ShellSort.sort(array);

        for (int element : array){
            System.out.print(element + " ");
        }
    }

}
