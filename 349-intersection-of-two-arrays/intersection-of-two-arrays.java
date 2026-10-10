class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int[] visit = new int[nums2.length];
        int[] answer = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j] && visit[j] == 0) {

                    boolean exists = false;

                    for (int x = 0; x < k; x++) {
                        if (answer[x] == nums1[i]) {
                            exists = true;
                            break;
                        }
                    }

                    if (!exists) {
                        answer[k] = nums1[i];
                        k++;
                    }

                    visit[j] = 1;
                    break;
                }
            }
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = answer[i];
        }

        return result;
    }
}
