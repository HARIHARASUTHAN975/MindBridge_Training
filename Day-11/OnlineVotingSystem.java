import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class OnlineVotingSystem {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        ConcurrentMap<String,Integer> vote=new ConcurrentHashMap<>();
        System.out.println("Voting System");
        System.out.println("1.Add Candidate");
        System.out.println("2.vote for a Candidate");
        System.out.println("3.Display the VOtes");
        System.out.println("4.Exit");
        while(true)
        {
            System.out.print("Enter your Choice: ");
            int option=obj.nextInt();
            switch(option)
            {
                case 1:
                    System.out.println("Enter the Candidate Name to add");
                    String candidate=obj.next();
                    if(vote.putIfAbsent(candidate,0)==null)
                    {
                        System.out.println(candidate+" has Been Added. ");
                    }
                    else {
                        System.out.println(candidate+" is already Exist");
                    }
                    break;
                case 2:
                    System.out.println("Enter the Candidate Name to Vote");
                    String tovote=obj.next();
                    if(vote.containsKey(tovote))
                    {
                        vote.put(tovote,vote.get(tovote)+1);
                        System.out.println("Your Vote Has been added");
                    }
                    else {
                        System.out.println("You have Entered Invalid Candidate Name");
                    }
                    break;
                case 3:
                    System.out.println("Vote Count");
                    if(vote.isEmpty())
                        System.out.println("No Votes are Received by any Candidate");
                    else
                        for(String key : vote.keySet())
                        System.out.println(key + " : "+vote.get(key));
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Enter a Valid Choice");
            }

        }
    }
}
