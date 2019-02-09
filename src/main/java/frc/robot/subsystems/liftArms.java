/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class liftArms extends Subsystem {
  Spark frontClimbingArm = null;
  Counter frontLiftCounter = null;

  public liftArms() {
    frontClimbingArm = new Spark(RobotMap.CLIMBING_ARMS_FRONT_PWM);
    frontLiftCounter = new Counter();
    frontLiftCounter.setUpSource(RobotMap.CLIMBING_ARMS_FRONT_DIO);
    frontLiftCounter.setUpDownCounterMode();
  }

  public void resetFrontLiftCounter() {
    frontLiftCounter.reset();
  }
  
  public int raiseRobot() {
    frontClimbingArm.set(RobotMap.FRONT_ARM_LIFT_SPEED);
    return frontLiftCounter.get();
  }

  public int lowerRobot() {
    frontClimbingArm.set(RobotMap.FRONT_ARM_LOWER_SPEED);
    return frontLiftCounter.get();
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
