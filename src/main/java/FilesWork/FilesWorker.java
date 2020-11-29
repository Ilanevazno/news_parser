package FilesWork;

import java.io.*;

public class FilesWorker {
    private static String FileName = "lastNews.txt";

    public static void main(String[] args) {
        System.out.println("test 0");
    }

    public static void createFile(String lastNew) {
        try (FileWriter writer = new FileWriter(FileName, false)) {
            writer.write(lastNew);
            writer.flush();
            System.out.println("file was written!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void checkLastNews(String lastNew) {
        try (FileReader reader = new FileReader(FileName)) {
            BufferedReader buffReader = new BufferedReader(reader);
            String line = buffReader.readLine();

            if (line.equals(lastNew)) System.out.println("match last news found!");
            else createFile(lastNew);
        } catch (FileNotFoundException e) {
            // Если отсутствует файл с последней новостью, тогда создаём новый
            createFile(lastNew);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
