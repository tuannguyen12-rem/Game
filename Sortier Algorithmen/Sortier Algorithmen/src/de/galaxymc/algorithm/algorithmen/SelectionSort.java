package de.galaxymc.algorithm.algorithmen;

public class SelectionSort extends SortierAlgorithmus {
    @Override
    public int[] sort() {
        int maxIndex = sorting.length - 1;
        for (int insertIndex = 0; insertIndex < maxIndex; insertIndex++, vergleiche++) {
            int positionIndex = insertIndex;
            for (int index = insertIndex + 1; index <= maxIndex; index++, vergleiche++) {
                if (sorting[index] < sorting[positionIndex]) {
                    positionIndex = index;
                }
                vergleiche++;
            }
            int temp = sorting[insertIndex];
            sorting[insertIndex] = sorting[positionIndex];
            sorting[positionIndex] = temp;
            tauschungen++;
        }
        return sorting;
    }
}
