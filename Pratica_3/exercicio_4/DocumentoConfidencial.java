class DocumentoConfidencial implements Document {
// Este é o objeto "base" - o documento confidencial

    private String conteudo;

    public DocumentoConfidencial(String conteudo) {
        this.conteudo = conteudo;
        System.out.println("Documento criado: " + conteudo);
    }

    @Override
    public void visualizar() {
        System.out.println("Visualizando: " + conteudo);
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo: " + conteudo);
    }

}