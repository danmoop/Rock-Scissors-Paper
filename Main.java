package testpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main
{
    private static int my_Score = 0;
    private static int robot_Score = 0;
    public static void main(String[] args) throws IOException, InterruptedException
    {
        try {
            while (true)
            {
                Random rand = new Random();
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("1 - for rock, 2 - for scissors, 3 - for paper");
                int input = Integer.parseInt(reader.readLine());

                if (input > 3)
                {
                    System.out.println("You've typed the wrong number (only 1-3)");
                    Thread.sleep(500);
                }

                if (input < 1)
                {
                    System.out.println("You've typed the wrong number (only 1-3)");
                    Thread.sleep(500);
                }
                int robot_input = rand.nextInt(2);

                switch (robot_input)
                {
                    case 0:
                        if (input < 4 && input > 0) {
                            System.out.println("Robot chose rock");
                            if (input == 2)
                            {
                                System.out.println("You chose Scissors");
                                System.out.println("You LOSE");
                                robot_Score++;
                                System.out.println(my_Score + " : " + robot_Score);
                                System.out.println("--------------------");
                            }
                            else if (input == 1)
                            {
                                if (robot_input == 0)
                                    robot_input++;
                                System.out.println("You chose rock");
                                System.out.println("It's a draw");
                                System.out.println(my_Score + " : " + robot_Score);
                                System.out.println("--------------------");
                            }
                            else if (input == 3)
                            {
                                if (robot_input == 0)
                                    robot_input++;
                                System.out.println("You chose paper");
                                System.out.println("You WIN");
                                my_Score++;
                                System.out.println(my_Score + " : " + robot_Score);
                                System.out.println("--------------------");
                            }
                        }
                        break;

                    case 1:
                        if (input > 0 && input < 4)
                        {
                            System.out.println("Robot chose scissors");
                            if (input == 2) {
                                if (robot_input == 0)
                                    robot_input++;
                                System.out.println("You chose scissors");
                                System.out.println("It's draw");
                                System.out.println(my_Score + " : " + robot_Score);
                                System.out.println("--------------------");
                            }
                            else if (input == 1)
                            {
                                if (robot_input == 0)
                                    robot_input++;
                                System.out.println("You chose rock");
                                System.out.println("You WIN");
                                my_Score++;
                                System.out.println(my_Score + " : " + robot_Score);
                                System.out.println("--------------------");
                            }
                            else if (input == 3)
                            {
                                if (robot_input == 0)
                                    robot_input++;
                                System.out.println("You chose paper");
                                System.out.println("You LOSE");
                                robot_Score++;
                                System.out.println(my_Score + " : " + robot_Score);
                                System.out.println("--------------------");
                            }
                        }
                        break;
                    case 2:
                        if (input > 0 && input < 4)
                        {
                            System.out.println("Robot chose paper");
                            if (input == 3)
                            {
                                if (robot_input == 0)
                                    robot_input++;
                                System.out.println("You chose paper");
                                System.out.println("It's a draw");
                                System.out.println(my_Score + " : " + robot_Score);
                                System.out.println("--------------------");
                            }
                            else if (input == 2)
                            {
                                if (robot_input == 0)
                                    robot_input++;
                                System.out.println("You chose scissors");
                                System.out.println("You WIN");
                                my_Score++;
                                System.out.println(my_Score + " : " + robot_Score);
                                System.out.println("--------------------");
                            }
                            else if (input == 1)
                            {
                                if (robot_input == 0)
                                    robot_input++;
                                System.out.println("You chose rock");
                                System.out.println("You LOSE");
                                robot_Score++;
                                System.out.println(my_Score + " : " + robot_Score);
                                System.out.println("--------------------");
                            }
                        }
                        break;
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("You've typed nothing");
            Thread.sleep(500);
            System.out.println("Exiting...");
        }
    }
}