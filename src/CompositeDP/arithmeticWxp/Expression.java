package CompositeDP.arithmeticWxp;

public class Expression implements ArithmeticExp{
    ArithmeticExp leftExp;
    ArithmeticExp rightExp;
    Operation operation;

    public Expression(ArithmeticExp leftExp,ArithmeticExp rightExp, Operation op){
       this.leftExp=leftExp;
       this.rightExp=rightExp;
       this.operation=op;
    }

    public int evaluate(){
        int val=0;
        int left=leftExp.evaluate();
        int right=rightExp.evaluate();
        switch(operation){
            case ADD :
                val=left+right;
                break;
            case SUB:
                val=left-right;
                 break;
            case MUL:
                val=left*right;
                break;
            case DIV:
                val=left/right;
        }
        System.out.println("Evaluated Expression value is:::"+val);
        return val;
    }
}
