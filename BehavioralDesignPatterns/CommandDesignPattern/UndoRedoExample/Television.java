package CommandDesignPattern.UndoRedoExample;

public class Television {

    int totalChannel;
    int currChannel;

    public Television(int totalChannel) {
        this.totalChannel = totalChannel;
        this.currChannel = 0;
    }

    public void nextChannel() {

        System.out.println("Current Channel: "+ currChannel);

        currChannel += 1;

        if (currChannel >= totalChannel) {
            currChannel = currChannel % totalChannel;
        }

        System.out.println("Current Channel now :" + currChannel);
    }

    public void prevChannel() {

        System.out.println("Current Channel :" + currChannel);

        currChannel -= 1;

        if (currChannel < 0) {
            currChannel = currChannel + totalChannel;
        }

        System.out.println("Current Channel now :" + currChannel);
    }

   
}
