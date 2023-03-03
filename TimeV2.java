public class TimeV2 {
    private int hour;
    private int minute;        
    private int second;
    
    public TimeV2(int Thehours,int Theminutes,int Theseconds){
        hour =  Thehours;
        minute = Theminutes;
        second = Theseconds;
    }
    
    public String toString(){
        String fulltime ="";
        int thehour = hour*3600;
        int theminutes = minute*60;
        int thesecond = thehour+theminutes+second;
        fulltime+= "00:00:";
        fulltime+= thesecond;
            
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
        TimeV2 d1 = new TimeV2(5,15,19);
        TimeV2 d2 = new TimeV2(6,2,26);
        TimeV2 d3 = new TimeV2(4,9,15);

        TimeV2[] allTimes = new TimeV2[] {d1,d2,d3};
        for(TimeV2 Times:allTimes){
            System.out.println(Times);
        } 
    }
}
//javac TimeV2.java; java TimeV2
