package de.galaxymc.algorithm.algorithmen;

public abstract class SortierAlgorithmus {

    protected int tauschungen = 0;
    protected int vergleiche = 0;

    protected int[] sorting;

    public abstract int[] sort();

    public void setSorting(int[] sorting) {
        this.sorting = sorting;
    }

    public int getTauschungen() {
        return tauschungen;
    }

    public int getVergleiche() {
        return vergleiche;
    }

    public int[] getSorting() {
        return sorting;
    }

    public void reset() {
        tauschungen = 0;
        vergleiche = 0;
    }

}
