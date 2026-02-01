public class WordExporterFactory extends BaseDocumentExporterFactory{
    @Override
    public IExport createExporter() {
        return new ExportDOCX();
    }
}
