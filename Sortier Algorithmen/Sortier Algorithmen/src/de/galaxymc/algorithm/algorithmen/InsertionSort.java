package de.galaxymc.algorithm.algorithmen;

public class InsertionSort extends SortierAlgorithmus {

    @Override
    public int[] sort() {
        for (int i = 0; i < sorting.length; i++, vergleiche++) {
            int value = sorting[i];
            int index;
            for (index = i; index > 0 && sorting[index - 1] > value; index--, vergleiche++) {
                sorting[index] = sorting[index - 1];
                tauschungen++;
            }
            sorting[index] = value;
            tauschungen++;
        }
        return sorting;
    }
}
