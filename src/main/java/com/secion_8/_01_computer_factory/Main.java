package com.secion_8._01_computer_factory;

public class Main {
  public static void main(String[] args) {
    final ComputerCase theCase = new ComputerCase("220B", "Dell", "240");
    final Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");
    final Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
    final PersonalComputer thePC = new PersonalComputer("220B", "Dell", theCase, theMonitor,
        theMotherboard);

    /*
     * thePC.getMonitor().drawPixel(10, 20, "red");
     * thePC.getMotherboard().loadProgram("Windows OS");
     * thePC.getComputerCase().pressPowerButton();
     */
    thePC.powerUp();
  }
}
