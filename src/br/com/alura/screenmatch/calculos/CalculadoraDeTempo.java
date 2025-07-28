package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.Titulos;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }
    public void inclui(Titulos titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
