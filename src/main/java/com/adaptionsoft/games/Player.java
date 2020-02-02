package com.adaptionsoft.games;

/**
 * Created with IntelliJ IDEA.
 * User: lai.yi
 * Date: 2020/2/2
 * Description:
 **/
public class Player {
    private String name;
    public int place = 0;
    public int goldCoin = 0;
    public boolean isInPenaltyBox = false;


    public Player(String name) {
        System.out.println(name + " was added");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void moveTo(int roll) {
        place += roll;
        if (place > 11) {
            place -= 12;
        }
        System.out.println(name + "'s new location is " + place);
    }

    public void gainGoldCoin() {
        goldCoin++;
        System.out.println(name + " now has " + goldCoin + " Gold Coins.");
    }

    public void sendToPenaltyBox() {
        isInPenaltyBox = true;
        System.out.println(name + " was sent to the penalty box");
    }

    private void getOutOfPenaltyBox() {
        isInPenaltyBox = false;
        System.out.println(name + " is getting out of the penalty box");
    }


    public boolean isWin() {
        return goldCoin >= 6;
    }
}
