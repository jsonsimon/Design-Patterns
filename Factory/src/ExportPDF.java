public class ExportPDF implements IExport {
    @Override
    public void export(String content, String filename) {
        System.out.println(
                "[PDF Export] Compressing content... " +
                        "Writing to: " + filename + getFileExtension() +
                        " | Format: Portable Document Format"
        );

        System.out.println("Content: " + content);
    }

    @Override
    public String getFormatName() {

        return "PDF";
    }

    @Override
    public String getFileExtension() {
        return ".pdf";
    }
}
