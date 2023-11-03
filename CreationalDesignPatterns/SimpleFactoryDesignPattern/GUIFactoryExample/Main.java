package SimpleFactoryDesignPattern.GUIFactoryExample;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] env = { "Windows OS", "Web Browser", "Android OS", "Mac OS" };

        Scanner sc = new Scanner(System.in);

        try {

            int selectedIndex = -1;

            do {

                System.out.println("Please select options(1 to 4) get Button:");

                for (int i = 0; i < env.length; i++) {

                    System.out.println((i + 1) + ") " + env[i]);
                }
                selectedIndex = sc.nextInt();
                if(selectedIndex < 1 || selectedIndex > 4){
                    System.out.println("Incorrect option selected!");

                }else{
                    break;
                }

            } while (true);

            ButtonFactory bFactory = new ButtonFactory();
            Button button = bFactory.getButton(env[selectedIndex-1]);

            button.render();



        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sc.close();
        }
    }

}
