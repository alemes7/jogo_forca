import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] palavras = {
                "ARROZ", "FEIJÃO", "CARNE", "FRANGO", "PEIXE", "SOPA", "MASSA", "PÃO", "QUEIJO", "LEITE",
                "OVOS", "SALADA", "PIZZA", "HAMBÚRGUER", "BATATA", "MACARRÃO", "SUSHI", "CEREAL", "CHOCOLATE", "CAFÉ",
                "CHÁ", "BOLACHA", "BISCOITO", "CREME", "SORVETE", "IOGURTE", "SUCO", "VITAMINA", "TORTA", "SANDUÍCHE",
                "DONUT", "PANQUECA", "WAFFLE", "MANTEIGA", "GELEIA", "KETCHUP", "MUSTARDA", "CATCHUP", "PICLES", "PIPOCA",
                "AMENDOIM", "AVELÃ", "NOZ", "CASTANHA", "PISTACHE", "AMÊNDOA", "CAJU", "COCO", "ABACAXI", "PÊSSEGO"
        };


        Forca_A jogo = new Forca_A();
        JOptionPane.showMessageDialog(null,"Bem vindo ao jogo da forca");
        boolean y = true;
        while (y == true) {
            int indice = jogo.palavra();
            StringBuilder Tentativa = new StringBuilder();
            for (int i = 0; i < palavras[indice].length(); i++) {
                Tentativa.append("_");
            }
            int menu = Integer.parseInt(JOptionPane.showInputDialog("Qual deseja: \n[1]Jogar \n[2]Sair"));
            switch (menu) {
                case 1:
                    int cont = 0;
                    boolean x = true;
                    while (x == true) {
                        cont++;
                        if (cont <= 7) {
                            String letra = JOptionPane.showInputDialog("Digite a letra desejada:").toUpperCase();
                            char letra2 = letra.charAt(0);

                            for (int i = 0; i < palavras[indice].length(); i++) {
                                if (palavras[indice].charAt(i) == letra2) {
                                    Tentativa.setCharAt(i, letra2);
                                    if (cont >= 0){
                                        cont--;
                                    }
                                }
                            }

                            JOptionPane.showMessageDialog(null, Tentativa);
                            if (Tentativa.indexOf("_") == -1) {
                                JOptionPane.showMessageDialog(null, "Parabéns você ganhou");
                                x = false;
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Infelizmente você perdeu, tente novamente!");
                            x = false;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"A palavra era " + palavras[indice]);
                    break;
                case 2:
                    y = false;
                    break;
            }
        }
    }
}