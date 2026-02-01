public interface IExport {
    void export(String content, String filename);
    String getFormatName();
    String getFileExtension();
}
