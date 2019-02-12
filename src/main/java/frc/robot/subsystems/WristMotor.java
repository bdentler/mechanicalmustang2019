/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class WristMotor extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  Spark WristMotor= null;
  public WristMotor() {
    WristMotor=new Spark(RobotMap.WRIST_MOTOR_PWM);
  }
  public void MoveUp() {
    WristMotor.setSpeed(RobotMap.WRIST_MOTOR_UP_SPEED);
  }
  public void MoveDown() {
    WristMotor.setSpeed(RobotMap.WRIST_MOTOR_DOWN_SPEED);
  }
  public void Stop() {
    WristMotor.setSpeed(0);
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
