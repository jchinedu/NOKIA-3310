public class PhaseOpe2 {
    public static int[] arrangeDistinctArray(int[] number) {
        int size = 0;
        for (int i = 0; i < number.length; i++) {
            int repeat = 0;
            for (int j = 0; j < i; j++) {
                if (number[i] == number[j]) {
                    repeat++;
                }
            }
            if (repeat == 0) {
                size++;
            }
        }

        int[] distinct = new int[size];
        int index = 0;
        for (int i = 0; i < number.length; i++) {
            int repeat = 0;
            for (int j = 0; j < i; j++) {
                if (number[i] == number[j]) {
                    repeat++;
                }
            }
            if (repeat == 0) {
                distinct[index] = number[i];
                index++;
            }
        }

        return distinct;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9};
        int[] result = arrangeDistinctArray(input);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
