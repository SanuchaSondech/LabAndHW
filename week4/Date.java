class Date {
    
    private int day;
    private int month;
    private int year;
    
    public Date (int day, int month, int year){ //Con
        
        setDay(day);
        setMonth(month);
        setYear(year);
    }
    
    public int gatDay(){
        
        return day;
    }
    
    public int gatMonth(){
        
        return month;
    }
    
    public int gatYear(){
        
        return year;
    }
    
    public void setDay(int day){
        
        if (day<=31 && day>=1)
            this.day = day;
    }
    
    public void setMonth(int month){
        
        if (month<=12 && month>=1)
            this.month = month;
    }
    
    public void setYear(int year){
        
        if (year<=9999 && year>=1900)
            this.year = year;
    }
    
    public void setDate(int day, int month, int year){
        
        setDay(day);
        setMonth(month);
        setYear(year);

    }
    
    @Override
    public String toString(){
        
         return String.format("%02d/%02d/%04d", day, month, year);
    }
    
}
