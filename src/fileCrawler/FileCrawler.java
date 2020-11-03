package fileCrawler;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCrawler {

    public static void main(String[] args) {
        File filePath = new File("./");
        System.out.println("Skriv ett ord att söka : ");
        Scanner sc2 = new Scanner(System.in);
        String searchName = sc2.nextLine();

        try
        {
            searchDirectory(filePath, searchName);
        }
        catch ( IOException e )
        {
            System.out.println(e.getMessage());
        }
    }

    static void searchDirectory (File file , String searchName ) throws IOException
    {
        if (file.isDirectory()) {
            File[] folder = file.listFiles();
            for (File files : folder) {
                searchDirectory(files, searchName);
            }
        }

        else if (file.isFile()) {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String name = searchName;
                if (name.equalsIgnoreCase(searchName)) {
                    System.out.println("ordet finns i en file med den sökväg :" + file.getAbsolutePath());
                    System.out.println("-------------------------------------");
                }
                break;
            }
        }
        else if (!file.canRead()) {
            System.out.println("Filen gå inte att läsas :" + file.getAbsolutePath());
        }

    }
}
