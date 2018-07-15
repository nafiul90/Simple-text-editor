/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleeditor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

/**
 *
 * @author nafiul
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextArea textArea;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void openFileAction(ActionEvent event) throws FileNotFoundException {
        
        FileChooser fileChooser=new FileChooser();
        File file=fileChooser.showOpenDialog(null);
        
        
        
        Scanner sc=new Scanner(file);
        
        String str="";
        while(sc.hasNext()){
            str+=sc.nextLine()+"\n";
        }
        
        textArea.setText(str);
        
        
    }

    @FXML
    private void saveFileAction(ActionEvent event) throws IOException {
        
        FileChooser fileChooser=new FileChooser();
        File file=fileChooser.showSaveDialog(null);
        
        
        
        String str=textArea.getText();
        FileWriter fileWriter =new FileWriter(file);
        fileWriter.write(str);
        fileWriter.close();
        
    }
    
}
