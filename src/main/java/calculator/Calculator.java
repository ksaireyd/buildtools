package calculator;

public class Calculator {


    public int addByModule(int x,int y,int module){
        return (x+y)%module;
    }

    public int sub(int x,int y){
        return x-y;
    }
    public int multWithModul(int x,int y, int module){
        return (x*y)%module;
    }

    public int divWithModul(int x,int y, int module){
        return (x/y)%module;
    }
}
