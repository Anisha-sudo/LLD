package chainOfResponsibility.LoggerDP;

public  abstract class LogLevel {
    LogLevel nextlogLevel=null;
    LogLevel(LogLevel nextlogLevel){
        this.nextlogLevel=nextlogLevel;
    }
    public void log(LogLevelEnum level,String msg){
        if(nextlogLevel!=null){
       nextlogLevel.log(level,msg);}
    }
}
