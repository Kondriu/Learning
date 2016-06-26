package dima.homework9;

/**
 * Created by dmitriy on 11.06.16.
 */
public class Student extends Human {
    protected static String studyPlace;
    protected static String classRoom;
    protected static String groupName;
    protected static String status = "Student";

    private String response;

    // constructor - хз
     /*
        this.studyPlace = studyPlace;
        this.classRoom = classRoom;
        this.groupName = groupName;
     */

    protected void setStudyPlace(String sP){
        studyPlace = sP;

    }

    protected void setClassRoom(String cR){
        classRoom = cR;
    }

    protected void setGroupName(String gN){
        groupName =gN;
    }


    protected static String sayStudyPlace (String studyPlace){
        return ("Im study at "+ studyPlace);
    }

    protected static String sayClassRoom (String classRoom){
        return ("my classroom is "+classRoom);
    }
    protected static String sayGroupName (String groupName){
        return ("In group is "+groupName);
    }

    public String getResponse(String question){ // method
        response = question + ", yes, I know, but forgot";
        if ((question != null) && (!question.equals("")))
            return response;
        else
            return "There was no question";
    }

     public void setResponse(String response){
         this.response = response;
     }

    public static String sayAboutSef (){
        return sayStatus(status)+", "+ sayStudyPlace(studyPlace)+", "+sayGroupName(groupName);
    }
    //public static String getName (String n)

/*    public static String studentSayHello(){
        return (Human.humanSayHello(Human.humanSayHello() ));
    }*/

    
    //public static String getClassRoom (String classRoom)


}
