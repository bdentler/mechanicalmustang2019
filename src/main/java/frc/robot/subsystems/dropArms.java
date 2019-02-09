/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.Counter;

/**
 * Add your docs here.
 */
public class dropArms extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  Spark rearClimbingArm = null;
  Counter rearClimbingArmCount = null;

  public dropArms() {
    rearClimbingArm = new Spark(RobotMap.CLIMBING_ARMS_REAR_PWM);
    rearClimbingArmCount = new Counter();
    rearClimbingArmCount.setUpSource(RobotMap.CLIMBING_ARMS_REAR_DIO);
    rearClimbingArmCount.setUpDownCounterMode();
  }

  public void resetRearClimbingArmCount() {
    rearClimbingArmCount.reset();
  }

  public int raiseRobot() {
    rearClimbingArm.set(RobotMap.REAR_ARM_LIFT_SPEED);
    return rearClimbingArmCount.get();
  }

  public int lowerRobot() {
    rearClimbingArm.set(RobotMap.REAR_ARM_LOWER_SPEED);
    return rearClimbingArmCount.get();
  }

  public void armsStop() {
    rearClimbingArm.set(0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
