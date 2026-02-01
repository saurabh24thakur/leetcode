class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int p1 = 0, p2 = 0, c1 = 0, c2 = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int elem = nums[i];
            if (elem == p1) {
                c1++;
            } else if (elem == p2) {
                c2++;
            } else if (c1 == 0) {
                p1 = elem;
                c1 = 1;
            } else if (c2 == 0) {
                p2 = elem;
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }

        c1 = 0;
        c2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == p1) c1++;
            else if (nums[i] == p2) c2++;
        }

        if (c1 > nums.length / 3) list.add(p1);
        if (c2 > nums.length / 3) list.add(p2);

        return list;
    }
}