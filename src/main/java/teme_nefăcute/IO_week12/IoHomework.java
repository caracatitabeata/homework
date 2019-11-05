package teme_nefăcute.IO_week12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.nio.file.attribute.FileTime;
import java.util.ArrayList;
import java.util.List;

public class IoHomework {

    List<Path> listAllNames(String folder) {
        Path path = Paths.get(folder);
        List<Path> l = new ArrayList<>();
        try {
            Files.walk(path).forEach(name -> l.add(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return l;
    }

    List<Path> getFilesByExtension(String folder, String extension) {
        Path path = Paths.get(folder);
        List<Path> list = new ArrayList<>();
        try {
            Files.walk(path).filter(p -> p.toString().startsWith(extension)).forEach(name -> list.add(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    boolean checkIfExists(String folder) {
        Path path = Paths.get(folder);
        return Files.exists(path);
    }

    boolean checkReadAndWritePermission(String folder) {
        Path path = Paths.get(folder);
        return Files.isReadable(path) && Files.isWritable(path);
    }

    boolean checkIfRegularFileOrDirectory(String pathName) {
        Path p = Paths.get(pathName);
        return Files.isRegularFile(p) && Files.isDirectory(p);
    }

    boolean checkLexicographically(Path path1, Path path2) {
        return path1.toString().compareTo(path2.toString()) == 0;
    }

    FileTime getLastModified(String pathName) throws IOException {
        Path path = Paths.get(pathName);
        return Files.getLastModifiedTime(path);
    }

    Long getFileSizeInMb(String pathName) throws IOException {
        Path path = Paths.get(pathName);
        return Files.size(path) / 1024;
    }

    byte[] inByteArray(String pathName) throws IOException {
        Path p = Paths.get(pathName);
        return Files.readAllBytes(p);
    }

    List<String> readLineByLine(String pathName) throws IOException {
        Path p = Paths.get(pathName);
        return Files.readAllLines(p);
    }

    void readAndWriteFirst3Lines(String source, String target) throws IOException {
        Path sourcePath = Paths.get(source);
        Path targetPath = Paths.get(target);
        try (BufferedWriter writer = Files.newBufferedWriter(targetPath, StandardOpenOption.APPEND);
             BufferedReader reader = Files.newBufferedReader(sourcePath)) {
            String currentLine;
            int i = 0;
            while ((currentLine = reader.readLine()) != null) {
                writer.write(currentLine);
                i++;
                if (i == 3) break;
            }
        }
    }

    String findLongestWord(String pathName) throws IOException {
        Path p = Paths.get(pathName);
        List<String> text = Files.readAllLines(p);
        String max = null;
        for (String word: text){
            String[] splited = word.split("\\s+");
            String after = "";
            for (String split : splited){
                if (split.length()>after.length())
                    max = split;
                after = split;
            }
        }
        return max;
    }

    //niște teste - știu, trebuia să fac unit tests...
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("src\\main\\java\\teme_nefăcute.Java8_week11.IO_week12\\bla.txt").toAbsolutePath();
        byte[] b = new IoHomework().inByteArray(p.toString());
        System.out.println(b[1] + " " + b[10]);

        byte [] b1 = new byte[] {10, 114};
        String s = new String(b1);
        System.out.println(s);
        System.out.println(Charset.defaultCharset());

        new IoHomework().readAndWriteFirst3Lines(p.toString(), p.toString());
        System.out.println(new IoHomework().findLongestWord(p.toString()));
    }
}
