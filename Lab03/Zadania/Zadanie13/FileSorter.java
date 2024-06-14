import java.io.File;
import java.util.Arrays;

public class FileSorter {
    public static void main(String[] args) {

        String userHomeDirectoryPath = System.getProperty("user.home");
        File userHomeDirectory = new File(userHomeDirectoryPath);

        File[] files = userHomeDirectory.listFiles();
        if (files != null) {
            Arrays.sort(files, (file1, file2) -> {
                if (file1.isDirectory() && !file2.isDirectory()) {
                    return -1;
                } else if (!file1.isDirectory() && file2.isDirectory()) {
                    return 1;
                } else {
                    return file1.getName().compareTo(file2.getName());
                }
            });
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("No files found or unable to access the directory.");
        }
    }
}
