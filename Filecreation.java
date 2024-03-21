import java.io.file;
import java.io.IOExtention;

class FileCreation{

    public static void main(String[] args) {
        File TextFile = new File(pathname: "main.txt");

        try{

            if(textfile.creatNewFile()) {}
            System.out.println("File succesfully!");

        } catch (IOExeption e){
            System.out.println(x:"nag error sya");

        }
    }
}