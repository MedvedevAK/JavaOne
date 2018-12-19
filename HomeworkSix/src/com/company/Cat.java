package com.company;

public class Cat extends Animal {
    @Override
    public boolean run(double run) {
        System.out.print("Сможет пробежать КОТ?");
        return (0 < run && run <=200);
    }

    @Override
    public boolean swim(double swim) {
        System.out.print("Сможет проплыть КОТ?");
        return false;
    }

    @Override
    public boolean jump(double jump) {
        System.out.print("Сможет перепрыгнуть КОТ?");
        return ( 0 < jump  && jump <=2);
    }
}
