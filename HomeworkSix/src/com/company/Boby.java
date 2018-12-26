package com.company;

public class Boby extends Dog{
    @Override
    public boolean run (double run) {
        System.out.print("Сможет пробежать Boby?");
        return (0 < run && run < random_number);

    }

    @Override
    public boolean swim(double swim) {
        System.out.print("Сможет проплыть Boby?");
        return (swim > 0 && swim <= 10);
    }

    @Override
    public boolean jump(double jump) {
        System.out.print("Сможет перепрыгнуть Boby?");
        return (jump > 0 && jump < 0.5 );
    }
}
