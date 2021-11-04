public class ArrangeDemo1 {
    public static void main(String[] args) {

        int number[] = {4, 3, 2, 1};
        int i, j;
        for (i = 0; i < number.length; i++) {
            for (j = i + 1; j < number.length; j++) {
                if (number[j] < number[i]) {
                    int a;
                    a = number[i];
                    number[i] = number[j];
                    number[j] = a;
                }
                for (int b = 0; b < number.length; b++) {
                    System.out.print(number[b] + " ");
                }
                System.out.println("\n");
            }
        }
    }
}
