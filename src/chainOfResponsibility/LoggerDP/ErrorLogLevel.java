package chainOfResponsibility.LoggerDP;

public class ErrorLogLevel extends LogLevel{

    ErrorLogLevel(LogLevel nextlogLevel){
        super(nextlogLevel);
    }
    public void log(LogLevelEnum level,String msg){
        if(level.toString().equals(LogLevelEnum.error.toString())){
            System.out.println(msg);
        }else{
            super.log(level,msg);
        }
    }
}
