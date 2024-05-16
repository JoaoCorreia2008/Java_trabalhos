
import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 360;//Dimenções da janela
        int boardHeight = 640;//Dimenções da janela 

        JFrame frame = new JFrame("Flappy Bird");// Aqui pomos o titulo 
        // frame.setVisible(true);
		frame.setSize(boardWidth, boardHeight);//aqui é para o tamanho da janela  
        frame.setLocationRelativeTo(null);//aqui é para centralizar a tela
        frame.setResizable(false);// aqui é para o utilizador não mexer no tamanho da janela 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// aqui é para fechar e volta para o terminal quando clicarmos no X

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}
