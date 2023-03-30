import java.util.Comparator;

public class criterioPorOrdemAlfabetica implements Comparator<Trabalhador> {

    @Override
    public int compare(Trabalhador t1, Trabalhador t2) {
        return t1.getNome().compareToIgnoreCase(t2.getNome());
    }
}
