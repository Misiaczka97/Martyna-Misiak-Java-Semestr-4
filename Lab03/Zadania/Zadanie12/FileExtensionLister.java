import java.io.File;

public class FileExtensionLister {
    public static File[] listFilesWithExtension(File directory, String extension) {
        return directory.listFiles((dir, name) -> name.endsWith(extension));
    }

    public static void main(String[] args) {

        String userHomeDirectoryPath = System.getProperty("user.home");
        File userHomeDirectory = new File(userHomeDirectoryPath);

        File[] files = listFilesWithExtension(userHomeDirectory, ".txt");
        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("No files found with the specified extension or unable to access the directory.");
        }
    }
}
