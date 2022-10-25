public class WordClock extends Clock { int timeZone=0;

    public WordClock(int timeZone) {
        super();
        this.timeZone = timeZone;
    }



    public String getHours(){
        String Hours=String.valueOf(Integer.parseInt(super.getAlarmHour())+timeZone);
        return Hours;
    }
}