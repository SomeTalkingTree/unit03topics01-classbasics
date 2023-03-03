public class TimeV1 {


    
    private int hour;
    private int minute;        
    private int second;
    
    public TimeV1(int Thehours,int Theminutes,int Theseconds){
        hour =  Thehours;
        minute = Theminutes;
        second = Theseconds;
    }
    
    public String toString(){
        String fulltime ="";
        if(hour<10){
            fulltime = fulltime+"0";
        }
            fulltime = fulltime+hour+":";
        if(minute<10){
            fulltime = fulltime+"0";
        }
        fulltime = fulltime+minute+":";
        if(second<10){
            fulltime = fulltime+"0";
        }
        fulltime = fulltime+second;
            
        return fulltime;
    }
    
    
    public int Thehours(){
        return hour;
    }
    public int Theminutes(){
        return minute;
    }
    
    public int Theseconds(){
        return second;
    }
    public static void main(String[] args) {
        TimeV1 d1 = new TimeV1(5,15,19);
        TimeV1 d2 = new TimeV1(6,2,26);
        TimeV1 d3 = new TimeV1(4,9,15);

        TimeV1[] allTimes = new TimeV1[] {d1,d2,d3};
        for(TimeV1 Times:allTimes){
            System.out.println(Times);
        } 
    }
}
//javac TimeV1.java; java TimeV1