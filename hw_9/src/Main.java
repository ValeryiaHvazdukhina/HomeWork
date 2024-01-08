import java.io.*;

public class Main {
    private static final String RESULT_FILE = "result.txt";

    public static void main(String[] args) {
        File dir = new File("/Users/vhvozdukhina/IdeaProjects/hw_9");
        String result = ""; //StringBuilder
        StringBuilder sb = new StringBuilder();
        if (dir.isDirectory()) {
            for (File item : dir.listFiles()) {
                if (item.getName().endsWith(".txt") && !item.getName().equals(RESULT_FILE))
                    try {
                        BufferedReader fin = new BufferedReader(new FileReader(item));
                        String temp;
                        while ((temp = fin.readLine()) != null) {
                            sb.append(temp + " ");
                        }
                        fin.close();
                        System.out.println("File " + item.getName() + " has been read");
                        result = String.valueOf(sb);
                    } catch (IOException ex) {

                        System.out.println(ex.getMessage());
                    }
            }
        }

        if (!result.isEmpty()) {
            try {
                BufferedWriter fos = new BufferedWriter(new FileWriter(RESULT_FILE));
                fos.write(result);
                fos.close();
                System.out.println("File has been written");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}