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

/**
 * Add your docs here.
 */
public class liftArms extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  Spark frontClimbingArm = null;

  public liftArms() {
    frontClimbingArm = new Spark(RobotMap.CLIMBING_ARMS_FRONT);
  }

  public void raiseRobot() {
    frontClimbingArm.set(RobotMap.FRONT_ARM_LIFT_SPEED);
  }

  public void lowerRobot() {
    frontClimbingArm.set(RobotMap.FRONT_ARM_LOWER_SPEED);
  }

  public void armsStop() {
    frontClimbingArm.set(0);
  }
  
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
