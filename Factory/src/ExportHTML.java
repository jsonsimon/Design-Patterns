public class ExportHTML implements IExport {
    @Override
    public void export(String content, String filename) {
        System.out.println(
                "[HTML Export] Compressing content... " +
                        "Writing to: " + filename + getFileExtension() +
                        " | Format: Portable Document Format"
        );

        System.out.println("Content: " + content);

    }


    @Override
    public String getFormatName() {

        return "html";
    }

    @Override
    public String getFileExtension() {
        return ".html";
    }
}
