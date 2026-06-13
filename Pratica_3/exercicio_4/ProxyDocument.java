class ProxyDocumento implements Document {
// Este é o intermediário - controla acesso ao documento real

    private DocumentoConfidencial documentoReal;
    private String usuarioLogado;
    private String nivelAcesso; // "gerente" ou "funcionario"

    public ProxyDocumento(String usuario, String nivel) {
        this.usuarioLogado = usuario;
        this.nivelAcesso = nivel;
        // Nota: o documento real é criado AQUI (lazy loading)
        this.documentoReal = new DocumentoConfidencial("Relatório Financeiro 2026");

    }

    // O proxy verifica permissões ANTES de chamar o objeto real
    @Override
    public void visualizar() {
       
        if (temPermissao("visualizar")) {
            System.out.println(" Permissão concedida!");
            documentoReal.visualizar(); // Chama o objeto REAL
        } else {
            System.out.println(" Acesso negado! Você não tem permissão.");
        }
    }

        @Override
        public void imprimir() {
        if (temPermissao("imprimir")) {
            System.out.println("Permissão concedida!");
            documentoReal.imprimir(); // Chama o objeto REAL
        } else {
            System.out.println(" Acesso negado! Apenas gerentes podem imprimir.");
        }
    }

        // Lógica de controle de acesso
    private boolean temPermissao(String acao) {
        if (acao.equals("visualizar")) {
            return nivelAcesso.equals("gerente") || nivelAcesso.equals("funcionario");
        }
        if (acao.equals("imprimir")) {
            return nivelAcesso.equals("gerente"); // Só gerente pode imprimir
        }
        return false;
    }

}