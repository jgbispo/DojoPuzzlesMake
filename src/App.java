public class App {

    public static void jokepo(int v1, int v2) {
        if (v1 == v2) {
            System.out.println("empate");
        }

        if (v1 > 3 || v2 > 3 || v1 <= 0 || v2 <= 0) {
            System.out.println("Somente valores de 1 à 3");
        }

        if (v1 == 1) {
            if (v2 == 2) {
                System.out.println("Jogador 1 ganhou!");
            }
            if (v2 == 3) {
                System.out.println("Jogador 2 ganhou!");
            }
        }
        if (v1 == 2) {
            if (v2 == 3) {
                System.out.println("Jogador 1 ganhou!");
            }
            if (v2 == 1) {
                System.out.println("Jogador 2 ganhou!");
            }
        }
        if (v1 == 3) {
            if (v2 == 1) {
                System.out.println("Jogador 1 ganhou!");
            }
            if (v2 == 2) {
                System.out.println("Jogador 2 ganhou!");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        /*
         * 1 - tesoura 2 - papel 3 - pedra
         */

        jokepo(1, 2); // jogador 1 vence
        jokepo(2, 1); // jogador 2 vence
        jokepo(3, 1); // jogador 1 vence
        jokepo(3, 2); // jogador 2 vence
        jokepo(3, 3); // empate
    }
}
