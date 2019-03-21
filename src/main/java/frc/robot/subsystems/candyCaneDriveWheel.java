/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Counter;

public class candyCaneDriveWheel extends Subsystem {

  Talon candyCaneDrive = new Talon(RobotMap.CANDY_CANE_DRIVE_WHEEL_PWM);
  Counter motorCounter = new Counter();

  public candyCaneDriveWheel() {
    motorCounter.setUpSource(RobotMap.CANDY_CANE_DRIVE_DIO);
    motorCounter.setUpDownCounterMode();
  }

  public void resetCounter() {
    motorCounter.reset();
  }

  public int driveOn() {
    candyCaneDrive.set(RobotMap.CANDY_CANE_DRIVE_ON_SPEED);
    return motorCounter.get();
  }

  public int driveOff() {
    candyCaneDrive.set(RobotMap.CANDY_CANE_DRIVE_OFF_SPEED);
    return motorCounter.get();
  }

  public void stopMotor() {
    candyCaneDrive.set(0);
  }

  public int getCount() {
    return motorCounter.get();
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
