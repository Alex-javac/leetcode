package experiment.delete;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DelFilesByExtension {

  public static void main(String[] args) throws IOException {
    String home = System.getProperty("user.home");
    Path folder = Paths.get(home + "/Downloads/");
    try (Stream<Path> paths = Files.list(folder)) {
      delAllJsonFilesInFolder(paths);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void delAllJsonFilesInFolder(Stream<Path> paths) {
    paths.forEach(path -> {
      try {
        if (Files.isRegularFile(path) && path.getFileName().toString().endsWith("json")) {
          Files.deleteIfExists(path);
          System.out.println("deleted file: " + path);
        } else if (Files.isDirectory(path)) {
          delAllJsonFilesInFolder(Files.list(path));
        }
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    });
  }
}

