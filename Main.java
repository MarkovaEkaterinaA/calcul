public class Main {
    public static void main(String[] args) {
        // Тестируем Calculator
        System.out.println("Sum: " + Calculator.sum(10, 20.5));
        System.out.println("Multiply: " + Calculator.multiply(3, 4.5));
        System.out.println("Divide: " + Calculator.divide(9, 3));
        System.out.println("Subtract: " + Calculator.subtract(15, 4.5));

        // Тестируем ArrayUtils
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};
        Integer[] array3 = {4, 5, 6};
        System.out.println("Arrays equal: " + ArrayUtils.compareArrays(array1, array2)); // true
        System.out.println("Arrays equal: " + ArrayUtils.compareArrays(array1, array3)); // false

        // Тестируем Pair
        Pair<String, Integer> pair = new Pair<>("Age", 30);
        System.out.println(pair);
        System.out.println("First: " + pair.getFirst());
        System.out.println("Second: " + pair.getSecond());
    }
}
