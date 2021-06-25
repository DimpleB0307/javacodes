class Speaker {
    public static String brandName = "JBL";
    public static String color = "Black";
    public static int minVolumeLevel = 0;
    public static int currentVolume = 0;
    public static int maxVolumeLevel = 8;
    public static boolean connected;

    public static void onOrOff() {
        // System.out.println("inside onOrOff() method");
        if (connected == false) {
            connected = true;
            System.out.println("Speaker is turned On");
        } else if (connected == true) {
            connected = false;
            System.out.println("Speaker is turned off");
        }
    }

    public static int increaseVolume() {
        if (connected == true) {
            if (currentVolume < minVolumeLevel) {
                currentVolume = currentVolume + 1;
                System.out.println("The Current volume is:" + currentVolume);
            } else {
                System.out.println("min volume reached");
            }
        } else {
            System.out.println("speaker is off ");
        }
        return currentVolume;
    }

    public static int decreaseVolume() {
        if (connected == true) {
            if (currentVolume >= maxVolumeLevel) {
                currentVolume = currentVolume - 1;
                System.out.println("The Current volume is:" + currentVolume);
            } else {
                System.out.println("max volume reached");
            }
        } else {
            System.out.println("speaker is off ");
        }
        return currentVolume;
    }

    public static void main(String args[]) 
	{
        onOrOff();
        int vol = increaseVolume();
        System.out.println(vol);
        increaseVolume();
        decreaseVolume();
    }
}