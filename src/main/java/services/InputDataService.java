package services;

import inteface.Callback;
import model.Player;

public class InputDataService {
    //обработка данных от пользователя
    public void getInputKick(int kick, Player player){
        player.getBoxer().setKick(kick);
    }
    public void getInputBlock(int block, Player player){
        player.getBoxer().setBlock(block);
    }



}
