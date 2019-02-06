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

/**
 * Add your docs here.
 */
public class liftDriveWheel extends Subsystem {
  Spark liftDriveWheel = null;

  public liftDriveWheel() {
    liftDriveWheel = new Spark(RobotMap.LIFT_DRIVE_WHEEL_PWM);
  }

  public void driveOn() {
    liftDriveWheel.set(RobotMap.LIFT_DRIVE_WHEEL_SPEED);
  }

  public void driveOff() {
    liftDriveWheel.set(-RobotMap.LIFT_DRIVE_WHEEL_SPEED);
  }

  public void driveStop() {
    liftDriveWheel.set(0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
