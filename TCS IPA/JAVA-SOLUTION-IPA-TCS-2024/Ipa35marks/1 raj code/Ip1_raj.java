import java.util.Scanner;
public class Ip1_raj{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int id,quiz,handson;
        String name,admin,str;
        int n=5;
        Course[] course=new Course[n];
        for(int i=0;i<n;i++){
            id=sc.nextInt();sc.nextLine();
            name=sc.nextLine();
            admin=sc.nextLine();
            quiz=sc.nextInt();
            handson=sc.nextInt();
            course[i]=new Course(id,name,admin,quiz,handson);
        }
        sc.nextLine();
        str=sc.nextLine();
        int val=sc.nextInt();
        int val1=findAvgOfQuizByAdmin(course,str);
        if(val1<=0){
            System.out.println("No Course Found");
        }
        else{
            System.out.println(val1);
        }
        Course[] val2=sortCourseByHandson(course, val);
        if(val2.length==0){
            System.out.println("No Course found with mensioned attribute");
        }
        else{
            for(int i=0;i<val2.length;i++){
            System.out.println(val2[i].getname());
            }
        }
        
    }
    /*
     * sortCourseByHandsOn method:
This method will take an Array of Course Objects and int
value as input parameters.
This methods should return an Array of Course objects in an
ascending order of their  handson which are less than the
given handson(int parameter passed) value. if there is no
such course then the method should return null.
     */
    public static Course[] sortCourseByHandson(Course[] course,int val){
        Course[] cour;
        int j=0;
        for(int i=0;i<course.length;i++){
            if(val>course[i].gethanson()){
                cour[j++]=course[i];
            }
        }
        return cour;
    }
    public static int findAvgOfQuizByAdmin(Course[] course,String str){
        int c=0,sum=0;
        for(int i=0;i<course.length;i++){
            if(str.equalsIgnoreCase(course[i].getadmin())){
                c++;
                sum+=course[i].getquiz();
            }
        }
        sum=(sum==0)?0:sum/c;

        return sum;
    }
}

class Course{
    private int courseId,quiz,handson;
    private String coursename,courseadmin;
    public Course(int id,String name,String admin,int quiz,int handson){
        this.courseId=id;
        this.coursename=name;
        this.courseadmin=admin;
        this.quiz=quiz;
        this.handson=handson;
    }
    public int getid(){
        return this.courseId;
    }
    public void setid(int id){
        this.courseId=id;
    }
    public int getquiz(){
        return this.quiz;
    }
    public void setquiz(int quiz){
        this.quiz=quiz;
    }
    public int  gethanson(){
        return this.handson;
    }
    public void sethandson(int hand){
        this.handson=hand;
    }
    public String getname(){
        return this.coursename;
    }
    public void setname(String name){
        this.coursename=name;
    }
    public String getadmin(){
        return this.courseadmin;
    }
    public void setadmin(String ad){
        this.courseadmin=ad;
    }
}