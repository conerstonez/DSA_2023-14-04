import java.util.*;

public class ProblemSolving {
    public String greet() {
        return "Hello World";
    }

    public static int secondLargestNumber(int... numbers) {
        ArrayList<Integer> arr = new ArrayList<>();
        int max = 0;
        int count = 1;
        for (int number : numbers) {
            arr.add(number);
        }
        while (count < 2) {
            for (Integer integer : arr) {
                max = Math.max(max, integer);
            }
            arr.remove(max);
            count++;
        }
        return max;
    }

    public static void printLetters(String word) {
        int index = 0;
        while (index < word.length()) {
            System.out.println(word.charAt(index));
            index++;
        }
    }

    public static void twoLettersALine(String word) {
        int index = 0;
        while (index < word.length()) {
            if (index % 2 == 0) System.out.print(word.charAt(index));
            else System.out.println(word.charAt(index));
            index++;
        }
    }

    public static String characterCount(String word, char letter1, char letter2) {
        int letter1Count = 0;
        int letter2Count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (letter1 == word.charAt(i)) letter1Count++;
            else if (letter2 == word.charAt(i)) letter2Count++;
        }
        return String.format("%s -> %d\n%s -> %d", letter1, letter1Count, letter2, letter2Count);
    }

    public static int multipleOfThreeSum(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0) sum += number;
        }
        return sum;
    }

    public static String guessDate(int date) {
        Scanner sc = new Scanner(System.in);
        boolean notGuessed = true;
        int trials = 0;
        while (notGuessed) {
            System.out.print("What is my birth date : ");
            int guess = sc.nextInt();
            if (guess == date) notGuessed = false;
            else return "Incorrect guess";
        }
        return "Correct guess";
    }

    public static HashMap<Integer, String> piCalculator(int steps){
        float numerator = 4;
        float denominator = 1;
        float pi = 0;
        HashMap<Integer, String> piDict = new HashMap<Integer, String>();
        for (int step = 0; step < steps; step++) {
            if (step % 2 == 0) pi += numerator/denominator;
            else pi -= numerator/denominator;

            piDict.put(step, String.format("%.5f", pi));
            if (piDict.containsValue("3.14159")) break;
            denominator += 2;
            }
        return piDict;
    }


//todo
    public static int binaryToDecimal(String binaryNumber) {
        int decimalNumber = 0;
        int exp = 0;
        for (int i = binaryNumber.length(); i != 0; i--){
            int number = (int) binaryNumber.charAt(i-1);
            System.out.println(binaryNumber.charAt(i-1));
//            System.out.println(number);
            decimalNumber += number * Math.pow(2, exp);
//            System.out.println(decimalNumber);
            exp++;
        }
        return decimalNumber;
    }


    private static ArrayList<Integer> listSort(ArrayList<Integer> param) {
        ArrayList<Integer> new_list = new ArrayList<>();
        while (!param.isEmpty()) {
            int min = param.get(0);
            for (Integer integer : param) {
                min = (Math.min(min, integer));
            }
            new_list.add(min);
            param.remove(Integer.valueOf(min));
        }
        return new_list;
    }

    public static ArrayList<Integer> mergeSortedList(int [] arr1, int [] arr2) {
        ArrayList<Integer> param = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            param.add(arr1[i]);
            param.add(arr2[i]);
        }
        return listSort(param);
    }

    public static ArrayList<Integer> elementProduct(int [] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int index = 0;
        while (index < arr.length) {
            int product = 1;
            for (int element : arr) {
                if (element != arr[index]) product *= element;
            }
            result.add(product);
            index++;
        }
        return result;
    }

//    todo
    public static int findFirstUnique(int [] arr) {
        return 0;
    }

    public static ArrayList<Integer> rotateArray(int [] arr) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(arr[arr.length - 1]);
        for (int i = 0; i < arr.length - 1; i++) {
            result.add(arr[i]);
        }
        return result;
    }

    public static ArrayList<Integer> rearrange(int[] arr) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int element : arr) {
            if (element < 0) result.add(element);
        }
        for (int element : arr) {
            if (element > 0) result.add(element);
        }
        return result;
    }
}

