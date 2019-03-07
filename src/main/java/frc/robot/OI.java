/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

public class OI {
  public Joystick driveController = new Joystick(RobotMap.OI_DRIVE_JOYSTICK);
  public Joystick functionController = new Joystick(RobotMap.OI_FUNCTION_JOYSTICK);

  Button F1 = new JoystickButton(functionController, 1);
  Button F2 = new JoystickButton(functionController, 2);
  Button F3 = new JoystickButton(functionController, 3);
  Button F4 = new JoystickButton(functionController, 4);
  Button F5 = new JoystickButton(functionController, 5);
  Button F6 = new JoystickButton(functionController, 6);
  Button F7 = new JoystickButton(functionController, 7);
  Button F8 = new JoystickButton(functionController, 8);
  Button D1 = new JoystickButton(driveController, 1);

  public OI() {
    F1.whenPressed(new lowerBoom());
    F2.whileHeld(new testLiftArmU());
    F3.whileHeld(new testLiftArmD());
    F4.whenPressed(new raiseBoom());
    F5.whenPressed(new vacuumBegin());
    F6.whileHeld(new stowRobot());
    F7.whenPressed(new climbUp());
    F8.whenPressed(new climbDown());
    D1.whenPressed(new dropSuction());
  }

  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
