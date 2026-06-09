package chainOfResponsibility.LoggerDP;

public class InfoLogLevel extends LogLevel{

    InfoLogLevel(LogLevel nextlogLevel){
        super(nextlogLevel);
    }
    public void log(LogLevelEnum level,String msg){
        if(level.toString().equals(LogLevelEnum.info.toString())){
            System.out.println(msg);
        }else{
            super.log(level,msg);
        }
    }
}
