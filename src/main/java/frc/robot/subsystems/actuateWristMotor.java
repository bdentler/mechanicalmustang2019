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
import frc.robot.commands.trimWrist;

/**
 * Add your docs here.
 */
public class actuateWristMotor extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  Spark actuateWristMotor = null;
  Counter wristMotorCounter = null;

  public actuateWristMotor() {
    actuateWristMotor = new Spark(RobotMap.WRIST_MOTOR_PWM);
    wristMotorCounter = new Counter();
    wristMotorCounter.setUpSource(RobotMap.WRIST_MOTOR_DIO);
    wristMotorCounter.setUpDownCounterMode();
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new trimWrist());
  }

  public void resetWristCounter() {
    wristMotorCounter.reset();
  }

  public int getWristCount() {
    return wristMotorCounter.get();
  }

  public int raiseWrist() {
    actuateWristMotor.setSpeed(RobotMap.WRIST_MOTOR_UP_SPEED);
    return wristMotorCounter.get();
  }

  public int lowerWrist() {
    actuateWristMotor.setSpeed(RobotMap.WRIST_MOTOR_DOWN_SPEED);
    return wristMotorCounter.get();
  }

  public void moveWrist(double moveSpeed) {
    actuateWristMotor.setSpeed(moveSpeed);
  }

  public void stopMotor() {
    actuateWristMotor.setSpeed(0);
  }
}
