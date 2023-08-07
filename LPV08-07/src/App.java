import java.util.Random;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        int number1, number2, sum, attempt, option, bet;
        Boolean hit;
        Random generator = new Random();

        do{

            number1 = generator.nextInt(1, 7);
            number2 = generator.nextInt(1, 7);
            sum = number1 + number2;
            attempt = 3;
            hit = false;

            while(!hit && attempt > 0){

                bet = Integer.parseInt(
                    JOptionPane.showInputDialog("Insira o primeiro palpite: "));
                
                attempt--;

                if(bet == sum){
                    hit = true;
                }else{
                    JOptionPane.showMessageDialog(null, "Você errou, tentativas restantes:"+attempt);
                } 
                if(hit){
                    JOptionPane.showMessageDialog(null, "Você acertou!");
                }else if(attempt == 0){
                    JOptionPane.showMessageDialog(null,"Jogo finalizado" );
                }
            }

            option = JOptionPane.showConfirmDialog(null, "Deseja iniciar um novo jogo?");

        }while(option == 0);

    }
}
