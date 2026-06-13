public class Main {
        public static void main(String[] args) {
        
        System.out.println("--- Cliente: Funcionário ---");
        Document doc1 = new ProxyDocumento("João Silva", "funcionario");
        doc1.visualizar();  
        doc1.imprimir();     

        System.out.println("\n\n--- Cliente: Gerente ---");
        Document doc2 = new ProxyDocumento("Maria Gerente", "gerente");
        doc2.visualizar();   
        doc2.imprimir();     

        System.out.println("\n\n--- Cliente: Visitante ---");
        Document doc3 = new ProxyDocumento("Pedro Visitante", "visitante");
        doc3.visualizar();
        doc3.imprimir();    
    }
}
