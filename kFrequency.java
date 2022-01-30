public class kFrequency {

    public int[] solution(int[] arr) {

        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            while (num > 0) {
                int digit = num % 10;
                System.out.println(digit);
                num = num / 10;
                A.add(digit);
            }
        }
        Map<Integer, Integer> elemCountMap = new HashMap<>();
        for (int num : A) {
            elemCountMap.put(num, elemCountMap.getOrDefault(num, 0) + 1);
        }
//Sort by values and pick only top k elements
        List<Integer> result = elemCountMap.entrySet().stream()
                .sorted((c1, c2) -> c2.getValue()
                        .compareTo(c1.getValue())).limit(2)
                .map(i -> i.getKey())
                .collect(Collectors.toList());
        int[] resultArr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArr[i] = result.get(i);
        }
        return resultArr;
    }


    public static void main(String[] args) {
        CodeSignal2 c = new CodeSignal2();
        int[] arr = {25, 2, 3, 57, 38, 41};
        System.out.println(Arrays.toString(c.solution(arr)));
    }
}
