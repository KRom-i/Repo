package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


public class Controller implements Initializable{


    @FXML
    public Button btnNew;

    @FXML
    public VBox clintInfo;
    public Button btnInfo;
    public TextField textFieldInfo;
    public HBox boxRed;

    @FXML
    private TextField textField;

    @FXML
    private TextField textField1;

    @FXML
    private TextField textField2;

    @FXML
    private TextField textField3;

    @FXML
    private ListView<String> textArea;

    @FXML
    private String str = "";

    private ArrayList<String> arrayList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        arrayList = new ArrayList<>();

        try {

            FileReader fileReader = new FileReader("name.txt");
            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNextLine()){

                arrayList.add(scanner.nextLine());

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void rollUp(ActionEvent actionEvent){


    }

    public void chatExit(ActionEvent actionEvent) {

        textArea.getItems().clear();

        System.exit(0);
    }


    public void methed2(KeyEvent keyEvent) {

        if (!textField.getText().equals("")){

            if (!str.equals(textField.getText())){

                textArea.setVisible(true);
                textArea.setManaged(true);

                btnNew.setVisible(true);
                btnNew.setManaged(true);

                textArea.getItems().clear();

                str = textField.getText();

                String strFind = str.toUpperCase(Locale.ROOT);

                String[] stringsFind = strFind.split(" ");

                for (int i = 0; i < arrayList.size(); i++) {

                    String strPrint = arrayList.get(i);

                    String[] strings = strPrint.split(" ");


                    if (stringsFind.length == 1){

                        for (int j = 0; j < strings.length; j++) {
                            if (strings[j].startsWith(stringsFind[0])){
                                textArea.getItems().add(strPrint);
                                break;
                            }
                        }

                    } else {

                        int find = 0;

                        for (int j = 0; j < strings.length; j++) {

                            for (int k = 0; k < stringsFind.length; k++) {
                                if(strings[j].startsWith(stringsFind[k])){
                                    find++;
                                }
                            }
                        }

                        if (find == stringsFind.length ){
                            textArea.getItems().add(strPrint);
                        }

                    }

                }

            }
        } else {

            textArea.setVisible(false);
            textArea.setManaged(false);
            setVisible(textField1, false);
            setVisible(textField2, false);
            setVisible(textField3, false);
            btnNew.setVisible(false);
            btnNew.setManaged(false);
            clintInfo.setVisible(false);
            clintInfo.setManaged(false);

        }

    }

    public void selectClient(MouseEvent mouseEvent) {

        if (mouseEvent.getClickCount() == 2) {

            test();

        }

    }

    public void test(){

        textField.clear();
        textField1.clear();
        textField2.clear();
        textField3.clear();

        String str = textArea.getSelectionModel().getSelectedItem();

        textField.setText(str);

        String[] strings = str.split(" ");

        for (int i = 0; i < strings.length; i++) {

            switch (i){

                case 0: setVisible(textField1, true);
                        textField1.setText(strings[i]);
                        break;

                case 1: setVisible(textField2, true);
                        textField2.setText(strings[i]);
                        break;

                case 2: setVisible(textField3, true);
                        textField3.setText(strings[i]);
                        break;

                case 3: clintInfo.setVisible(true);
                    clintInfo.setManaged(true);
                    textFieldInfo.setText(strings[i]);
                    break;
            }

        }

        textArea.setVisible(false);
        textArea.setManaged(false);
    }

    public void setVisible(TextField textField, Boolean bln){
        textField.setVisible(bln);
        textField.setManaged(bln);
    }

    public void methed3() {

        textArea.setVisible(false);
        textArea.setManaged(false);
        textField.clear();
        setVisible(textField1, false);
        setVisible(textField2, false);
        setVisible(textField3, false);
        btnNew.setVisible(false);
        btnNew.setManaged(false);
        clintInfo.setVisible(false);
        clintInfo.setManaged(false);

    }

    public void incrBtn(ActionEvent actionEvent) {

        int x = Integer.parseInt(textFieldInfo.getText());
        textFieldInfo.clear();
        int newInt = x - 1;

        if (x <= 0){
            clintInfo.setVisible(false);
            clintInfo.setManaged(false);
        } else {
            textFieldInfo.setText(""+ newInt);
            boxRed.setStyle("-fx-background-color: #eedd22;");
        }

        new Thread(() ->{
            try {
                Thread.sleep(100);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            boxRed.setStyle("-fx-background-color: #808080;");
        }).start();

    }
}
