package org.example.algorithms;

import java.util.List;

public abstract class SortAlgorithm {

    protected List<Integer> toSort;

    public void sort(List<Integer> toSort) throws InterruptedException {
        this.toSort = toSort;
        this.sort();
    }

    protected void swap(int x, int y) {
        int temp = this.toSort.get(x);
        this.toSort.set(x, this.toSort.get(y));
        this.toSort.set(y, temp);
    }
    protected abstract void sort() throws InterruptedException;

}
