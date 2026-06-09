package chainOfResponsibility.LoggerDP;

public class DebugLogLevel extends LogLevel{

    DebugLogLevel(LogLevel infoLogLevel){
        super(infoLogLevel);
    }
    public void log(LogLevelEnum level,String msg){
        if(level.toString().equals(LogLevelEnum.debug.toString())){
            System.out.println(msg);
        }else{
            super.log(level,msg);
        }
    }
}
