package de.galaxymc.algorithm.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StatsSaver {

    public static void save(String fileName, int[] size, long[] t, long[] v) {
        File file = new File("./" + fileName + ".csv");
        if (file.exists()) file.delete();
        try {
            file.createNewFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("Größe\tVergleiche\tTauschungen\n");
            for (int i = 0; i < t.length && i < v.length && i < size.length; i++) {
                writer.write(size[i * 100] + "\t" + v[i] + "\t" + t[i] + "\n");
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}