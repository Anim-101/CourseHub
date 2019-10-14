import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaWordNumberTextString
{
    public static void main(String [] args)
    {
        try
        {
            String line;

            int count = 0;

            FileReader file = new FileReader("data.txt");

            BufferedReader br = new BufferedReader(file);

            try
            {
                while((line = br.readLine()) != null)
                {
                    String words [] = line.split(" ");

                    count = count + words.length;
                }
            }
            catch(IOException ex)
            {

            }

            System.out.println("Number of Words Present in given file: " + count);

            try
            {
                br.close();
            }
            catch(IOException ex)
            {

            }
        }
        catch(FileNotFoundException ex)
        {

        }
        
    }
}