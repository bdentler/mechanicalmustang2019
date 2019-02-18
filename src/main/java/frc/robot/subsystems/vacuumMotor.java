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

/**
 * Add your docs here.
 */
public class vacuumMotor extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  Talon vacMotor = null;

  public vacuumMotor() {
    vacMotor =  new Talon(RobotMap.VACUUM_MOTOR_PWM);
  }

  public void startVacuum() {
    double currentSpeed = vacMotor.getSpeed();
    if (currentSpeed < RobotMap.VACUUM_MOTOR_MAX_SPEED) {
      vacMotor.setSpeed(currentSpeed + RobotMap.VACUUM_MOTOR_SPEED_ADJUST);
    }
  }

  public void stopVacuum() {
    vacMotor.setSpeed(0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
