public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int themonth,int theday,int theyear){
        month =  themonth;
        day = theday;
        year = theyear;
    }

    public String toString(){
        String fulldate ="";
        if(month<10){
            fulldate = fulldate+"0";
        }
            fulldate = fulldate+month+"/";
        if(day<10){
            fulldate = fulldate+"0";
        }
        fulldate = fulldate+day+"/";
        if(year<10){
            fulldate = fulldate+"000";
        }else if(year<100){
            fulldate = fulldate+"00";
        }else if(year<1000){
            fulldate = fulldate+"0";
        }
        fulldate = fulldate+year;
        
        return fulldate;
    }


    public int TheDay(){
        return day;
    }

    public int TheMonth(){
        return month;
    }

    public int TheYear(){
        return year;
    }





    public static void main(String[] args) {
        Date d1 = new Date(5,15,1925);
        Date d2 = new Date(6,2,2016);
        Date d3 = new Date(4,9,15);

        Date[] allDates = new Date[] {d1,d2,d3};
        for(Date Dates:allDates){
            System.out.println(Dates);
        } 
        
    }
}

// javac Date.java; java Date

// nicely coded and tested