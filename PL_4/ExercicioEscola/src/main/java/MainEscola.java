/**
 * The type Main escola.
 */
public class MainEscola {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Estudante e1 = new Estudante("Razor", 123456,123456);
        EstudanteBolseiro e2 = new EstudanteBolseiro("Ayaka", 654321,698745, 300);
        Professor p1 = new Professor("Rosaria",789456, "Assistente");
        Professor p2 = new Professor("Barbara",963852, "Adjunto");
        Professor p3 = new Professor("Jean",741852, "Coordenador");

        Pessoa[] pessoas = new Pessoa[20];
        pessoas[0] = e1;
        pessoas[1] = e2;
        pessoas[2] = p1;
        pessoas[3] = p2;
        pessoas[4] = p3;

        System.out.println("###Lista de Professores com as suas categorias###");
        for (int i = 0; i < pessoas.length; i++) {

            if(pessoas[i] != null) {

                if(pessoas[i] instanceof Professor) {

                    System.out.println("Nome: " + pessoas[i].getNome() + " | Categoria: " + ((Professor) pessoas[i]).getCategoria());
                }
            }
        }

        System.out.println();

        System.out.println("### Lista de Alunos que não são bolseiros###");
        for (int i = 0; i < pessoas.length; i++) {

            if(pessoas[i] != null && (pessoas[i].getClass() == Estudante.class))  {

                    System.out.println(pessoas[i].getNome());

            }
        }

        System.out.println();

        System.out.println("### Lista de Professores com os seus respetivos vencimentos ###");

        for (int i = 0; i < pessoas.length; i++) {

            if(pessoas[i] != null && (pessoas[i] instanceof Professor)) {

                System.out.println("Nome: " + pessoas[i].getNome() + " Vencimento: " +  ((Professor) pessoas[i]).calcularPagamento());

            }
        }

        System.out.println();

        System.out.println("### Lista de alunos bolseiros ###");

        for (int i = 0; i < pessoas.length; i++) {

            if(pessoas[i] != null && (pessoas[i] instanceof EstudanteBolseiro)) {

                System.out.println("Nome: " + pessoas[i].getNome() + " Bolsa: " +  ((EstudanteBolseiro) pessoas[i]).calcularPagamento());

            }
        }

        System.out.println();






    }
}
