/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Counter;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class boomMotor extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  Spark boomMotor = null;
  Counter boomCounter = null;

  public boomMotor() {
    boomMotor = new Spark(RobotMap.BOOM_MOTOR_PWM);
    boomCounter = new Counter();
    boomCounter.setUpSource(RobotMap.BOOM_ARM_DIO);
    boomCounter.setUpDownCounterMode();
  }

  public void resetBoomCounter() {
    boomCounter.reset();
  }

  public int getBoomCount() {
    return boomCounter.get();
  }

  public int liftBoom() {
    boomMotor.setSpeed(RobotMap.BOOM_MOTOR_RAISE_SPEED);
    return boomCounter.get();
  }

  public int dropBoom() {
    boomMotor.setSpeed(RobotMap.BOOM_MOTOR_LOWER_SPEED);
    return boomCounter.get();
  }

  public void moveBoom(double boomMoveSpeed) {
    boomMotor.setSpeed(boomMoveSpeed);
  }

  public void stopBoomMotor() {
    boomMotor.setSpeed(0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
