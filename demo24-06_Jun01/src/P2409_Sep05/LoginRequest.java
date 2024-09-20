package P2409_Sep05;

public class LoginRequest extends Thread{
    int count;
    String name;

    public LoginRequest(String name, int count){
        this.name = name;
        this.count = count;
    }

    //run is a reserved keyword?
    public void run(){
        for (int i = 0; i < count; i++) {
            System.out.println("Thread: " + name + ", iteration: " + i);
        }
    }
}
