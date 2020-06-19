package de.galaxymc.algorithm.algorithmen;

public class BubbleSort extends SortierAlgorithmus {
    @Override
    public int[] sort() {
        for (int i = 1; i < sorting.length; i++, vergleiche++) {
            boolean swapped = false;
            for (int j = 0; j < sorting.length - i; j++, vergleiche++) {
                if (sorting[j] > sorting[j + 1]) {
                    int temp = sorting[j];
                    sorting[j] = sorting[j + 1];
                    sorting[j + 1] = temp;
                    tauschungen++;
                    swapped = true;
                }
                vergleiche++;
            }
            if (!swapped) return sorting;
        }
        return sorting;
    }
}
