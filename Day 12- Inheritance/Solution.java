class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
       Student(String fname,String lname,int id,int a[])
       {
           super(fname,lname,id);
           this.testScores=a;
           
       }
       
       
    public char calculate()
    {
        
        int s=0;
        for(int i=0;i<testScores.length;i++)
        {
            s=(s+testScores[i]);
           // s=s*(1/2);
        }
       
        
        s=s/testScores.length;
        if(s>=90&&s<=100)
        {
            return 'O';
        }
        if(s>=80&&s<90)
        {
            return 'E';
        }
        if(s>=70&&s<80)
        {
            return 'A';
        }
        if(s>=55&&s<70)
        {
           return 'P';
        }
        if(s>=40&&s<55)
        {
           return 'D';
        }
        if(s<40)
        {
           return 'T';
        }
       
        return ' ';
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
}
