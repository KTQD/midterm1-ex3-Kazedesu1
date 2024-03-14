import java.io.*;


public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader fin = new BufferedReader(new FileReader("input.txt"));
            StringBuilder str = new StringBuilder();
            String line;
                while ((line = fin.readLine()) != null) {
                    str.append(line).append("\n");
                }
            fin.close();

            String replacedContent = str.toString().replaceAll("Nha Trang", "Vũng Tàu");
            BufferedWriter fout = new BufferedWriter(new FileWriter("output.txt"));
            fout.write(replacedContent);
            fout.close();
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
    }
}
