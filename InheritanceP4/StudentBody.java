

public class StudentBody
{
    public static void main(String[] args)
    {
        Student[][] studentBody = new Student[3][2];
        studentBody[0][0] = new UnderGrad("Pawat", "Civil Engineering", 14);
        studentBody[0][1] = new UnderGrad("Tin","MacDonalds Janitoring",7);
        studentBody[1][0] = new Graduate("Tadpole","Mech Engineering",12);
        studentBody[1][1] = new Graduate("Sara","Biology",18);
        studentBody[2][0] = new PostGrad("You","A Major \t",11);
        studentBody[2][1] = new PostGrad("Last One\t" , "Can't think of a Major", 10);
        
        for(int r = 0; r < studentBody.length; r++)
        {
            for(int c = 0; c < studentBody[0].length; c++)
            {
                System.out.print(studentBody[r][c] + "\t");
                if(c == 0)
                {
                    System.out.print("||");
                }
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
}
