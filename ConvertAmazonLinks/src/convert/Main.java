package convert;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import convert.ConvertLink;

public class Main {
	public static void main(String[] args) {
		String ultimoTexto = "";
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		
		System.out.println("Monitorando clipboard... (Ctrl+C para sair)\\n");

		
		while (true) {
			try {
				String textoAtual = (String) clipboard.getData(DataFlavor.stringFlavor);

                if (!textoAtual.equals(ultimoTexto) && textoAtual.contains("amazon.com.br")) {
                    ultimoTexto = textoAtual;
                    ConvertLink conv = new ConvertLink(textoAtual);
                    String convertido = conv.convert();
                    
                    clipboard.setContents(new StringSelection(convertido), null);

                    System.out.println("Convertido: " + convertido);
                    System.out.println("-----------------------------");
                }
                Thread.sleep(500);
			} catch (Exception e) {
                // ignora clipboard com imagem ou conteúdo não-texto
            }
		}

	}
}
// outro while true
//Scanner sc = new Scanner(System.in);
//System.out.println("\n\nCole o link: ");
//String link = sc.nextLine();
//
//ConvertLink conv = new ConvertLink(link);
//String linkConvertido = conv.convert();
//
//System.out.println("\nLink convertido:");
//System.out.println(linkConvertido);