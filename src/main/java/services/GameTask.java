package services;

import inteface.Callback;
import model.Player;

public class GameTask implements Runnable {

    private Player p1;
    private Player p2;

    public GameTask(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public void run() {
        //todo
        // p1.getBoxer() vs p2.getBoxer():
        // 1) ждать ввода пользователей;
        // 2) обработать ввод;
        // 3) записать результаты;
        /*Callback callback = () -> {
            return ;
        };*/

        //System.out.println(callback);
    }

}
