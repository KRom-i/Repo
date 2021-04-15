import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class testFind {

    private static ArrayList<String> fileDO;
    private static ArrayList<String> filePOS;


    public static void main(String[] args){

        try {

            fileDO = new ArrayList<>();

            FileReader fileReader = new FileReader("DO.TXT");
            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNextLine()) {

                fileDO.add(scanner.nextLine());

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



        try {

            filePOS = new ArrayList<>();
            FileReader fileReader = new FileReader("POS.TXT");

            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNextLine()) {

                filePOS.add(scanner.nextLine());

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        for (int i = 0; i < filePOS.size(); i++) {

            if (!fileDO.contains(filePOS.get(i))){
                System.out.println(filePOS.get(i));
            }

        }

        System.out.println("__________________________________________________________");

        for (int i = 0; i < fileDO.size(); i++) {

            if (!filePOS.contains(fileDO.get(i))){
                System.out.println(fileDO.get(i));
            }

        }
//        System.out.println(fileDO);
//        System.out.println(filePOS);
    }

}













