class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int[] result = new int[n1 + n2];

        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            result[k++] = (nums1[i] < nums2[j]) ? nums1[i++] : nums2[j++];
        }

        if (i == n1) {
            while (j < n2) result[k++] = nums2[j++];
        } else if (j == n2) {
            while (i < n1) result[k++] = nums1[i++];
        }

        int mid = (n1 + n2) / 2;
        return ((n1 + n2) % 2 == 0) ? (result[mid-1] + result[mid]) / 2.0 : result[mid];
    }
}