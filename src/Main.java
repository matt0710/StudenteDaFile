import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static LinkedList<String> getDataFromFile(String path) throws FileNotFoundException, IOException {

        BufferedReader reader = new BufferedReader(new FileReader(path));
        LinkedList<String> list = new LinkedList<>();
        String str = reader.readLine();

        for(int i=0; i<3; i++){
            list.add(str);
            str = reader.readLine() + "\n";
        }

        reader.close();

        return list;
    }


    public static Studente createStudente(String path) throws FileNotFoundException, IOException, BadMatricolaException{
        File file = new File(path);
        if (file.exists() && file.isFile()) {

            LinkedList<String> lista = getDataFromFile(path);

            Studente studente = new Studente(lista.get(0), lista.get(1), null);
            if (lista.get(2).charAt(0) == 'M')
                studente.setMatricola(lista.get(2));
            else
                throw new BadMatricolaException();
            return studente;
        }
        else if (file.isDirectory()){
            BufferedWriter writer = null;
            String[] directory = file.list();
            File fileDaScrivere = new File(path + "out.txt");
            writer = new BufferedWriter(new FileWriter(fileDaScrivere));
            Studente studente = new Studente();
            String s = "";

            for (int i=0; i<directory.length; i++){
                writer.write(directory[i] + "\n");
                s += directory[i] + "\n";
            }
            studente.setNome(s);
            writer.close();
            return studente;
        }
        else
            throw new FileNotFoundException();
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String path1 = "";
        String path2 = "";
        String path3 = "";
        Studente[] arrayStudenti = new Studente[3];

        System.out.println("Inserisci la path1: ");
        path1 = sc.nextLine();
        System.out.println("Inserisci la path2: ");
        path2 = sc.nextLine();
        System.out.println("Inserisci la path3: ");
        path3 = sc.nextLine();

        try{

            arrayStudenti[0] = createStudente(path1);
            arrayStudenti[1] = createStudente(path2);
            arrayStudenti[2] = createStudente(path3);

            for(int i=0; i<3; i++){
                System.out.println(arrayStudenti[i]);
            }

        }catch(FileNotFoundException fnf){
            System.out.println("fnf");
        }
        catch (IOException io){
            System.out.println("io");
        }
        catch (BadMatricolaException bad){
            System.out.println("bad");
        }

    }
}
