class Time2 {

    private int hour;
    private int miniute;
    private int second;
    
    public Time2 (){ //Con0
        
    }
    
    public Time2 (int hour){ //Con1
        
        //this.hour = hour;
        this(hour,0,0);
    }
    
    public Time2 (int hour, int miniute){ //Con2
        
        //this.hour = hour;
        //this.miniute = miniute;
        this(hour,miniute,0);
    }
    
    public Time2 (int hour, int miniute, int second){ //Con3
        
        //this.hour = hour;
        //this.miniute = miniute;
        //this.second = second;
        setHour(hour);
        setMiniute(miniute);
        setSecond(second);
    }
    
    public Time2 (Time2 time){ //Con21
        
        //this.hour = time.getHour();
        //this.miniute = time.getMiniute();
        //this.second = time.getSecond();
        this(time.getHour(), time.getMiniute(), time.getSecond());
    }
    
    public void setHour(int hour){
        
        if (hour<24 && hour>=0)
            this.hour = hour;
    }
    
    public void setMiniute(int miniute){
        if (miniute<60 && miniute>=0)
            this.miniute = miniute;
    }
    
    public void setSecond(int second){
        if (second<60 && second>=0)
            this.second = second;
    }
    
    public int getHour(){
        
        return hour;
    }
    
    public int getMiniute(){
        
        return miniute;
    }
    
    public int getSecond(){
        
        return second;
    }
    
    @Override
    public String toString(){
        
        return String.format("%02d:%02d:%02d", hour, miniute, second);
    }
     
}