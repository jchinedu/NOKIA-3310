public class Index1 {
    public static boolean indexCharacter(String numbers) {
        int[] counts = new int[10];

        for (int i = 0; i < numbers.length(); i++) {
            char ch = numbers.charAt(i);
            int digit = Character.getNumericValue(ch);
            counts[digit]++;
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (counts[i] != i) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(indexCharacter("030"));
        System.out.println(indexCharacter("1210"));
    }
}
