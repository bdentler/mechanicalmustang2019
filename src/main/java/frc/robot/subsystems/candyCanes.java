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

public class candyCanes extends Subsystem {

  Spark candyCanes = null;
  Counter candyCanesCount = null;

  public candyCanes() {
    candyCanes = new Spark(RobotMap.CANDY_CANE_PWM);
    candyCanesCount = new Counter();
    candyCanesCount.setUpSource(RobotMap.CANDY_CANE_DIO);
    candyCanesCount.setUpDownCounterMode();
  }

  public void resetCount() {
    candyCanesCount.reset();
  }

  public int lowerArm() {
    candyCanes.set(RobotMap.CANDY_CANE_DOWN_SPEED);
    return candyCanesCount.get();
  }

  public int raiseArm() {
    candyCanes.set(RobotMap.CANDY_CANE_UP_SPEED);
    return candyCanesCount.get();
  }

  public void armsStop() {
    candyCanes.set(0);
  }

  public int getCount() {
    return candyCanesCount.get();
  }

  @Override
  public void initDefaultCommand() {
  }
}
