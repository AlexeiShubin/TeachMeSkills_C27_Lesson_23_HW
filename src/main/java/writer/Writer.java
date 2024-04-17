package writer;

import model.Sonnet;

import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class Writer {
    public static void writer(Sonnet sonnet)
    {
        try (PrintWriter writer = new PrintWriter(sonnet.getAuthor().getFirstName() + "_" + sonnet.getAuthor().getLastName() + "_" + sonnet.getTitle() + ".txt", StandardCharsets.UTF_8)) {
            for (int i = 0; i < sonnet.getLines().size(); i++) {
                writer.println(sonnet.getLines().get(i));
            }
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }
}
