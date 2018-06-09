package factory;

public enum DocumentType {
    TXT(".txt"), XML(".xml"), HTML(".html");

    private String documentType;

    DocumentType(String docType) {
        this.documentType = docType;
    }

    public String getDocumentType() {
        return documentType;
    }
}
