/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lcd;

/**
 *
 * @author User
 */
public class LCD {
       // Status LCD
    private String status;

    // Volume LCD
    private int volume;

    // Brightness LCD
    private int brightness;
  

    // Jenis kabel yang digunakan
      private String kabel;
  
   // Mengatur status LCD
    public void setStatus(String status) {
        this.status = status;
    }

    // Mengatur volume LCD
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    // Metode untuk mematikan LCD
    public void turnOff() {
        setStatus("Mati");
    }

    // Metode untuk menyalakan LCD
    public void turnOn() {
        setStatus("Menyala");
    }

    // Metode untuk memfreeze LCD
    public void Freeze() {
        setStatus("Freeze");
    }

    // Metode untuk menaikkan volume
    public void volumeUp() {
        volume++;
    }

    // Metode untuk menurunkan volume
    public void volumeDown() {
        volume--;
    }

    // Metode untuk menaikkan kecerahan
    public void brightnessUp() {
        brightness++;
    }

    // Metode untuk menurunkan kecerahan
    public void brightnessDown() {
        brightness--;
    }

    // Mengatur kecerahan LCD
    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }


    // Mengatur kabel yang digunakan
    public void setCable(int option) { 
    String[] cables = {"VGA", "Display Port" , "HDMI"}; 
    this.kabel = cables[option];
  

}
    
    public void displayMessage() {
        System.out.println("LCD Status: " + status);
        System.out.println("Volume: " + volume);
        System.out.println("Brightness: " + brightness);
        System.out.println("Cable: " + kabel);
}
}
