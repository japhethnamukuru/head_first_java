package demo;

public class DrumKitTestDrive {
    public static void main(String [] args) {
        DrumKit d = new DrumKit();
        
        d.snare = false;
        
        if (d.snare == true) {
         d.playSnare();
         }
        
        d.playSnare();
        d.playTopHat();




    }
}
