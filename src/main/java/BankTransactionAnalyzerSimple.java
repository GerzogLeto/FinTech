import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BankTransactionAnalyzerSimple {
    private static final String RESOURCES = "./transactions/";

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(RESOURCES + args[0]);
        List<String> lines = Files.readAllLines(path);
        double total = 0d;
        for (String line : lines) {
            final String[] columns = line.split(",");
            final double amount = Double.parseDouble(columns[1]);
            total += amount;
        }
        System.out.println("The total for all transactions is " + total);
    }
}
