package Docs;

public interface Imprimible {

    //Es STATIC.
    static void imprimirDocumento(Documento documento){
        documento.imprimir();
    };

    void imprimirTipoDoc();
}

