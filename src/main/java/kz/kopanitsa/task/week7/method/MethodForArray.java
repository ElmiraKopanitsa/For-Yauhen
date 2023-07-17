package kz.kopanitsa.task.week7.method;

public class MethodForArray {
    public void printCountEvenNumbers (int[] arr) {
        int count = 0;
        for (int number : arr) {
            if (number % 2 == 0) {
                count++;
            }
        }
        System.out.println("Количество четных чисел в массиве равно - " + count +".");
    }

    public void printCountOddNumbers (int[] arr) {
        int count = 0;
        for (int number : arr) {
            if (number % 2 != 0) {
                count++;
            }
        }
        System.out.println("Количество нечетных чисел в массиве равно - " + count +".");
    }

    public void printCountSimpleNumbers (int[] arr) {
        int count = 0;
        for (int number : arr) {
            if (isPrime(number)) {
                count++;
            }
        }
        System.out.println("Количество простых чисел в массиве равно - " + count +".");
    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return true;
        }
        if (number < 0) {
            return false;
        }

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void printSumNumbers (int[] arr) {
        int count = 0;
        for (int number : arr) {
            count += number;
        }
        System.out.println("Сумма всех чисел массива равна - " + count + ".");
    }

    public void printOddIndexNumbersSubtractionEvenIndexNumber (int[] arr){
        int count = 0;
        int sumOddIndexNumber = 0;
        int sumEvenIndexNumber = 0;
        for (int index = 0; index <= arr.length - 1; index += 2) {
            sumOddIndexNumber += arr[index];
        }
        for (int index = 1; index <= arr.length - 1; index += 2) {
            sumEvenIndexNumber += arr[index];
        }
        count = sumOddIndexNumber - sumEvenIndexNumber;
        System.out.println("Разность между суммой чисел имеющих четный индекс и суммой чисел имеющих нечетный индекс в массиве равна - " + count + ".");
    }

    public void printCountZeroNumbers (int[] arr) {
        int count = 0;
        for (int number : arr) {
            if (number == 0) {
                count++;
            }
        }
        System.out.println("Количество 0 в массиве равно - " + count + ".");
    }
}
