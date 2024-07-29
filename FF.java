import java.util.*;

public class FF {
    // Faça um programa que adicionei e busque nomes de comidas em uma lista.
    // Nenhum nome de comida pode ter menos de 3 letras

    public static void main(String[] args) {
        List<String> comidas = new ArrayList<String>();
        boolean controle = true;

        while (controle) {
            menuFood();
            int menu = scanner("Qual a opção desejada? ").nextInt();
            if (menu == 1) {
                addFood(comidas);
            } else if (menu == 2) {
                findFood(comidas);
            } else if (menu == 0){
                controle = false;
            }
        }
    }

    public static void menuFood() {
        System.out.println("Digite a opção desejada: " +
                "\n 1 - para digitar o nome de uma comida " +
                "\n 2 - buscar comida " +
                "\n 0 - fechar");
    }

    public static void addFood(List<String> comidas) {
        String nome = scanner("Digite o nome de uma comida: ").nextLine();
        if (!comidas.contains(nome) && nome.length() > 2) {
            comidas.add(nome);
        } else {
            System.out.println("Nome inválido!");
        }
    }

    public static void findFood(List<String> comidas) {
        String nomeComida = scanner("Qual comida você busca? ").nextLine();
        for (String listaComidas : comidas){
            if (nomeComida.equalsIgnoreCase(listaComidas)) {
                int index = comidas.indexOf(listaComidas);
                String food = comidas.get(index);
                System.out.println("Temos a opção: "+food);
            }
        }
    }

    public static Scanner scanner (String message){
        System.out.println(message);
        return new Scanner(System.in);
    }

}
