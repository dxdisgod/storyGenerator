package mainWork;

import java.util.Random;

public class timeTravel {
    //public String s= new String("");

    public String mainTimeStory()
    {
        Random random=new Random();
        int back_or_forward = random.nextInt(1)%(1-0+1) + 0;
        String s= new String("");
        if(back_or_forward==0)
        {
            s=back_story(s);
        }
        else
        {

        }
        return s;
    }

    public String back_story(String s)
    {
        String backstory=s;

        return s;

    }
}
