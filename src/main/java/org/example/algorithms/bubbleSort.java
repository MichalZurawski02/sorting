package org.example.algorithms;

final class bubbleSort extends sortAlgorithm {

    @Override
    protected void sort() {
        for (int i = this.toSort.size() - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (this.toSort.get(j) > this.toSort.get(j + 1)) {
                    this.swap(j, j + 1);
                }
            }
        }
    }
}