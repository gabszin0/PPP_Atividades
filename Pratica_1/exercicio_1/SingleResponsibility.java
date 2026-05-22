package Pratica_1.exercicio_1; // Alinhado com as outras classes

public class SingleResponsibility {

    public SingleResponsibility() {
       doCorrectImplementation();
    }
    
    public void doCorrectImplementation() {
        // Criando o livro com o construtor correto
        Book book = new Book("ESof", "PPP", "Comp");
        
        // Instanciando a classe correta: BookPrint
        BookPrint printer = new BookPrint();
        
        // Passando o objeto 'book' inteiro, conforme a classe Printer espera
        printer.printAuthorName(book);
    }
    
    public static void main(String[] args) {
        SingleResponsibility sr = new SingleResponsibility();
    }
        
}

