public class BooleanArray {

    public static boolean[] solution(int[] a, int l, int r) {
        boolean[] b = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            int k = 0;
            for (int x = l; x <= r; x++) {
                if (a[i] == (i + 1) * x) {
                    b[i] = true;
                }
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int[] arr = {100};
        System.out.println(Arrays.toString(solution(arr, 1, 1000)));
    }
}
