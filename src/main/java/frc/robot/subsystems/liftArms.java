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

public class liftArms extends Subsystem {
  Spark liftArms = null;
  Counter motorCounter = null;

  public liftArms() {
    liftArms = new Spark(RobotMap.LIFT_ARMS_PWM);
    motorCounter = new Counter();
    motorCounter.setUpSource(RobotMap.LIFT_ARMS_DIO);
    motorCounter.setUpDownCounterMode();
  }

  public void resetCounter() {
    motorCounter.reset();
  }
  
  public int lowerArm() {
    liftArms.set(RobotMap.LIFT_ARM_DOWN_SPEED);
    return motorCounter.get();
  }

  public int raiseArm() {
    liftArms.set(RobotMap.LIFT_ARM_UP_SPEED);
    return motorCounter.get();
  }

  public void armsStop() {
    liftArms.set(0);
  }

  public int getCount() {
    return motorCounter.get();
  }

  @Override
  public void initDefaultCommand() {
  }
}
