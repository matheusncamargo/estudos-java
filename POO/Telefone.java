package Aula_07;

public class Telefone {
    //String (ao invés de int) para formatar possíveis saídas no sistema
    public TelefoneTipo tipo;
    public String ddi;
    public String ddd;
    public String numero;

    public Telefone(TelefoneTipo tipo, String ddi, String ddd, String numero){
        this.tipo = tipo;
        this.ddi = ddi;
        this.ddd = ddd;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return String.format(
                """
                        Tipo: %s\s
                        DDI: %s\s
                        DDD: %s\s
                        Numero: %s\s
                        """, tipo, ddi, ddd, numero
        );
    }
}
