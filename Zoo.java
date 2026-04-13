package marlinR;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Zoo {

    static int hyena = 0;
    static int lion = 0;
    static int tiger = 0;

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Welcome to the Zoo database!");

        Scanner nam = new Scanner(new File("C:\\Users\\marli\\Downloads\\animalNames.txt"));
        Scanner doc = new Scanner(new File("C:\\Users\\marli\\Downloads\\arrivingAnimals.txt"));
        ArrayList<String> Animals = new ArrayList<String>();
        while (nam.hasNextLine()) {
            Animals.add(nam.nextLine());
        }

        PrintWriter write = new PrintWriter("zooPopulation.txt");
        boolean hy = false;
        boolean li = false;
        boolean ti = false;
        boolean be = false;

        String species = "";
        String sex = "";
        String color = "";
        int weight = 0;
        String from = "";

        while (doc.hasNextLine()) {
            String sep = doc.nextLine();
            String[] part = sep.split(",");

            String frs = part[0];
            String sn = part[1];
            String cl = part[2];
            String wt = part[3];
            String frm = part[4];

            String[] space = frs.split("");
            int age = Integer.parseInt(space[0]);
            sex = space[3];
            species = space[4];
            color = cl.replace("color", "");
            from = frm.replace("from", "");
            weight = Integer.parseInt(wt.replaceAll("[^0-9]", ""));

        }

//        String species = "";
//        String sex = "";
//        String color = "";
//        int weight = 0;
//        String from = "";

        Animal ani = new Animal();
        ani.species = species;
        ani.sex = sex;
        ani.color = color;
        ani.weight = weight;
        ani.from = from;


        if (species.equalsIgnoreCase("hyena")) {
            if (!hy) {
                write.println("Hyena Habitat: ");
                hy = true;
            }
            write.println(ani);
        }

//            write.println(
//                    ani.id + ";" + ani.age + ";" + ani.name + "; birthDate: " + ani.color + ";"
//                            + ani.sex + ";" + ani.weight + " pounds ; from" + ani.from
//                            + "; arrived");

//    Hy01; 4 years old; Zig; birthDate: 2020-03-21; tan color; female; 70
//    pounds; laugh: haha; from:  Friguia Park, Tunisia; arrived: 2024-04-07


//        ani.BirthDay = genBirthDay(age, season);

    }
    }