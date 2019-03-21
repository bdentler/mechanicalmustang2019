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

public class liftArmsUp3 extends Command {

  boolean countReached = false;

  public liftArmsUp3() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.m_liftArms);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.m_liftArms.resetCounter();
    countReached = false;
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if (Robot.m_liftArms.raiseArm() >= RobotMap.LIFTARM_UP_COUNT3) {
      countReached = true;
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return countReached;
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