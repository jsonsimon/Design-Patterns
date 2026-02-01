public class ExportDOCX implements IExport {
    @Override
    public void export(String content, String filename) {
        System.out.println(
                "[DOCX Export] Compressing content... " +
                        "Writing to: " + filename + getFileExtension() +
                        " | Format: Portable Document Format"
        );

        System.out.println("Content: " + content);

    }

    @Override
    public String getFormatName() {

        return "docs";
    }

    @Override
    public String getFileExtension() {
        return ".docx";
    }
}
