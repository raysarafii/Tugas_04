/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lcd;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LCD lcd = new LCD();
        lcd.turnOff();
        lcd.turnOn();
        lcd.Freeze();
        lcd.setVolume(50);
        lcd.volumeUp();
        lcd.setBrightness(39);
        lcd.brightnessDown();
        lcd.setCable(2);

        lcd.displayMessage();
    }
    
}
