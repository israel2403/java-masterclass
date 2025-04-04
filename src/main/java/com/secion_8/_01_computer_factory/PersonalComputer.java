package com.secion_8._01_computer_factory;

//@Getter
public class PersonalComputer extends Product {

  private ComputerCase computerCase;
  private Monitor monitor;
  private Motherboard motherboard;

  public PersonalComputer(final String model, final String manufacturer, final ComputerCase computerCase,
      final Monitor monitor, final Motherboard motherboard) {
    super(model, manufacturer);
    this.computerCase = computerCase;
    this.monitor = monitor;
    this.motherboard = motherboard;
  }

  private void drawLogo() {
    monitor.drawPixel(1200, 50, "yellow");
  }

  public void powerUp() {
    computerCase.pressPowerButton();
    drawLogo();
  }
}
