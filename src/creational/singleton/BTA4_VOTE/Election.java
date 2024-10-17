package creational.singleton.BTA4_VOTE;

import java.util.List;

public class Election {
    private static Election instance = new Election();
    private int trump = 0;
    private int biden = 0;
    private List<String> Users;
    private Election() {

    }
    public static Election getInstance() {
        if (instance == null) {
            instance = new Election();
        }
        return instance;
    }

    public void vote (Candidate candidate,String userName) {
        if (Users.contains(userName)) {
            System.out.println(userName + " already voted");
            return;
        }
        Users.add(userName);
        switch (candidate){
            case Biden -> biden++;
            case Trump -> trump++;
        }
    }
    public void result(){
        System.out.println("Trump: " + trump + "vote");
        System.out.println("Biden: " + biden + "vote");
    }
}
