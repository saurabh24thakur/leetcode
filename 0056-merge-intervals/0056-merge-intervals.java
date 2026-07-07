class Solution {
     public static int[][] merge(int[][] arr) {

        int n = arr.length;

        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j][0] > arr[j + 1][0]) {
                    int[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        List<List<Integer>> res = new ArrayList<>();

        res.add(new ArrayList<>(List.of(arr[0][0], arr[0][1])));

        for (int i = 1; i < n; i++) {

            if (res.get(res.size() - 1).get(1) >= arr[i][0]) {
                // overlapping case
                res.get(res.size() - 1).set(
                        1,
                        Math.max(res.get(res.size() - 1).get(1), arr[i][1])
                );
            } else {
                res.add(new ArrayList<>(List.of(arr[i][0], arr[i][1])));
            }
        }

        int[][] ans = new int[res.size()][2];

        for (int i = 0; i < res.size(); i++) {
            ans[i][0] = res.get(i).get(0);
            ans[i][1] = res.get(i).get(1);
        }

        return ans;
    }


}