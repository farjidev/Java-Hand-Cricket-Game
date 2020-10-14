import java.io.*;
class Playing_Hand_Cricket_Against_Computer

{

    public static void main(String args[])throws IOException

    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String name; // to accept the player's name;
        int aa; // converting the random real number generated by 'rr' into a random whole number run for the computer;
        int ii; // used in for loops;
        int playerno; // to accept the player's number;
        double rr; // to generate a random real number;
        int cheat; // to end the game if wrong input is entered; to keep a check whilst the game is running as to whether the game has ended or not;
        int score1; // to store the latest runs scored by the player;
        int score2; // to store the latest runs scored by the computer;
        int c; // used in for loops to create a specific design;
        int choice; // used to decide whether the game needs to be ended or restarted;
        int inf=1; // used to keep the game running until the player decides to end the game
        System.out.println("| WELCOME TO THE HAND CRICKET GAME |");
            System.out.println("");
            System.out.print("Enter Your Name: \n");
            name=br.readLine();

            System.out.println("Hello "+name+",");
            System.out.println(".");
            System.out.println("WELCOME TO THE HAND CRICKET-MANIA");
            System.out.println(".");
            System.out.println("Instructions:");
            System.out.println(".");
            System.out.println("This Game Is Similar To The Hand-Cricket Game Played By Kids.");
            System.out.println(".");
            System.out.println("There Is No Limit On The Number Of Balls.");
            System.out.println(".");
            System.out.println("You Will First Bat. Enter Any Number From 1 To 10.");
            System.out.println(".");
            System.out.println("Enter The Numbers Carefully Without Making Any Mistake.");
            System.out.println(".");
            System.out.println("If The Number Entered By The Computer Is Same As The Number Entered By You,");
            System.out.println("You Will Be Declared As Out.");
            System.out.println(".");
            System.out.println("Your Final Score Will Be The Sum Of The Numbers You Entered Before Getting Out.");
            System.out.println(".");
            System.out.println("After Getting Out, You Will Have To Bowl.");
            System.out.println(".");
            System.out.println("Try To Enter A Number Similar To The Number Entered By The Computer.");
            System.out.println(".");
            System.out.println("If The Sum Of Numbers Entered By The Computer Becomes More Than Your Score, It Will Win.");
            System.out.println(".");
            System.out.println("But If You Enter A Number Same As The Number Entered By The Computer, You Can Win!");
            System.out.println(".");
            System.out.println("====================================");

        while(inf>0)
        {
            name=" ";
            aa=0;
            ii=0;
            playerno=0;
            rr=0;
            cheat=0;
            score1=0;
            score2=0;
            c=0;
            choice=0;
            inf=1;

            System.out.println("YOU ARE BATTING:");

            for(ii=1;ii>0;ii++)
            {
            System.out.println("");
            System.out.print("Enter Your Number:\n");
            playerno=Integer.parseInt(br.readLine());
            rr=((Math.random())*10);
            rr=rr+1;
            aa=(int)(rr);
            System.out.println("");
            System.out.println("Computer's Number: "+aa);
            System.out.println("");
            System.out.println("**********");
            System.out.println("");

            if(playerno==aa)
            {
                System.out.println("You are out and now it is Computer's Turn!");
                System.out.println("YOUR FINAL SCORE = "+score1);
                System.out.println(" ");
                break;
            }

            else if(playerno>0&&playerno<=10)
            {
                score1=score1+playerno;
            } else if(playerno>10||playerno<=0)
            {
                System.out.println("You have either tried to cheat or entered a wrong input. Game Over!");
                cheat++;
                break;
            }

            System.out.println("Your Current Score Is "+score1);;
        }

            for(c=0;c<=2;c++) {
                if(cheat>0)
            {
                break;
            }
                if(c<=0) {
                    System.out.println("====================================");
                }
            }

            for(c=0;c<1;c++) { if(cheat>0)
            {
                break;
            }
                System.out.println("YOU ARE BOWLING:");
            }

            for(c=0;c<=2;c++) { if(cheat>0)
            {
                break;
            }
                if(c<=0) {
                    System.out.println("====================================");
                }
            }

            for(ii=1;ii>0;ii++)
            {
                if(cheat>0)
                {
                    break;
                }

                System.out.println("");
                System.out.print("Enter Your Number:\n ");
                playerno=Integer.parseInt(br.readLine());
                rr=((Math.random())*10);
                rr=rr+1;
                aa=(int)(rr);
                System.out.println("");
                System.out.println("Computer's Number: "+aa);
                System.out.println("");
                System.out.println("**********");
                System.out.println("");

                if(aa==playerno)
                {
                    System.out.println(" ");
                    System.out.println("COMPUTER IS OUTT!!!!");
                    System.out.println(" ");
                    System.out.println("XXXXXXXXXXXXXXX");
                    System.out.println("COMPUTER'S FINAL SCORE = "+score2);
                    System.out.println("XXXXXXXXXXXXXXX");
                    System.out.println(" ");
                    break;
                }

                else if(playerno>0&&playerno<=10) { score2=score2+aa; } else if(playerno>10||playerno<=0)
                {
                   System.out.println("====================================");
                   System.out.println("You have either tried to cheat or entered a wrong input. Game Over!");
                   cheat++; break; }
                if(score2>score1)
            {
                System.out.println(" ");
                System.out.println("THE COMPUTER HAS SCORED MORE THAN YOUU!!!");
                System.out.println(" ");
                System.out.println("################");
                System.out.println("COMPUTER'S FINAL SCORE = "+score2);
                System.out.println("################");
                System.out.println(" ");
                break;
            }

                System.out.println("Computer's Current Score Is "+score2);
                System.out.println("");
                System.out.println("**********");
            }

            for(c=0;c<=2;c++) { if(cheat>0)
            {
                break;
            }

            }

            for(ii=0;ii<1;ii++) { if(cheat>0)
            {
                break;
            }

                System.out.println(" ");
                System.out.println("YOUR FINAL SCORE = "+score1);
                System.out.println("COMPUTER'S FINAL SCORE = "+score2);
                System.out.println(" ");

                if((score1)>(score2))
                {
                    System.out.println("Congratulations "+name+"!! You Have Defeated The Computer!!");
                }

                else if((score1)<(score2))
                {
                    System.out.println("Sorry "+name+", But The Computer Has Defeated You..!");
                }

                else
                {
                    System.out.println("Tie");
                }

            }
            System.out.println("Enter 1 To Play This Game Again.");
            System.out.println();
            System.out.println("Enter 0 Or Any Other Number To Quit.");
            choice=Integer.parseInt(br.readLine());

            if(choice==1)
            {
                System.out.print('\f');
            }

            else
            {
                System.out.print('\f');
                System.out.println("Thank You");
                break;
            }

        }
    }
}
