import com.sun.media.jfxmedia.track.Track;
import org.omg.IOP.Encoding;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class testCP {

    public static void main(String[] args) {


        try {
            FileReader fileReader = new FileReader("name.txt");
            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNextLine()){


                String[] strings = scanner.nextLine().split(" ");

                for (int j = 0; j < strings.length; j++) {

                    String[] strings1 = strings[j].split(" *");

                    for (int i = 0; i < strings1.length; i++) {
                        if (i == 0){
                            System.out.print(strings1[i].toUpperCase());
                        } else {
                            System.out.print(strings1[i].toLowerCase());
                        }

                    }

                    if (strings.length == j + 1) {
                        System.out.print("\n");
                    } else {
                        System.out.print(" ");
                    }
                }


            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }




    }

}
