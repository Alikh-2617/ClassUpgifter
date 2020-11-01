package fileCrawler;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCrawler {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\alikh\\IdeaProjects\\classUppgift\\src\\file");
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Skriv ett ord att söka : ");
        String name = sc3.nextLine();
        try
        {
            serch_Directory(file, name);
        }
        catch ( IOException e )
        {
            System.out.println(e.getMessage());
        }


    }

    static void serch_Directory (File file , String name ) throws IOException
    {
        if (file.isDirectory()) {
            File[] folder = file.listFiles();
            for (File files : folder) {
                serch_File(files, name);
            }
        }
    }
    static void serch_File (File file , String name) throws IOException
    {
        Scanner sc = new Scanner(file);
        if (file.isFile()) {
            while (sc.hasNext()) {
                String sercher = name;
                if (sercher.equalsIgnoreCase(name)) {
                    System.out.println("ordet finns i en file med den sökväg :" + file.getAbsolutePath());
                    System.out.println("--------------------------------------");
                }
            }
            sc.close();
        } else if (!file.canRead()) {
            System.out.println("Filen gå inte att läsas :" + file.getAbsolutePath());
        }

    }
}
