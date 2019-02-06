/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.Counter;

public class liftRobotFront extends Command {

  Counter frontLiftCounter = null;
  boolean isCountReached = false;

  public liftRobotFront() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.m_liftArms);
    frontLiftCounter = new Counter();
    //setTimeout(RobotMap.FRONT_ARM_TIME);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    frontLiftCounter.setUpSource(RobotMap.CLIMBING_ARMS_FRONT_DIO);
    frontLiftCounter.setUpDownCounterMode();
    frontLiftCounter.reset();
    isCountReached = false;
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.m_liftArms.raiseRobot();
    if (frontLiftCounter.get() >= RobotMap.FRONT_LIFT_COUNTER_COUNT) {
      isCountReached = true;
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return isTimedOut();
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.m_liftArms.armsStop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
