package impostos;

import java.util.Comparator;

public class criterioPorTipoDepoisPorNome implements Comparator {

    @Override
    public int compare(Object t1, Object t2) {

        if(t1.getClass().getName().compareTo(t2.getClass().getName()) == 0) {

            return t1.getClass().getName().compareTo(t2.getClass().getName());

        } else {

            return t1.getClass().getName().compareTo(t2.getClass().getName());

        }
    }
}
