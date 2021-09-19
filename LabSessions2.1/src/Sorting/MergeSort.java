package Sorting;

public class MergeSort {

    public void msort(int[] a, int left, int right) {
        int middle = (left + right) / 2;
        if (left < right) {
            msort(a, left, middle);
            msort(a, middle + 1, right);
            merge(a, left, right, middle);
        }
    }

    public void merge(int[] a, int left, int right, int middle) {

        int l = middle - left + 1;
        int r = right - middle;

        int[] leftArr = new int[l];
        int[] rightArr = new int[r];

        for (int i = 0; i < l; i++) {
            leftArr[i] = a[left + i];
        }
        for (int j = 0; j < r; j++) {
            rightArr[j] = a[middle + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < l && j < r) {
            if (leftArr[i] > rightArr[j]) {
                a[k] = leftArr[i];
                i++;
            } else {
                a[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < l) {
            a[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < r) {
            a[k] = rightArr[j];
            j++;
            k++;
        }

    }

}
