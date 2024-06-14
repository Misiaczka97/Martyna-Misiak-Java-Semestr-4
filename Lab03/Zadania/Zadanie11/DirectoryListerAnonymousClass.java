import java.io.File;
import java.io.FileFilter;

public class DirectoryListerAnonymousClass {
    public static File[] listSubdirectories(File directory) {
        return directory.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isDirectory();
            }
        });
    }

    public static void main(String[] args) {

        String userHomeDirectoryPath = System.getProperty("user.home");
        File userHomeDirectory = new File(userHomeDirectoryPath);

        File[] subdirectories = listSubdirectories(userHomeDirectory);
        if (subdirectories != null) {
            for (File subdirectory : subdirectories) {
                System.out.println(subdirectory.getName());
            }
        } else {
            System.out.println("No subdirectories found or unable to access the directory.");
        }
    }
}
