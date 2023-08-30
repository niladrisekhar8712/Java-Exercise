import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65,45));
    }
    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "Seconds value must be greater than 0";
        }
        int hours = seconds / 3600;
        int minutes = seconds/60 - hours*60;
        int second = seconds - (hours*60 + minutes)*60;
        StringBuilder sb = new StringBuilder();
        if(hours<10){
            sb.append("0").append(hours).append("h ");
        }
        else sb.append(hours).append("h ");
        if(minutes<10){
            sb.append("0").append(minutes).append("m ");
        }
        else sb.append(minutes).append("m ");
        if(second<10){
            sb.append("0").append(second).append("s");
        }
        else sb.append(second).append("s");
        return sb.toString();
    }
    public static String getDurationString(int minutes, int seconds){
        if(seconds<0 || seconds>59){
            return "Seconds value must be between 0 and 59";
        }
        if(minutes<0){
            return "Minutes value must be greater than 0";
        }
        int hours = minutes/60;
        minutes = minutes - hours*60;
        StringBuilder sb = new StringBuilder();
        if(hours<10){
            sb.append("0").append(hours).append("h ");
        }
        else sb.append(hours).append("h ");
        if(minutes<10){
            sb.append("0").append(minutes).append("m ");
        }
        else sb.append(minutes).append("m ");
        if(seconds<10){
            sb.append("0").append(seconds).append("s");
        }
        else sb.append(seconds).append("s");
        return sb.toString();
    }
}