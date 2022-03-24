import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class TesteSpam {

    public static void main(String[] args) throws AWTException, InterruptedException {
        int x = 1;

        Robot robot = new Robot();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Texto:");
        String Text = scanner.nextLine();

        StringSelection stringSelection = new StringSelection(Text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        System.out.println("O envio automatico vai começar em 5 segundos");
        Thread.sleep(5000);
		//alterar esta propriedade para a quantidade de mensagens desejada.
        while(x <= 10) {

            Thread.sleep(1000);

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            x++;

        }

    }

}