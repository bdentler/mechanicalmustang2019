/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Counter;

/**
 * Add your docs here.
 */
public class liftDriveWheel extends Subsystem {
  Spark liftDriveWheel = null;
  Counter liftDriveWheelCount = null;

  public liftDriveWheel() {
    liftDriveWheel = new Spark(RobotMap.LIFT_DRIVE_WHEEL_PWM);
    liftDriveWheelCount = new Counter();
    liftDriveWheelCount.setUpSource(RobotMap.LIFT_DRIVE_WHEEL_DIO);
    liftDriveWheelCount.setUpDownCounterMode();
  }

  public void resetLiftDriveCounter() {
    liftDriveWheelCount.reset();
  }

  public int driveOn() {
    liftDriveWheel.set(RobotMap.LIFT_DRIVE_WHEEL_ON_SPEED);
    return liftDriveWheelCount.get();
  }

  public int driveOff() {
    liftDriveWheel.set(RobotMap.LIFT_DRIVE_WHEEL_OFF_SPEED);
    return liftDriveWheelCount.get();
  }

  public void driveStop() {
    liftDriveWheel.set(0);
  }

  public int getCount() {
    return liftDriveWheelCount.get();
  }

  @Override
  public void initDefaultCommand() {
  }
}
