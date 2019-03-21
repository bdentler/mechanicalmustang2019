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

public class wristMotor extends Subsystem {

  Spark wristMotor = null;
  Counter wristMotorCounter = null;

  public wristMotor() {
    wristMotor = new Spark(RobotMap.WRIST_MOTOR_PWM);
    wristMotorCounter = new Counter();
    wristMotorCounter.setUpSource(RobotMap.WRIST_MOTOR_DIO);
    wristMotorCounter.setUpDownCounterMode();
  }

  public void resetCounter() {
    wristMotorCounter.reset();
  }

  public int getCount() {
    return wristMotorCounter.get();
  }

  public int wristUp() {
    wristMotor.set(RobotMap.WRIST_MOTOR_UP_SPEED);
    return wristMotorCounter.get();
  }

  public int wristDown() {
    wristMotor.set(RobotMap.WRIST_MOTOR_DOWN_SPEED);
    return wristMotorCounter.get();
  }

  public int moveWrist(double moveSpeed) {
    wristMotor.set(moveSpeed);
    return wristMotorCounter.get();
  }

  public void stopMotor() {
    wristMotor.set(0);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new trimWrist());
  }
}
