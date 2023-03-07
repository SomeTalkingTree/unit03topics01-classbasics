public class TimeV2 {
    private int alltime;
    
    public TimeV2(int Thehours,int Theminutes,int Theseconds){
        alltime +=  Thehours*3600;
        alltime += Theminutes*60;
        alltime += Theseconds;
    }
    
    public String toString(){
        String fulltime ="";
        int totaltime = alltime;
        
        int placenum =0;
        int totalhour = alltime/3600;
        placenum = alltime%3600;
        totaltime = totaltime-(totalhour*3600)+(totaltime%3600);
        int totalminute = totaltime/60;
        totaltime = totaltime-(totalminute*60)+(totaltime%60);
        int totalsecond = totaltime;
        if(totalsecond>59){
            totalminute++;
            totalsecond-=60;
        }
        if(totalminute>59){
            totalhour++;
            totalminute-=60;
        }
        

        if(totalhour<10){
            fulltime = fulltime+"0";
        }
            fulltime = fulltime+totalhour+":";
        if(totalminute<10){
            fulltime = fulltime+"0";
        }
        fulltime = fulltime+totalminute+":";
        if(totalsecond<10){
            fulltime = fulltime+"0";
        }
        fulltime = fulltime+totalsecond;
            
        return fulltime;
    }
    
    
    public int Thehours(){
        return alltime;
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
