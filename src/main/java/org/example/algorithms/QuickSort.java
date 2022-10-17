package org.example.algorithms;

public class QuickSort extends SortAlgorithm {

    @Override
    protected void sort() {
        this.quicksort(0, this.toSort.size() - 1);
    }

    private void quicksort(int low, int high) {
        int i = low;
        int j = high;
        int pivot = this.toSort.get(low + (high - low) / 2);

        while (i <= j) {
            while (this.toSort.get(i) < pivot) {
                i++;
            }

            while (this.toSort.get(j) > pivot) {
                j--;
            }

            if (i <= j) {
                i++;
                j--;
            }
        }

        if (low < j) {
            this.quicksort(low, j);
        }

        if (i < high) {
            this.quicksort(i, high);
        }
    }

}