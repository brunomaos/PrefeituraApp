
package Control;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno.schneider
 */
public class Edicao {
    String urlDentroDoTxt ="";
    public String escrever(String caminho, String mensagem){
        try {
            FileWriter fw = new FileWriter(caminho);
            PrintWriter pw  = new PrintWriter(fw);
            pw.println(mensagem);
            
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Edicao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Url gravada";
    }
    public String getArquivo(String caminho){
        Path arquivoTxt = Paths.get(caminho);
        try {
            byte [] texto = Files.readAllBytes(arquivoTxt);
            urlDentroDoTxt = new String(texto);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        return urlDentroDoTxt;
    }
}
