package factory;

public class DocumentFactory {
    public Document createDocument(String text, DocumentType documentType) {
        switch (documentType) {
            case TXT:
                return new TxtDocument(text, documentType);
            case HTML:
                return new HtmlDocument(text,documentType);
            default:
                return null;

        }
    }
}
