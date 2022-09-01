import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() {
        String id = "";
        String firstName = "";
        String secondName = "";

        ArrayList<Person> people = new ArrayList<>();
        ArrayList<String> personInformation = new ArrayList<>();
        StringTokenizer stringTokenizer;

        System.out.println("Enter person: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while(!input.equalsIgnoreCase("done")){
            stringTokenizer = new StringTokenizer(input);
            while(stringTokenizer.hasMoreTokens()){
                String word = stringTokenizer.nextToken();
                personInformation.add(word);
            }

            char[] idInfo = personInformation.get(0).toCharArray();
            for(int i = 0; i < idInfo.length-1; i++){
                id += idInfo[i];
            }
            firstName = personInformation.get(1);
            secondName = personInformation.get(2);

            int idInteger = Integer.parseInt(id);
            Person person = new Person(idInteger, firstName, secondName);
            people.add(person);

            personInformation.clear();
            id = "";
            input = scanner.nextLine();
        }

        for(int i = 0; i < people.size(); i++){
            System.out.println(people.get(i));
        }

    }
}
