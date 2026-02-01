import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What do you want to export as?");
        System.out.println("""
                [0] PDF
                [1] Doc
                [2] Html
                """);

        int input = scan.nextInt();

        BaseDocumentExporterFactory factory = getFactory(input);
        IExport exporter = factory.createExporter();

        exporter.export("Hello world", "myFile");
    }

    public static BaseDocumentExporterFactory getFactory(int choice) {
        return switch (choice) {
            case 0 -> new PDFExporterFactory();
            case 1 -> new WordExporterFactory();
            case 2 -> new HTMLExporterFactory();
            default -> throw new IllegalArgumentException("Unknown format");
        };
    }
}